package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.ITemplate
import typings.extjs.Ext.IXTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.XTemplate")
@js.native
class XTemplate ()
  extends StObject
     with typings.extjs.Ext.XTemplate
/* static members */
object XTemplate {
  
  @JSGlobal("Ext.XTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Add methods  properties to the prototype of this class
    * @param members Object
    */
  inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
  inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Add  override static properties of this class
    * @param members Object
    * @returns Ext.Base this
    */
  inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
  inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method] Create a new instance of this Class
    * @returns Object the created instance.
    */
  inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
  
  /** [Method] Create aliases for existing prototype methods
    * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
    * @param origin String/Object The original method name
    */
  inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
  inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Creates a template from the passed element s value display none textarea preferred or innerHTML
    * @param el String/HTMLElement A DOM element or its id
    * @param config Object Config object
    * @returns Ext.Template The created template
    */
  inline def from(): ITemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[ITemplate]
  inline def from(el: js.Any): ITemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(el.asInstanceOf[js.Any]).asInstanceOf[ITemplate]
  inline def from(el: js.Any, config: js.Any): ITemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(el.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ITemplate]
  inline def from(el: Unit, config: js.Any): ITemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(el.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ITemplate]
  
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
  
  /** [Method] Gets an XTemplate from an object an instance of an Ext define d class
    * @param instance Object The object from which to get the XTemplate (must be an instance of an Ext.define'd class).
    * @param name String The name of the property by which to get the XTemplate.
    * @returns Ext.XTemplate The XTemplate instance or null if not found.
    */
  inline def getTpl(): IXTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("getTpl")().asInstanceOf[IXTemplate]
  inline def getTpl(instance: js.Any): IXTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("getTpl")(instance.asInstanceOf[js.Any]).asInstanceOf[IXTemplate]
  inline def getTpl(instance: js.Any, name: java.lang.String): IXTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("getTpl")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IXTemplate]
  inline def getTpl(instance: Unit, name: java.lang.String): IXTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("getTpl")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IXTemplate]
  
  /** [Method] Adds members to class  */
  inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
  inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
}
