package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.ClassManager")
@js.native
class ClassManager () extends js.Object

/* static members */
@JSGlobal("Ext.ClassManager")
@js.native
object ClassManager extends js.Object {
  /** [Method] Adds a batch of class name to alias mappings
  		* @param aliases Object The set of mappings of the form className : [values...]
  		* @returns Ext.ClassManager this
  		*/
  def addNameAliasMappings(): extjsLib.ExtNs.IClassManager = js.native
  def addNameAliasMappings(aliases: js.Any): extjsLib.ExtNs.IClassManager = js.native
  /** [Method]
  		* @param alternates Object The set of mappings of the form className : [values...]
  		* @returns Ext.ClassManager this
  		*/
  def addNameAlternateMappings(): extjsLib.ExtNs.IClassManager = js.native
  def addNameAlternateMappings(alternates: js.Any): extjsLib.ExtNs.IClassManager = js.native
  /** [Method] Defines a class
  		* @param className Object
  		* @param data Object
  		* @param createdFn Object
  		*/
  def create(): scala.Unit = js.native
  def create(className: js.Any): scala.Unit = js.native
  def create(className: js.Any, data: js.Any): scala.Unit = js.native
  def create(className: js.Any, data: js.Any, createdFn: js.Any): scala.Unit = js.native
  /** [Method] Retrieve a class by its name
  		* @param name String
  		* @returns Ext.Class class
  		*/
  def get(): extjsLib.ExtNs.IClass = js.native
  def get(name: java.lang.String): extjsLib.ExtNs.IClass = js.native
  /** [Method] Get the aliases of a class by the class name
  		* @param name String
  		* @returns Array aliases
  		*/
  def getAliasesByName(): extjsLib.ExtNs.Array = js.native
  def getAliasesByName(name: java.lang.String): extjsLib.ExtNs.Array = js.native
  /** [Method] Get a reference to the class by its alias
  		* @param alias String
  		* @returns Ext.Class class
  		*/
  def getByAlias(): extjsLib.ExtNs.IClass = js.native
  def getByAlias(alias: java.lang.String): extjsLib.ExtNs.IClass = js.native
  def getClass(`object`: js.Any): extjsLib.ExtNs.IClass = js.native
  /** [Method] Returns the displayName property or className or object
  		* @param object Object
  		* @returns String
  		*/
  def getDisplayName(): java.lang.String = js.native
  def getDisplayName(`object`: js.Any): java.lang.String = js.native
  /** [Method] Get the name of the class by its reference or its instance  getName is usually invoked by the shorthand Ext getClass
  		* @param object Ext.Class/Object
  		* @returns String className
  		*/
  def getName(): java.lang.String = js.native
  def getName(`object`: js.Any): java.lang.String = js.native
  /** [Method] Get the name of a class by its alias
  		* @param alias String
  		* @returns String className
  		*/
  def getNameByAlias(): java.lang.String = js.native
  def getNameByAlias(alias: java.lang.String): java.lang.String = js.native
  /** [Method] Get the name of a class by its alternate name
  		* @param alternate String
  		* @returns String className
  		*/
  def getNameByAlternate(): java.lang.String = js.native
  def getNameByAlternate(alternate: java.lang.String): java.lang.String = js.native
  /** [Method] Converts a string expression to an array of matching class names
  		* @param expression String
  		* @returns String[] classNames
  		*/
  def getNamesByExpression(): extjsLib.ExtNs.Array = js.native
  def getNamesByExpression(expression: java.lang.String): extjsLib.ExtNs.Array = js.native
  /** [Method] Instantiate a class by its alias
  		* @param alias String
  		* @param args Object... Additional arguments after the alias will be passed to the class constructor.
  		* @returns Object instance
  		*/
  def instantiateByAlias(alias: java.lang.String, args: js.Any*): js.Any = js.native
  /** [Method] Checks if a class has already been created
  		* @param className String
  		* @returns Boolean exist
  		*/
  def isCreated(): scala.Boolean = js.native
  def isCreated(className: java.lang.String): scala.Boolean = js.native
  /** [Method] Sets a name reference to a class
  		* @param name String
  		* @param value Object
  		* @returns Ext.ClassManager this
  		*/
  def set(): extjsLib.ExtNs.IClassManager = js.native
  def set(name: java.lang.String): extjsLib.ExtNs.IClassManager = js.native
  def set(name: java.lang.String, value: js.Any): extjsLib.ExtNs.IClassManager = js.native
  /** [Method] Register the alias for a class
  		* @param cls Ext.Class/String a reference to a class or a className
  		* @param alias String Alias to use when referring to this class
  		* @returns Ext.ClassManager this
  		*/
  def setAlias(): extjsLib.ExtNs.IClassManager = js.native
  def setAlias(cls: js.Any): extjsLib.ExtNs.IClassManager = js.native
  def setAlias(cls: js.Any, alias: java.lang.String): extjsLib.ExtNs.IClassManager = js.native
  /** [Method] Creates a namespace and assign the value to the created object Ext ClassManager setNamespace MyCompany pkg Example
  		* @param name String
  		* @param value Object
  		*/
  def setNamespace(): scala.Unit = js.native
  def setNamespace(name: java.lang.String): scala.Unit = js.native
  def setNamespace(name: java.lang.String, value: js.Any): scala.Unit = js.native
}

