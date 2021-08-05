package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySelectorAllResponse extends StObject {
  
  /**
    * Query selector result.
    */
  var nodeIds: js.Array[NodeId]
}
object QuerySelectorAllResponse {
  
  inline def apply(nodeIds: js.Array[NodeId]): QuerySelectorAllResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySelectorAllResponse]
  }
  
  extension [Self <: QuerySelectorAllResponse](x: Self) {
    
    inline def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value :_*))
  }
}
