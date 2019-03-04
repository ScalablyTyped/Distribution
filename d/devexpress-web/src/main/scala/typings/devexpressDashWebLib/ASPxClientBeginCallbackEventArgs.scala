package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to the beginning of a callback processing round trip.
  */
trait ASPxClientBeginCallbackEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    * Value: A string value that represents the name of the command which initiated a callback.
    */
  var command: java.lang.String
}

object ASPxClientBeginCallbackEventArgs {
  @scala.inline
  def apply(command: java.lang.String): ASPxClientBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command)
  
    __obj.asInstanceOf[ASPxClientBeginCallbackEventArgs]
  }
}

