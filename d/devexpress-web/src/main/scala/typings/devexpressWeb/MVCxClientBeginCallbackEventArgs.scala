package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client BeginCallback events.
  */
@JSGlobal("MVCxClientBeginCallbackEventArgs")
@js.native
class MVCxClientBeginCallbackEventArgs protected () extends ASPxClientBeginCallbackEventArgs {
  /**
    * Initializes a new instance of the MVCxClientBeginCallbackEventArgs class.
    * @param command A string value that is the name of the command that initiated a callback.
    */
  def this(command: String) = this()
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  var customArgs: js.Any = js.native
}

