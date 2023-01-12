package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSourceOrderHighlightObjectForTestRequest extends StObject {
  
  /**
    * Id of the node to highlight.
    */
  var nodeId: NodeId
}
object GetSourceOrderHighlightObjectForTestRequest {
  
  inline def apply(nodeId: NodeId): GetSourceOrderHighlightObjectForTestRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSourceOrderHighlightObjectForTestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSourceOrderHighlightObjectForTestRequest] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
