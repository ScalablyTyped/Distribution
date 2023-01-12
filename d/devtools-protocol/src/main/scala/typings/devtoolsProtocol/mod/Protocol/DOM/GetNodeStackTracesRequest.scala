package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNodeStackTracesRequest extends StObject {
  
  /**
    * Id of the node to get stack traces for.
    */
  var nodeId: NodeId
}
object GetNodeStackTracesRequest {
  
  inline def apply(nodeId: NodeId): GetNodeStackTracesRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodeStackTracesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNodeStackTracesRequest] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
