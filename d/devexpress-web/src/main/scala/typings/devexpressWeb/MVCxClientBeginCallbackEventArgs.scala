package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client BeginCallback events.
  */
trait MVCxClientBeginCallbackEventArgs extends ASPxClientBeginCallbackEventArgs {
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  var customArgs: js.Any
}

object MVCxClientBeginCallbackEventArgs {
  @scala.inline
  def apply(command: String, customArgs: js.Any): MVCxClientBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], customArgs = customArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientBeginCallbackEventArgs]
  }
}

