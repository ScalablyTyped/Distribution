package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveToRequest extends js.Object {
  
  /**
    * Drop node before this one (if absent, the moved node becomes the last child of
    * `targetNodeId`).
    */
  var insertBeforeNodeId: js.UndefOr[NodeId] = js.native
  
  /**
    * Id of the node to move.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Id of the element to drop the moved node into.
    */
  var targetNodeId: NodeId = js.native
}
object MoveToRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, targetNodeId: NodeId): MoveToRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], targetNodeId = targetNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToRequest]
  }
  
  @scala.inline
  implicit class MoveToRequestOps[Self <: MoveToRequest] (val x: Self) extends AnyVal {
    
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
    def setTargetNodeId(value: NodeId): Self = this.set("targetNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertBeforeNodeId(value: NodeId): Self = this.set("insertBeforeNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertBeforeNodeId: Self = this.set("insertBeforeNodeId", js.undefined)
  }
}
