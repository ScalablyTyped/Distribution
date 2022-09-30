package typings.extjs.global.Ext

import typings.extjs.Ext.IClass
import typings.extjs.Ext.IClassManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ClassManager")
@js.native
open class ClassManager ()
  extends StObject
     with typings.extjs.Ext.ClassManager
/* static members */
object ClassManager {
  
  @JSGlobal("Ext.ClassManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Adds a batch of class name to alias mappings
    * @param aliases Object The set of mappings of the form className : [values...]
    * @returns Ext.ClassManager this
    */
  inline def addNameAliasMappings(): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("addNameAliasMappings")().asInstanceOf[IClassManager]
  inline def addNameAliasMappings(aliases: Any): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("addNameAliasMappings")(aliases.asInstanceOf[js.Any]).asInstanceOf[IClassManager]
  
  /** [Method]
    * @param alternates Object The set of mappings of the form className : [values...]
    * @returns Ext.ClassManager this
    */
  inline def addNameAlternateMappings(): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("addNameAlternateMappings")().asInstanceOf[IClassManager]
  inline def addNameAlternateMappings(alternates: Any): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("addNameAlternateMappings")(alternates.asInstanceOf[js.Any]).asInstanceOf[IClassManager]
  
  /** [Method] Defines a class
    * @param className Object
    * @param data Object
    * @param createdFn Object
    */
  inline def create(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Unit]
  inline def create(className: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(className.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def create(className: Any, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(className.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(className: Any, data: Any, createdFn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(className.asInstanceOf[js.Any], data.asInstanceOf[js.Any], createdFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(className: Any, data: Unit, createdFn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(className.asInstanceOf[js.Any], data.asInstanceOf[js.Any], createdFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(className: Unit, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(className.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(className: Unit, data: Any, createdFn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(className.asInstanceOf[js.Any], data.asInstanceOf[js.Any], createdFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(className: Unit, data: Unit, createdFn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(className.asInstanceOf[js.Any], data.asInstanceOf[js.Any], createdFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Retrieve a class by its name
    * @param name String
    * @returns Ext.Class class
    */
  inline def get(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[IClass]
  inline def get(name: java.lang.String): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[IClass]
  
  /** [Method] Get the aliases of a class by the class name
    * @param name String
    * @returns Array aliases
    */
  inline def getAliasesByName(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getAliasesByName")().asInstanceOf[typings.extjs.Ext.Array]
  inline def getAliasesByName(name: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getAliasesByName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Get a reference to the class by its alias
    * @param alias String
    * @returns Ext.Class class
    */
  inline def getByAlias(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("getByAlias")().asInstanceOf[IClass]
  inline def getByAlias(alias: java.lang.String): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("getByAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[IClass]
  
  inline def getClass(`object`: Any): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(`object`.asInstanceOf[js.Any]).asInstanceOf[IClass]
  
  /** [Method] Returns the displayName property or className or object
    * @param object Object
    * @returns String
    */
  inline def getDisplayName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")().asInstanceOf[java.lang.String]
  inline def getDisplayName(`object`: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(`object`.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the name of the class by its reference or its instance  getName is usually invoked by the shorthand Ext getClass
    * @param object Ext.Class/Object
    * @returns String className
    */
  inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
  inline def getName(`object`: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(`object`.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the name of a class by its alias
    * @param alias String
    * @returns String className
    */
  inline def getNameByAlias(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameByAlias")().asInstanceOf[java.lang.String]
  inline def getNameByAlias(alias: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameByAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the name of a class by its alternate name
    * @param alternate String
    * @returns String className
    */
  inline def getNameByAlternate(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameByAlternate")().asInstanceOf[java.lang.String]
  inline def getNameByAlternate(alternate: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameByAlternate")(alternate.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Converts a string expression to an array of matching class names
    * @param expression String
    * @returns String[] classNames
    */
  inline def getNamesByExpression(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamesByExpression")().asInstanceOf[typings.extjs.Ext.Array]
  inline def getNamesByExpression(expression: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamesByExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Instantiate a class by its alias
    * @param alias String
    * @param args Object... Additional arguments after the alias will be passed to the class constructor.
    * @returns Object instance
    */
  inline def instantiateByAlias(alias: java.lang.String, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateByAlias")(scala.List(alias.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  /** [Method] Checks if a class has already been created
    * @param className String
    * @returns Boolean exist
    */
  inline def isCreated(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreated")().asInstanceOf[Boolean]
  inline def isCreated(className: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreated")(className.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Sets a name reference to a class
    * @param name String
    * @param value Object
    * @returns Ext.ClassManager this
    */
  inline def set(): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[IClassManager]
  inline def set(name: java.lang.String): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any]).asInstanceOf[IClassManager]
  inline def set(name: java.lang.String, value: Any): IClassManager = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IClassManager]
  inline def set(name: Unit, value: Any): IClassManager = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IClassManager]
  
  /** [Method] Register the alias for a class
    * @param cls Ext.Class/String a reference to a class or a className
    * @param alias String Alias to use when referring to this class
    * @returns Ext.ClassManager this
    */
  inline def setAlias(): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("setAlias")().asInstanceOf[IClassManager]
  inline def setAlias(cls: Any): IClassManager = ^.asInstanceOf[js.Dynamic].applyDynamic("setAlias")(cls.asInstanceOf[js.Any]).asInstanceOf[IClassManager]
  inline def setAlias(cls: Any, alias: java.lang.String): IClassManager = (^.asInstanceOf[js.Dynamic].applyDynamic("setAlias")(cls.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[IClassManager]
  inline def setAlias(cls: Unit, alias: java.lang.String): IClassManager = (^.asInstanceOf[js.Dynamic].applyDynamic("setAlias")(cls.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[IClassManager]
  
  /** [Method] Creates a namespace and assign the value to the created object Ext ClassManager setNamespace MyCompany pkg Example
    * @param name String
    * @param value Object
    */
  inline def setNamespace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNamespace")().asInstanceOf[Unit]
  inline def setNamespace(name: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setNamespace(name: java.lang.String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNamespace")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setNamespace(name: Unit, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNamespace")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
