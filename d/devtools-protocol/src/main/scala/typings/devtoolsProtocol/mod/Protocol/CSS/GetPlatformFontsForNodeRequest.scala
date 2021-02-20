package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlatformFontsForNodeRequest extends StObject {
  
  var nodeId: NodeId = js.native
}
object GetPlatformFontsForNodeRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): GetPlatformFontsForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlatformFontsForNodeRequest]
  }
  
  @scala.inline
  implicit class GetPlatformFontsForNodeRequestMutableBuilder[Self <: GetPlatformFontsForNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
