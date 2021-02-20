package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNodeByPathToFrontendResponse extends StObject {
  
  /**
    * Id of the node for given path.
    */
  var nodeId: NodeId = js.native
}
object PushNodeByPathToFrontendResponse {
  
  @scala.inline
  def apply(nodeId: NodeId): PushNodeByPathToFrontendResponse = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNodeByPathToFrontendResponse]
  }
  
  @scala.inline
  implicit class PushNodeByPathToFrontendResponseMutableBuilder[Self <: PushNodeByPathToFrontendResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
