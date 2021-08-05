package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetNodeValueRequest extends StObject {
  
  /**
    * Id of the node to set value for.
    */
  var nodeId: NodeId
  
  /**
    * New node's value.
    */
  var value: String
}
object SetNodeValueRequest {
  
  inline def apply(nodeId: NodeId, value: String): SetNodeValueRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNodeValueRequest]
  }
  
  extension [Self <: SetNodeValueRequest](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
