package typings.extjs.global.Ext

import typings.extjs.Ext.IError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Error")
@js.native
class Error ()
  extends typings.extjs.Ext.Error

/* static members */
@JSGlobal("Ext.Error")
@js.native
object Error extends js.Object {
  /** [Method] Globally handle any Ext errors that may be raised optionally providing custom logic to handle different errors indiv
    * @param err Ext.Error The Ext.Error object being raised. It will contain any attributes that were originally raised with it, plus properties about the method and class from which the error originated (if raised from a class that uses the Ext 4 class system).
    */
  def handle(): Unit = js.native
  def handle(err: IError): Unit = js.native
  /** [Method] Raise an error that can include additional data and supports automatic console logging if available
    * @param err String/Object The error message string, or an object containing the attribute "msg" that will be used as the error message. Any other data included in the object will also be logged to the browser console, if available.
    */
  def raise(): Unit = js.native
  def raise(err: js.Any): Unit = js.native
}

