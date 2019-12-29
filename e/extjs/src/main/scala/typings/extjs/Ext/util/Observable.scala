package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Observable")
@js.native
class Observable () extends js.Object

/* static members */
@JSGlobal("Ext.util.Observable")
@js.native
object Observable extends js.Object {
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
  /** [Method] Starts capture on the specified Observable
  		* @param o Ext.util.Observable The Observable to capture events from.
  		* @param fn Function The function to call when an event is fired.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Observable firing the event.
  		*/
  def capture(): Unit = js.native
  def capture(o: IObservable): Unit = js.native
  def capture(o: IObservable, fn: js.Any): Unit = js.native
  def capture(o: IObservable, fn: js.Any, scope: js.Any): Unit = js.native
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
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): String = js.native
  /** [Method] Adds members to class  */
  def implement(): Unit = js.native
  /** [Method] Sets observability on the passed class constructor
  		* @param c Function The class constructor to make observable.
  		* @param listeners Object An object containing a series of listeners to add. See addListener.
  		*/
  def observe(): Unit = js.native
  def observe(c: js.Any): Unit = js.native
  def observe(c: js.Any, listeners: js.Any): Unit = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
  /** [Method] Removes all added captures from the Observable
  		* @param o Ext.util.Observable The Observable to release
  		*/
  def releaseCapture(): Unit = js.native
  def releaseCapture(o: IObservable): Unit = js.native
}

