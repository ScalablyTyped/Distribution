package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to the beginning of a callback processing round trip.
  */
trait ASPxClientBeginCallbackEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  var command: String
}

object ASPxClientBeginCallbackEventArgs {
  @scala.inline
  def apply(command: String): ASPxClientBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientBeginCallbackEventArgs]
  }
}

