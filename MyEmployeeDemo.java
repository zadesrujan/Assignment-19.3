package employee;
//here we cretaed package as employee which that organizes a set of related classes and interfaces.
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class myEmployee{ 
	//created class Employee
	 String name; 
	 //created three properties 
	// String will refer set of characters
	 int salary;
	//int is datatype which consists of integer
	 String designation;
	 
	 public myEmployee ( String name, int salary ,String designation){ 
	//created constructor and passing three properties
		 this.name=name;
//this will refer current object 
		 this.salary=salary;
		 this.designation=designation;
		 
	 }
//Get methods provide access to the value a variable holds while 
//set methods assign values to the variables of the objects.
  public String getName(){          
	  //creating the set and get methods  
	  return name;
	  //return the value
  }
  public void setName(String name){
	  this.name= name;
	  //this refers to the current object
  }
  public int getSalary(){
	  return salary;
  }
  public void setSalary(int salary){
	  this.salary= salary;
  }
  public String getDesignation(){
	  return designation;
  }
  public void setDesignation(String designation){
	  this.designation=designation;
  }
  public String toString(){
	  //This method returns itself a string.
      return "Name: "+this.name+" Salary: "+this.salary+"DEsignation: "+this.designation;
  }
 }
//implements means you are using the elements of a Java Interface in your class. 
//Java Comparable interface is used to order the objects of user-defined class
 
      class MyEmployeeCom implements Comparator <myEmployee>{ 
    	  //creating an interface which implements comparator 
    	  public int compare(myEmployee o1, myEmployee o2)
    	  {
    	        int flag = o1.getSalary() - o2.getSalary();
    	        if(flag==0) flag = o1.getName().compareTo(o2.getName());
    	        return flag;
    	    }
      }
    	  
  abstract class EmployeeComparator implements Comparator<myEmployee>{       
	  //here it checks the as per salary and it sorts as per salary
    	  public int compare (myEmployee o1,myEmployee o2)
    	  //compare will compare the two values
    	  {
    		  if (o1.getSalary()> o2.getSalary())
    			  return 1;
    		  else if (o1.getSalary()<o2.getSalary())
    			  return -1;
    		  else {
    		//even the names need to ne compared
    			  int nameDiff =o1.getName().compareTo(o2.getName());
    			  if (nameDiff ==0)
    		//return the designation values
     		  return o2.getDesignation().compareTo(o2.getDesignation());
    				  else 
    					  return nameDiff;
    			  
    		  }
    	  }
      }

public class MyEmployeeDemo {  
	public static void main(String[] args)
 
	{     
		//created main method
		//create an object 
		TreeSet<myEmployee> namelist = new TreeSet <myEmployee>(new MyEmployeeCom()); 
		//created in treeset object
		
		namelist.add(new myEmployee("mohan",60000,"manager"));                  
		//created objects in for the employee class and initialized the values
		namelist.add(new myEmployee("mounika",650000," Senior manager"));
		namelist.add(new myEmployee("manisha",55000," assistant manager"));
		namelist.add(new myEmployee("sai",350000,"supervisor"));
		namelist.add(new myEmployee("vishnu vardhan",30000,"sales manager"));
		namelist.add(new myEmployee("jyothi",40000,"trainer"));
	
	for (myEmployee employee : namelist){      
		//iterating the tree set using for each loop
		System.out.println(employee);
		//system : is a class in java language pacakge.
   		//out : static member of the system class.
   		//println : to print what is output.
	}
 }
}
