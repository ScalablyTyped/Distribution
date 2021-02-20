package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackgroundColorsRequest extends StObject {
  
  /**
    * Id of the node to get background colors for.
    */
  var nodeId: NodeId = js.native
}
object GetBackgroundColorsRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): GetBackgroundColorsRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundColorsRequest]
  }
  
  @scala.inline
  implicit class GetBackgroundColorsRequestMutableBuilder[Self <: GetBackgroundColorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
