package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.CallbackError event.
  */
trait ASPxClientGlobalCallbackErrorEventArgs extends ASPxClientCallbackErrorEventArgs {
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl
}

object ASPxClientGlobalCallbackErrorEventArgs {
  @scala.inline
  def apply(control: ASPxClientControl, handled: Boolean, message: String): ASPxClientGlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalCallbackErrorEventArgs]
  }
}

