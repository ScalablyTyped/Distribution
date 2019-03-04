package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to server-side errors that occured during callback processing.
  */
trait ASPxClientCallbackErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the event is handled and the default error handling actions are not required.
    * Value: true if the error is handled and no default processing is required; otherwise false.
    */
  var handled: scala.Boolean
  /**
    * Gets the error message that describes the server error that occurred.
    * Value: A string value that represents the error message.
    */
  var message: java.lang.String
}

object ASPxClientCallbackErrorEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, message: java.lang.String): ASPxClientCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, message = message)
  
    __obj.asInstanceOf[ASPxClientCallbackErrorEventArgs]
  }
}

