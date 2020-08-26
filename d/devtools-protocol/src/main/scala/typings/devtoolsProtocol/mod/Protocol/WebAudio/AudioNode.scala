package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioNode extends js.Object {
  var channelCount: Double = js.native
  var channelCountMode: ChannelCountMode = js.native
  var channelInterpretation: ChannelInterpretation = js.native
  var contextId: GraphObjectId = js.native
  var nodeId: GraphObjectId = js.native
  var nodeType: NodeType = js.native
  var numberOfInputs: Double = js.native
  var numberOfOutputs: Double = js.native
}

object AudioNode {
  @scala.inline
  def apply(
    channelCount: Double,
    channelCountMode: ChannelCountMode,
    channelInterpretation: ChannelInterpretation,
    contextId: GraphObjectId,
    nodeId: GraphObjectId,
    nodeType: NodeType,
    numberOfInputs: Double,
    numberOfOutputs: Double
  ): AudioNode = {
    val __obj = js.Dynamic.literal(channelCount = channelCount.asInstanceOf[js.Any], channelCountMode = channelCountMode.asInstanceOf[js.Any], channelInterpretation = channelInterpretation.asInstanceOf[js.Any], contextId = contextId.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], numberOfInputs = numberOfInputs.asInstanceOf[js.Any], numberOfOutputs = numberOfOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNode]
  }
  @scala.inline
  implicit class AudioNodeOps[Self <: AudioNode] (val x: Self) extends AnyVal {
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
    def setChannelCount(value: Double): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelCountMode(value: ChannelCountMode): Self = this.set("channelCountMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelInterpretation(value: ChannelInterpretation): Self = this.set("channelInterpretation", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextId(value: GraphObjectId): Self = this.set("contextId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeId(value: GraphObjectId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: NodeType): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfInputs(value: Double): Self = this.set("numberOfInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfOutputs(value: Double): Self = this.set("numberOfOutputs", value.asInstanceOf[js.Any])
  }
  
}

