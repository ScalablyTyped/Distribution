package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTopLayerElementsResponse extends StObject {
  
  /**
    * NodeIds of top layer elements
    */
  var nodeIds: js.Array[NodeId]
}
object GetTopLayerElementsResponse {
  
  inline def apply(nodeIds: js.Array[NodeId]): GetTopLayerElementsResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopLayerElementsResponse]
  }
  
  extension [Self <: GetTopLayerElementsResponse](x: Self) {
    
    inline def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
