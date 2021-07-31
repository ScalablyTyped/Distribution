package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInspectedNodeRequest extends StObject {
  
  /**
    * DOM node id to be accessible by means of $x command line API.
    */
  var nodeId: NodeId
}
object SetInspectedNodeRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): SetInspectedNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInspectedNodeRequest]
  }
  
  @scala.inline
  implicit class SetInspectedNodeRequestMutableBuilder[Self <: SetInspectedNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
