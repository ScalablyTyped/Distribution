package typings.extjs.global.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Sortable")
@js.native
class Sortable ()
  extends typings.extjs.Ext.util.Sortable

/* static members */
@JSGlobal("Ext.util.Sortable")
@js.native
object Sortable extends js.Object {
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
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  /** [Method] Creates a single comparator function which encapsulates the passed Sorter array
    * @param sorters Ext.util.Sorter[] The sorter set for which to create a comparator function
    * @returns Function a function, which when passed two comparable objects returns the result of the whole sorter comparator functions.
    */
  def createComparator(): js.Any = js.native
  def createComparator(sorters: Array): js.Any = js.native
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

