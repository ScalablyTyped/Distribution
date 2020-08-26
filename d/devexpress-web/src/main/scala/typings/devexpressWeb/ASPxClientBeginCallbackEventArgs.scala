package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to the beginning of a callback processing round trip.
  */
@js.native
trait ASPxClientBeginCallbackEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  var command: String = js.native
}

object ASPxClientBeginCallbackEventArgs {
  @scala.inline
  def apply(command: String): ASPxClientBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientBeginCallbackEventArgs]
  }
  @scala.inline
  implicit class ASPxClientBeginCallbackEventArgsOps[Self <: ASPxClientBeginCallbackEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
  }
  
}

