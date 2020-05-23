package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.BeginCallback event.
  */
trait MVCxClientGlobalBeginCallbackEventArgs extends ASPxClientGlobalBeginCallbackEventArgs {
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  var customArgs: js.Any
}

object MVCxClientGlobalBeginCallbackEventArgs {
  @scala.inline
  def apply(command: String, control: ASPxClientControl, customArgs: js.Any): MVCxClientGlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], customArgs = customArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientGlobalBeginCallbackEventArgs]
  }
}

