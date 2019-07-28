package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BeginCallback event.
  */
trait MVCxClientGlobalBeginCallbackEventArgs extends ASPxClientGlobalBeginCallbackEventArgs {
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    * Value: A hash table object containing named values to be passed from the client to the server side via request parameters.
    */
  var customArgs: js.Object
}

object MVCxClientGlobalBeginCallbackEventArgs {
  @scala.inline
  def apply(command: String, control: ASPxClientControl, customArgs: js.Object): MVCxClientGlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command, control = control, customArgs = customArgs)
  
    __obj.asInstanceOf[MVCxClientGlobalBeginCallbackEventArgs]
  }
}

