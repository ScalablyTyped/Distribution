package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetChildNodesEvent extends js.Object {
  
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
  implicit class SetChildNodesEventOps[Self <: SetChildNodesEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: NodeId): Self = this.set("parentId", value.asInstanceOf[js.Any])
  }
}
