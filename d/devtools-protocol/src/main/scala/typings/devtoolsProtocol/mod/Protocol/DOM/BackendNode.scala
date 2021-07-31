package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendNode extends StObject {
  
  var backendNodeId: BackendNodeId
  
  /**
    * `Node`'s nodeName.
    */
  var nodeName: String
  
  /**
    * `Node`'s nodeType.
    */
  var nodeType: integer
}
object BackendNode {
  
  @scala.inline
  def apply(backendNodeId: BackendNodeId, nodeName: String, nodeType: integer): BackendNode = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendNode]
  }
  
  @scala.inline
  implicit class BackendNodeMutableBuilder[Self <: BackendNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: integer): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
  }
}
