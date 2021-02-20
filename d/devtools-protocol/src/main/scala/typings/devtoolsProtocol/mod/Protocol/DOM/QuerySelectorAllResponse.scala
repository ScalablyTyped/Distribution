package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySelectorAllResponse extends StObject {
  
  /**
    * Query selector result.
    */
  var nodeIds: js.Array[NodeId] = js.native
}
object QuerySelectorAllResponse {
  
  @scala.inline
  def apply(nodeIds: js.Array[NodeId]): QuerySelectorAllResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySelectorAllResponse]
  }
  
  @scala.inline
  implicit class QuerySelectorAllResponseMutableBuilder[Self <: QuerySelectorAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value :_*))
  }
}
