package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSearchResultsResponse extends StObject {
  
  /**
    * Ids of the search result nodes.
    */
  var nodeIds: js.Array[NodeId]
}
object GetSearchResultsResponse {
  
  inline def apply(nodeIds: js.Array[NodeId]): GetSearchResultsResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchResultsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSearchResultsResponse] (val x: Self) extends AnyVal {
    
    inline def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
