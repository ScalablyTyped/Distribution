package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client BeginCallback events.
  */
@JSGlobal("MVCxClientBeginCallbackEventArgs")
@js.native
class MVCxClientBeginCallbackEventArgs protected ()
  extends typings.devexpressWeb.MVCxClientBeginCallbackEventArgs {
  /**
    * Initializes a new instance of the MVCxClientBeginCallbackEventArgs class.
    * @param command A string value that is the name of the command that initiated a callback.
    */
  def this(command: String) = this()
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  /* CompleteClass */
  override var command: String = js.native
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  /* CompleteClass */
  override var customArgs: js.Any = js.native
}

