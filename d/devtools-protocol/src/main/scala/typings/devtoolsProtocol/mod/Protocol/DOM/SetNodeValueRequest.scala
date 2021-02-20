package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetNodeValueRequest extends StObject {
  
  /**
    * Id of the node to set value for.
    */
  var nodeId: NodeId = js.native
  
  /**
    * New node's value.
    */
  var value: String = js.native
}
object SetNodeValueRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, value: String): SetNodeValueRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNodeValueRequest]
  }
  
  @scala.inline
  implicit class SetNodeValueRequestMutableBuilder[Self <: SetNodeValueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
