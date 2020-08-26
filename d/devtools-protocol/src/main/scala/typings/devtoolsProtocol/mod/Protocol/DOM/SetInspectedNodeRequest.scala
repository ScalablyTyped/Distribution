package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetInspectedNodeRequest extends js.Object {
  /**
    * DOM node id to be accessible by means of $x command line API.
    */
  var nodeId: NodeId = js.native
}

object SetInspectedNodeRequest {
  @scala.inline
  def apply(nodeId: NodeId): SetInspectedNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInspectedNodeRequest]
  }
  @scala.inline
  implicit class SetInspectedNodeRequestOps[Self <: SetInspectedNodeRequest] (val x: Self) extends AnyVal {
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
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
  }
  
}

