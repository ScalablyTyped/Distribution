package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioNodeCreatedEvent extends js.Object {
  var node: AudioNode = js.native
}

object AudioNodeCreatedEvent {
  @scala.inline
  def apply(node: AudioNode): AudioNodeCreatedEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNodeCreatedEvent]
  }
  @scala.inline
  implicit class AudioNodeCreatedEventOps[Self <: AudioNodeCreatedEvent] (val x: Self) extends AnyVal {
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
    def setNode(value: AudioNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

