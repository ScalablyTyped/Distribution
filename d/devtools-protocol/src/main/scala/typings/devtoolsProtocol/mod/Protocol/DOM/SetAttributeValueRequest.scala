package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAttributeValueRequest extends StObject {
  
  /**
    * Attribute name.
    */
  var name: String
  
  /**
    * Id of the element to set attribute for.
    */
  var nodeId: NodeId
  
  /**
    * Attribute value.
    */
  var value: String
}
object SetAttributeValueRequest {
  
  inline def apply(name: String, nodeId: NodeId, value: String): SetAttributeValueRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAttributeValueRequest]
  }
  
  extension [Self <: SetAttributeValueRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
