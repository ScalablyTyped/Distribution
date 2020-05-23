package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to server-side errors that occured during callback processing.
  */
trait ASPxClientCallbackErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the event is handled and the default error handling actions are not required.
    */
  var handled: Boolean
  /**
    * Gets the error message that describes the server error that occurred.
    */
  var message: String
}

object ASPxClientCallbackErrorEventArgs {
  @scala.inline
  def apply(handled: Boolean, message: String): ASPxClientCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCallbackErrorEventArgs]
  }
}

