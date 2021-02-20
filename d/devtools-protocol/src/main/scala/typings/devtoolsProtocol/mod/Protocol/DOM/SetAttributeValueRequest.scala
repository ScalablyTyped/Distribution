package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAttributeValueRequest extends StObject {
  
  /**
    * Attribute name.
    */
  var name: String = js.native
  
  /**
    * Id of the element to set attribute for.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Attribute value.
    */
  var value: String = js.native
}
object SetAttributeValueRequest {
  
  @scala.inline
  def apply(name: String, nodeId: NodeId, value: String): SetAttributeValueRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAttributeValueRequest]
  }
  
  @scala.inline
  implicit class SetAttributeValueRequestMutableBuilder[Self <: SetAttributeValueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
