package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetChildNodesEvent extends StObject {
  
  /**
    * Child nodes array.
    */
  var nodes: js.Array[Node]
  
  /**
    * Parent node id to populate with children.
    */
  var parentId: NodeId
}
object SetChildNodesEvent {
  
  inline def apply(nodes: js.Array[Node], parentId: NodeId): SetChildNodesEvent = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetChildNodesEvent]
  }
  
  extension [Self <: SetChildNodesEvent](x: Self) {
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setParentId(value: NodeId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
