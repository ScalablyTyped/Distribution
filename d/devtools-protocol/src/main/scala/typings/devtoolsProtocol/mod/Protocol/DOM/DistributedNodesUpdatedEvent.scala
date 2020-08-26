package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributedNodesUpdatedEvent extends js.Object {
  /**
    * Distributed nodes for given insertion point.
    */
  var distributedNodes: js.Array[BackendNode] = js.native
  /**
    * Insertion point where distrubuted nodes were updated.
    */
  var insertionPointId: NodeId = js.native
}

object DistributedNodesUpdatedEvent {
  @scala.inline
  def apply(distributedNodes: js.Array[BackendNode], insertionPointId: NodeId): DistributedNodesUpdatedEvent = {
    val __obj = js.Dynamic.literal(distributedNodes = distributedNodes.asInstanceOf[js.Any], insertionPointId = insertionPointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributedNodesUpdatedEvent]
  }
  @scala.inline
  implicit class DistributedNodesUpdatedEventOps[Self <: DistributedNodesUpdatedEvent] (val x: Self) extends AnyVal {
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
    def setDistributedNodesVarargs(value: BackendNode*): Self = this.set("distributedNodes", js.Array(value :_*))
    @scala.inline
    def setDistributedNodes(value: js.Array[BackendNode]): Self = this.set("distributedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertionPointId(value: NodeId): Self = this.set("insertionPointId", value.asInstanceOf[js.Any])
  }
  
}

