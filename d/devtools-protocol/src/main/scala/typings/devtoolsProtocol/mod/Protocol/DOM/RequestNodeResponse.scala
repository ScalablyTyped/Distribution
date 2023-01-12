package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestNodeResponse extends StObject {
  
  /**
    * Node id for given object.
    */
  var nodeId: NodeId
}
object RequestNodeResponse {
  
  inline def apply(nodeId: NodeId): RequestNodeResponse = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestNodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestNodeResponse] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
