package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSourceOrderHighlightObjectForTestRequest extends StObject {
  
  /**
    * Id of the node to highlight.
    */
  var nodeId: NodeId = js.native
}
object GetSourceOrderHighlightObjectForTestRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): GetSourceOrderHighlightObjectForTestRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSourceOrderHighlightObjectForTestRequest]
  }
  
  @scala.inline
  implicit class GetSourceOrderHighlightObjectForTestRequestMutableBuilder[Self <: GetSourceOrderHighlightObjectForTestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
