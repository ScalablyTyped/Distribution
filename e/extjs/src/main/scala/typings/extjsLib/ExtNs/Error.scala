package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Error")
@js.native
class Error () extends js.Object

@JSGlobal("Ext.Error")
@js.native
object Error extends js.Object {
  /** [Method] Globally handle any Ext errors that may be raised optionally providing custom logic to handle different errors indiv
  		* @param err Ext.Error The Ext.Error object being raised. It will contain any attributes that were originally raised with it, plus properties about the method and class from which the error originated (if raised from a class that uses the Ext 4 class system).
  		*/
  def handle(): scala.Unit = js.native
  /** [Method] Globally handle any Ext errors that may be raised optionally providing custom logic to handle different errors indiv
  		* @param err Ext.Error The Ext.Error object being raised. It will contain any attributes that were originally raised with it, plus properties about the method and class from which the error originated (if raised from a class that uses the Ext 4 class system).
  		*/
  def handle(err: extjsLib.ExtNs.IError): scala.Unit = js.native
  /** [Method] Raise an error that can include additional data and supports automatic console logging if available
  		* @param err String/Object The error message string, or an object containing the attribute "msg" that will be used as the error message. Any other data included in the object will also be logged to the browser console, if available.
  		*/
  def raise(): scala.Unit = js.native
  /** [Method] Raise an error that can include additional data and supports automatic console logging if available
  		* @param err String/Object The error message string, or an object containing the attribute "msg" that will be used as the error message. Any other data included in the object will also be logged to the browser console, if available.
  		*/
  def raise(err: js.Any): scala.Unit = js.native
}

