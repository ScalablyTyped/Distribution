package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveNodeRequest extends StObject {
  
  /**
    * Id of the node to remove.
    */
  var nodeId: NodeId = js.native
}
object RemoveNodeRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): RemoveNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveNodeRequest]
  }
  
  @scala.inline
  implicit class RemoveNodeRequestMutableBuilder[Self <: RemoveNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
