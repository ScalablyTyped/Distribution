package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextCreatedEvent extends js.Object {
  var context: BaseAudioContext = js.native
}

object ContextCreatedEvent {
  @scala.inline
  def apply(context: BaseAudioContext): ContextCreatedEvent = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextCreatedEvent]
  }
  @scala.inline
  implicit class ContextCreatedEventOps[Self <: ContextCreatedEvent] (val x: Self) extends AnyVal {
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
    def setContext(value: BaseAudioContext): Self = this.set("context", value.asInstanceOf[js.Any])
  }
  
}

