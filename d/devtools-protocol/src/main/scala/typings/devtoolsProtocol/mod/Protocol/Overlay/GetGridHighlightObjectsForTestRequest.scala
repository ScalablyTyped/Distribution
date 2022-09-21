package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGridHighlightObjectsForTestRequest extends StObject {
  
  /**
    * Ids of the node to get highlight object for.
    */
  var nodeIds: js.Array[NodeId]
}
object GetGridHighlightObjectsForTestRequest {
  
  inline def apply(nodeIds: js.Array[NodeId]): GetGridHighlightObjectsForTestRequest = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGridHighlightObjectsForTestRequest]
  }
  
  extension [Self <: GetGridHighlightObjectsForTestRequest](x: Self) {
    
    inline def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
