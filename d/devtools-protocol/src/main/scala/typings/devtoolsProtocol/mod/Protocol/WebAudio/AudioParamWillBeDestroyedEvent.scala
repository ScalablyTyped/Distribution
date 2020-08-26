package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioParamWillBeDestroyedEvent extends js.Object {
  var contextId: GraphObjectId = js.native
  var nodeId: GraphObjectId = js.native
  var paramId: GraphObjectId = js.native
}

object AudioParamWillBeDestroyedEvent {
  @scala.inline
  def apply(contextId: GraphObjectId, nodeId: GraphObjectId, paramId: GraphObjectId): AudioParamWillBeDestroyedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], paramId = paramId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamWillBeDestroyedEvent]
  }
  @scala.inline
  implicit class AudioParamWillBeDestroyedEventOps[Self <: AudioParamWillBeDestroyedEvent] (val x: Self) extends AnyVal {
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
    def setContextId(value: GraphObjectId): Self = this.set("contextId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeId(value: GraphObjectId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamId(value: GraphObjectId): Self = this.set("paramId", value.asInstanceOf[js.Any])
  }
  
}

