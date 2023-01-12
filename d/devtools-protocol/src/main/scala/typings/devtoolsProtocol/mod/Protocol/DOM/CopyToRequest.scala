package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyToRequest extends StObject {
  
  /**
    * Drop the copy before this node (if absent, the copy becomes the last child of
    * `targetNodeId`).
    */
  var insertBeforeNodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * Id of the node to copy.
    */
  var nodeId: NodeId
  
  /**
    * Id of the element to drop the copy into.
    */
  var targetNodeId: NodeId
}
object CopyToRequest {
  
  inline def apply(nodeId: NodeId, targetNodeId: NodeId): CopyToRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], targetNodeId = targetNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyToRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyToRequest] (val x: Self) extends AnyVal {
    
    inline def setInsertBeforeNodeId(value: NodeId): Self = StObject.set(x, "insertBeforeNodeId", value.asInstanceOf[js.Any])
    
    inline def setInsertBeforeNodeIdUndefined: Self = StObject.set(x, "insertBeforeNodeId", js.undefined)
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setTargetNodeId(value: NodeId): Self = StObject.set(x, "targetNodeId", value.asInstanceOf[js.Any])
  }
}
