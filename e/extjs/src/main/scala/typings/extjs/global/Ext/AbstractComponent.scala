package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.AbstractComponent")
@js.native
class AbstractComponent ()
  extends typings.extjs.Ext.AbstractComponent
/* static members */
@JSGlobal("Ext.AbstractComponent")
@js.native
object AbstractComponent extends js.Object {
  
  /** [Method] Add methods  properties to the prototype of this class
    * @param members Object
    */
  def addMembers(): Unit = js.native
  def addMembers(members: js.Any): Unit = js.native
  
  /** [Method] Add  override static properties of this class
    * @param members Object
    * @returns Ext.Base this
    */
  def addStatics(): IBase = js.native
  def addStatics(members: js.Any): IBase = js.native
  
  /** [Method] Cancels layout of a component
    * @param comp Ext.Component
    */
  def cancelLayout(): Unit = js.native
  def cancelLayout(comp: IComponent): Unit = js.native
  
  /** [Method] Create a new instance of this Class
    * @returns Object the created instance.
    */
  def create(): js.Any = js.native
  
  /** [Method] Create aliases for existing prototype methods
    * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
    * @param origin String/Object The original method name
    */
  def createAlias(): Unit = js.native
  def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  
  /** [Method] Performs all pending layouts that were scheduled while suspendLayouts was in effect  */
  def flushLayouts(): Unit = js.native
  
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  def getName(): java.lang.String = js.native
  
  /** [Method] Adds members to class  */
  def implement(): Unit = js.native
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
  
  /** [Method] Resumes layout activity in the whole framework
    * @param flush Boolean true to perform all the pending layouts. This can also be achieved by calling flushLayouts directly.
    */
  def resumeLayouts(): Unit = js.native
  def resumeLayouts(flush: Boolean): Unit = js.native
  
  /** [Method] Stops layouts from happening in the whole framework  */
  def suspendLayouts(): Unit = js.native
  
  /** [Method] Updates layout of a component
    * @param comp Ext.Component The component to update.
    * @param defer Boolean true to just queue the layout if this component.
    */
  def updateLayout(): Unit = js.native
  def updateLayout(comp: js.UndefOr[scala.Nothing], defer: Boolean): Unit = js.native
  def updateLayout(comp: IComponent): Unit = js.native
  def updateLayout(comp: IComponent, defer: Boolean): Unit = js.native
}
