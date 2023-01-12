package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelayoutBoundaryRequest extends StObject {
  
  /**
    * Id of the node.
    */
  var nodeId: NodeId
}
object GetRelayoutBoundaryRequest {
  
  inline def apply(nodeId: NodeId): GetRelayoutBoundaryRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelayoutBoundaryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRelayoutBoundaryRequest] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
