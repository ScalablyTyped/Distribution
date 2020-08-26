package typings.devtoolsProtocol.mod.Protocol.Console

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageAddedEvent extends js.Object {
  /**
    * Console message that has been added.
    */
  var message: ConsoleMessage = js.native
}

object MessageAddedEvent {
  @scala.inline
  def apply(message: ConsoleMessage): MessageAddedEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAddedEvent]
  }
  @scala.inline
  implicit class MessageAddedEventOps[Self <: MessageAddedEvent] (val x: Self) extends AnyVal {
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
    def setMessage(value: ConsoleMessage): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

