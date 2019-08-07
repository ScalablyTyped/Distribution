package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.BeginCallback event.
  */
@JSGlobal("MVCxClientGlobalBeginCallbackEventArgs")
@js.native
class MVCxClientGlobalBeginCallbackEventArgs protected () extends ASPxClientGlobalBeginCallbackEventArgs {
  /**
    * Initializes a new instance of the MVCxClientGlobalBeginCallbackEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    * @param command A string value that is the name of the command that initiated a callback.
    */
  def this(control: ASPxClientControl, command: String) = this()
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  var customArgs: js.Any = js.native
}

