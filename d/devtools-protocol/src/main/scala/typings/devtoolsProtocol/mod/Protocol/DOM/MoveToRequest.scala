package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveToRequest extends StObject {
  
  /**
    * Drop node before this one (if absent, the moved node becomes the last child of
    * `targetNodeId`).
    */
  var insertBeforeNodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * Id of the node to move.
    */
  var nodeId: NodeId
  
  /**
    * Id of the element to drop the moved node into.
    */
  var targetNodeId: NodeId
}
object MoveToRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, targetNodeId: NodeId): MoveToRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], targetNodeId = targetNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToRequest]
  }
  
  @scala.inline
  implicit class MoveToRequestMutableBuilder[Self <: MoveToRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertBeforeNodeId(value: NodeId): Self = StObject.set(x, "insertBeforeNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertBeforeNodeIdUndefined: Self = StObject.set(x, "insertBeforeNodeId", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNodeId(value: NodeId): Self = StObject.set(x, "targetNodeId", value.asInstanceOf[js.Any])
  }
}
