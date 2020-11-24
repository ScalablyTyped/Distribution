package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildNodeInsertedEvent extends js.Object {
  
  /**
    * Inserted node data.
    */
  var node: Node = js.native
  
  /**
    * Id of the node that has changed.
    */
  var parentNodeId: NodeId = js.native
  
  /**
    * If of the previous siblint.
    */
  var previousNodeId: NodeId = js.native
}
object ChildNodeInsertedEvent {
  
  @scala.inline
  def apply(node: Node, parentNodeId: NodeId, previousNodeId: NodeId): ChildNodeInsertedEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parentNodeId = parentNodeId.asInstanceOf[js.Any], previousNodeId = previousNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildNodeInsertedEvent]
  }
  
  @scala.inline
  implicit class ChildNodeInsertedEventOps[Self <: ChildNodeInsertedEvent] (val x: Self) extends AnyVal {
    
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
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeId(value: NodeId): Self = this.set("parentNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNodeId(value: NodeId): Self = this.set("previousNodeId", value.asInstanceOf[js.Any])
  }
}
