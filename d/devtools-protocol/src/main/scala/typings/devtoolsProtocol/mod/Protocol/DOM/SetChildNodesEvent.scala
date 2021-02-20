package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetChildNodesEvent extends StObject {
  
  /**
    * Child nodes array.
    */
  var nodes: js.Array[Node] = js.native
  
  /**
    * Parent node id to populate with children.
    */
  var parentId: NodeId = js.native
}
object SetChildNodesEvent {
  
  @scala.inline
  def apply(nodes: js.Array[Node], parentId: NodeId): SetChildNodesEvent = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetChildNodesEvent]
  }
  
  @scala.inline
  implicit class SetChildNodesEventMutableBuilder[Self <: SetChildNodesEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setParentId(value: NodeId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
