package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSearchResultsResponse extends StObject {
  
  /**
    * Ids of the search result nodes.
    */
  var nodeIds: js.Array[NodeId] = js.native
}
object GetSearchResultsResponse {
  
  @scala.inline
  def apply(nodeIds: js.Array[NodeId]): GetSearchResultsResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchResultsResponse]
  }
  
  @scala.inline
  implicit class GetSearchResultsResponseMutableBuilder[Self <: GetSearchResultsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value :_*))
  }
}
