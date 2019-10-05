package typings.dojo.dojox.NodeList.delegate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attach event handlers to every item of the NodeList. Uses dojo.connect()
  * so event properties are normalized.
  *
  * Application must manually require() "dojo/_base/connect" before using this method.
  *
  * @param methodName the name of the method to attach to. For DOM events, this should bethe lower-case name of the event
  * @param objOrFunc if 2 arguments are passed (methodName, objOrFunc), objOrFunc shouldreference a function or be the name of the function in the globalnamespace to attach. If 3 arguments are provided(methodName, objOrFunc, funcName), objOrFunc must be the scope tolocate the bound function in
  * @param funcName               Optionaloptional. A string naming the function in objOrFunc to bind to theevent. May also be a function reference.
  */
@js.native
trait connect extends js.Object {
  def apply(methodName: String, objOrFunc: String, funcName: String): Unit = js.native
  def apply(methodName: String, objOrFunc: js.Function, funcName: String): Unit = js.native
  def apply(methodName: String, objOrFunc: js.Object, funcName: String): Unit = js.native
}

