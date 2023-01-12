package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNodesForSubtreeByStyleResponse extends StObject {
  
  /**
    * Resulting nodes.
    */
  var nodeIds: js.Array[NodeId]
}
object GetNodesForSubtreeByStyleResponse {
  
  inline def apply(nodeIds: js.Array[NodeId]): GetNodesForSubtreeByStyleResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodesForSubtreeByStyleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNodesForSubtreeByStyleResponse] (val x: Self) extends AnyVal {
    
    inline def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
