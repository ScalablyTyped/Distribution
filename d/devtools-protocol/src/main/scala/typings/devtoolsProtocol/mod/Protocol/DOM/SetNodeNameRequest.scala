package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetNodeNameRequest extends StObject {
  
  /**
    * New node's name.
    */
  var name: String
  
  /**
    * Id of the node to set name for.
    */
  var nodeId: NodeId
}
object SetNodeNameRequest {
  
  inline def apply(name: String, nodeId: NodeId): SetNodeNameRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNodeNameRequest]
  }
  
  extension [Self <: SetNodeNameRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
