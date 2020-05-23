package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to the completion of a callback processing round trip.
  */
trait ASPxClientEndCallbackEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  var command: String
}

object ASPxClientEndCallbackEventArgs {
  @scala.inline
  def apply(command: String): ASPxClientEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEndCallbackEventArgs]
  }
}

