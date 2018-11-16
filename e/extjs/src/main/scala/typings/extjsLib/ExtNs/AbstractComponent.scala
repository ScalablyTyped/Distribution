package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.AbstractComponent")
@js.native
class AbstractComponent () extends js.Object

@JSGlobal("Ext.AbstractComponent")
@js.native
object AbstractComponent extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(): scala.Unit = js.native
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(members: js.Any): scala.Unit = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(): extjsLib.ExtNs.IBase = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Cancels layout of a component
  		* @param comp Ext.Component
  		*/
  def cancelLayout(): scala.Unit = js.native
  /** [Method] Cancels layout of a component
  		* @param comp Ext.Component
  		*/
  def cancelLayout(comp: extjsLib.ExtNs.IComponent): scala.Unit = js.native
  /** [Method] Create a new instance of this Class
  		* @returns Object the created instance.
  		*/
  def create(): js.Any = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): scala.Unit = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(alias: js.Any): scala.Unit = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(alias: js.Any, origin: js.Any): scala.Unit = js.native
  /** [Method] Performs all pending layouts that were scheduled while suspendLayouts was in effect  */
  def flushLayouts(): scala.Unit = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): java.lang.String = js.native
  /** [Method] Adds members to class  */
  def implement(): scala.Unit = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): extjsLib.ExtNs.IBase = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Resumes layout activity in the whole framework
  		* @param flush Boolean true to perform all the pending layouts. This can also be achieved by calling flushLayouts directly.
  		*/
  def resumeLayouts(): scala.Unit = js.native
  /** [Method] Resumes layout activity in the whole framework
  		* @param flush Boolean true to perform all the pending layouts. This can also be achieved by calling flushLayouts directly.
  		*/
  def resumeLayouts(flush: scala.Boolean): scala.Unit = js.native
  /** [Method] Stops layouts from happening in the whole framework  */
  def suspendLayouts(): scala.Unit = js.native
  /** [Method] Updates layout of a component
  		* @param comp Ext.Component The component to update.
  		* @param defer Boolean true to just queue the layout if this component.
  		*/
  def updateLayout(): scala.Unit = js.native
  /** [Method] Updates layout of a component
  		* @param comp Ext.Component The component to update.
  		* @param defer Boolean true to just queue the layout if this component.
  		*/
  def updateLayout(comp: extjsLib.ExtNs.IComponent): scala.Unit = js.native
  /** [Method] Updates layout of a component
  		* @param comp Ext.Component The component to update.
  		* @param defer Boolean true to just queue the layout if this component.
  		*/
  def updateLayout(comp: extjsLib.ExtNs.IComponent, defer: scala.Boolean): scala.Unit = js.native
}

