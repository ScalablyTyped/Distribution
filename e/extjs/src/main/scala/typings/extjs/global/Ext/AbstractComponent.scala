package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.AbstractComponent")
@js.native
class AbstractComponent ()
  extends typings.extjs.Ext.AbstractComponent
/* static members */
object AbstractComponent {
  
  /** [Method] Add methods  properties to the prototype of this class
    * @param members Object
    */
  @JSGlobal("Ext.AbstractComponent.addMembers")
  @js.native
  def addMembers(): Unit = js.native
  @JSGlobal("Ext.AbstractComponent.addMembers")
  @js.native
  def addMembers(members: js.Any): Unit = js.native
  
  /** [Method] Add  override static properties of this class
    * @param members Object
    * @returns Ext.Base this
    */
  @JSGlobal("Ext.AbstractComponent.addStatics")
  @js.native
  def addStatics(): IBase = js.native
  @JSGlobal("Ext.AbstractComponent.addStatics")
  @js.native
  def addStatics(members: js.Any): IBase = js.native
  
  /** [Method] Cancels layout of a component
    * @param comp Ext.Component
    */
  @JSGlobal("Ext.AbstractComponent.cancelLayout")
  @js.native
  def cancelLayout(): Unit = js.native
  @JSGlobal("Ext.AbstractComponent.cancelLayout")
  @js.native
  def cancelLayout(comp: IComponent): Unit = js.native
  
  /** [Method] Create a new instance of this Class
    * @returns Object the created instance.
    */
  @JSGlobal("Ext.AbstractComponent.create")
  @js.native
  def create(): js.Any = js.native
  
  /** [Method] Create aliases for existing prototype methods
    * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
    * @param origin String/Object The original method name
    */
  @JSGlobal("Ext.AbstractComponent.createAlias")
  @js.native
  def createAlias(): Unit = js.native
  @JSGlobal("Ext.AbstractComponent.createAlias")
  @js.native
  def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
  @JSGlobal("Ext.AbstractComponent.createAlias")
  @js.native
  def createAlias(alias: js.Any): Unit = js.native
  @JSGlobal("Ext.AbstractComponent.createAlias")
  @js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  
  /** [Method] Performs all pending layouts that were scheduled while suspendLayouts was in effect  */
  @JSGlobal("Ext.AbstractComponent.flushLayouts")
  @js.native
  def flushLayouts(): Unit = js.native
  
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  @JSGlobal("Ext.AbstractComponent.getName")
  @js.native
  def getName(): java.lang.String = js.native
  
  /** [Method] Adds members to class  */
  @JSGlobal("Ext.AbstractComponent.implement")
  @js.native
  def implement(): Unit = js.native
  
  /** [Method] Resumes layout activity in the whole framework
    * @param flush Boolean true to perform all the pending layouts. This can also be achieved by calling flushLayouts directly.
    */
  @JSGlobal("Ext.AbstractComponent.resumeLayouts")
  @js.native
  def resumeLayouts(): Unit = js.native
  @JSGlobal("Ext.AbstractComponent.resumeLayouts")
  @js.native
  def resumeLayouts(flush: Boolean): Unit = js.native
  
  /** [Method] Stops layouts from happening in the whole framework  */
  @JSGlobal("Ext.AbstractComponent.suspendLayouts")
  @js.native
  def suspendLayouts(): Unit = js.native
  
  /** [Method] Updates layout of a component
    * @param comp Ext.Component The component to update.
    * @param defer Boolean true to just queue the layout if this component.
    */
  @JSGlobal("Ext.AbstractComponent.updateLayout")
  @js.native
  def updateLayout(): Unit = js.native
  @JSGlobal("Ext.AbstractComponent.updateLayout")
  @js.native
  def updateLayout(comp: js.UndefOr[scala.Nothing], defer: Boolean): Unit = js.native
  @JSGlobal("Ext.AbstractComponent.updateLayout")
  @js.native
  def updateLayout(comp: IComponent): Unit = js.native
  @JSGlobal("Ext.AbstractComponent.updateLayout")
  @js.native
  def updateLayout(comp: IComponent, defer: Boolean): Unit = js.native
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  @JSGlobal("Ext.AbstractComponent.override")
  @js.native
  def `override`(): IBase = js.native
  @JSGlobal("Ext.AbstractComponent.override")
  @js.native
  def `override`(members: js.Any): IBase = js.native
}
