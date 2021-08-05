package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySelectorResponse extends StObject {
  
  /**
    * Query selector result.
    */
  var nodeId: NodeId
}
object QuerySelectorResponse {
  
  inline def apply(nodeId: NodeId): QuerySelectorResponse = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySelectorResponse]
  }
  
  extension [Self <: QuerySelectorResponse](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
