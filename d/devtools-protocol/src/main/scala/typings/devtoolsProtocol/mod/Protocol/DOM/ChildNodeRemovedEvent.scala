package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildNodeRemovedEvent extends js.Object {
  /**
    * Id of the node that has been removed.
    */
  var nodeId: NodeId = js.native
  /**
    * Parent id.
    */
  var parentNodeId: NodeId = js.native
}

object ChildNodeRemovedEvent {
  @scala.inline
  def apply(nodeId: NodeId, parentNodeId: NodeId): ChildNodeRemovedEvent = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], parentNodeId = parentNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildNodeRemovedEvent]
  }
  @scala.inline
  implicit class ChildNodeRemovedEventOps[Self <: ChildNodeRemovedEvent] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setParentNodeId(value: NodeId): Self = this.set("parentNodeId", value.asInstanceOf[js.Any])
  }
  
}

