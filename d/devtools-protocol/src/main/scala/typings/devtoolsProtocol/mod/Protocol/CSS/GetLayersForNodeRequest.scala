package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayersForNodeRequest extends StObject {
  
  var nodeId: NodeId
}
object GetLayersForNodeRequest {
  
  inline def apply(nodeId: NodeId): GetLayersForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayersForNodeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLayersForNodeRequest] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
