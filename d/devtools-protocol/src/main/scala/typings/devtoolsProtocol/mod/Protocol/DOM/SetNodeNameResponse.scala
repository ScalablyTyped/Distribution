package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetNodeNameResponse extends StObject {
  
  /**
    * New node's id.
    */
  var nodeId: NodeId
}
object SetNodeNameResponse {
  
  @scala.inline
  def apply(nodeId: NodeId): SetNodeNameResponse = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNodeNameResponse]
  }
  
  @scala.inline
  implicit class SetNodeNameResponseMutableBuilder[Self <: SetNodeNameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
