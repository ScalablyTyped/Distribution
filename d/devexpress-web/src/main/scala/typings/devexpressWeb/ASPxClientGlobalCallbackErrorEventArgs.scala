package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.CallbackError event.
  */
@JSGlobal("ASPxClientGlobalCallbackErrorEventArgs")
@js.native
class ASPxClientGlobalCallbackErrorEventArgs protected () extends ASPxClientCallbackErrorEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGlobalCallbackErrorEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    * @param message A string value that is the error message.
    */
  def this(control: ASPxClientControl, message: String) = this()
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl = js.native
}

