package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.AbstractComponent")
@js.native
class AbstractComponent ()
  extends StObject
     with typings.extjs.Ext.AbstractComponent
/* static members */
object AbstractComponent {
  
  @JSGlobal("Ext.AbstractComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Add methods  properties to the prototype of this class
    * @param members Object
    */
  @scala.inline
  def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
  @scala.inline
  def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Add  override static properties of this class
    * @param members Object
    * @returns Ext.Base this
    */
  @scala.inline
  def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
  @scala.inline
  def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method] Cancels layout of a component
    * @param comp Ext.Component
    */
  @scala.inline
  def cancelLayout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelLayout")().asInstanceOf[Unit]
  @scala.inline
  def cancelLayout(comp: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelLayout")(comp.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Create a new instance of this Class
    * @returns Object the created instance.
    */
  @scala.inline
  def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
  
  /** [Method] Create aliases for existing prototype methods
    * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
    * @param origin String/Object The original method name
    */
  @scala.inline
  def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
  @scala.inline
  def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Performs all pending layouts that were scheduled while suspendLayouts was in effect  */
  @scala.inline
  def flushLayouts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushLayouts")().asInstanceOf[Unit]
  
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  @scala.inline
  def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
  
  /** [Method] Adds members to class  */
  @scala.inline
  def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  @scala.inline
  def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
  @scala.inline
  def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method] Resumes layout activity in the whole framework
    * @param flush Boolean true to perform all the pending layouts. This can also be achieved by calling flushLayouts directly.
    */
  @scala.inline
  def resumeLayouts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeLayouts")().asInstanceOf[Unit]
  @scala.inline
  def resumeLayouts(flush: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeLayouts")(flush.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Stops layouts from happening in the whole framework  */
  @scala.inline
  def suspendLayouts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendLayouts")().asInstanceOf[Unit]
  
  /** [Method] Updates layout of a component
    * @param comp Ext.Component The component to update.
    * @param defer Boolean true to just queue the layout if this component.
    */
  @scala.inline
  def updateLayout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateLayout")().asInstanceOf[Unit]
  @scala.inline
  def updateLayout(comp: Unit, defer: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLayout")(comp.asInstanceOf[js.Any], defer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateLayout(comp: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateLayout")(comp.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def updateLayout(comp: IComponent, defer: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLayout")(comp.asInstanceOf[js.Any], defer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
