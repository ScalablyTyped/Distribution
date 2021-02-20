package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAttributeRequest extends StObject {
  
  /**
    * Name of the attribute to remove.
    */
  var name: String = js.native
  
  /**
    * Id of the element to remove attribute from.
    */
  var nodeId: NodeId = js.native
}
object RemoveAttributeRequest {
  
  @scala.inline
  def apply(name: String, nodeId: NodeId): RemoveAttributeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributeRequest]
  }
  
  @scala.inline
  implicit class RemoveAttributeRequestMutableBuilder[Self <: RemoveAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
