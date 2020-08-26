package typings.extjs.global.Ext.util

import typings.extjs.Ext.IBase
import typings.extjs.Ext.util.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Point")
@js.native
class Point ()
  extends typings.extjs.Ext.util.Point

/* static members */
@JSGlobal("Ext.util.Point")
@js.native
object Point extends js.Object {
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
  /** [Method] Returns a new instance of Ext util Point base on the pageX  pageY values of the given event
    * @param e Ext.EventObject/Event The event
    * @returns Ext.util.Point
    */
  def fromEvent(): IPoint = js.native
  def fromEvent(e: js.Any): IPoint = js.native
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  def getName(): String = js.native
  /** [Method] Adds members to class  */
  def implement(): Unit = js.native
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
}

