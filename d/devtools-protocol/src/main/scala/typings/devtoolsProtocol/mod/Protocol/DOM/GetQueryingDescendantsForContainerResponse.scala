package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryingDescendantsForContainerResponse extends StObject {
  
  /**
    * Descendant nodes with container queries against the given container.
    */
  var nodeIds: js.Array[NodeId]
}
object GetQueryingDescendantsForContainerResponse {
  
  inline def apply(nodeIds: js.Array[NodeId]): GetQueryingDescendantsForContainerResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryingDescendantsForContainerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQueryingDescendantsForContainerResponse] (val x: Self) extends AnyVal {
    
    inline def setNodeIds(value: js.Array[NodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NodeId*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
