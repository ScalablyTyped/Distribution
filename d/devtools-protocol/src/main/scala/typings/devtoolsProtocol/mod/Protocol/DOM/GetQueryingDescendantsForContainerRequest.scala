package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryingDescendantsForContainerRequest extends StObject {
  
  /**
    * Id of the container node to find querying descendants from.
    */
  var nodeId: NodeId
}
object GetQueryingDescendantsForContainerRequest {
  
  inline def apply(nodeId: NodeId): GetQueryingDescendantsForContainerRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryingDescendantsForContainerRequest]
  }
  
  extension [Self <: GetQueryingDescendantsForContainerRequest](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
