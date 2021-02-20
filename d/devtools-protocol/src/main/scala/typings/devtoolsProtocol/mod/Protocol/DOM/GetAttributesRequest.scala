package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAttributesRequest extends StObject {
  
  /**
    * Id of the node to retrieve attibutes for.
    */
  var nodeId: NodeId = js.native
}
object GetAttributesRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): GetAttributesRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributesRequest]
  }
  
  @scala.inline
  implicit class GetAttributesRequestMutableBuilder[Self <: GetAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
