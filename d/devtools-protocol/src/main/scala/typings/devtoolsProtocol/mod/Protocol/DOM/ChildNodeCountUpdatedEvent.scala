package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildNodeCountUpdatedEvent extends js.Object {
  
  /**
    * New node count.
    */
  var childNodeCount: integer = js.native
  
  /**
    * Id of the node that has changed.
    */
  var nodeId: NodeId = js.native
}
object ChildNodeCountUpdatedEvent {
  
  @scala.inline
  def apply(childNodeCount: integer, nodeId: NodeId): ChildNodeCountUpdatedEvent = {
    val __obj = js.Dynamic.literal(childNodeCount = childNodeCount.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildNodeCountUpdatedEvent]
  }
  
  @scala.inline
  implicit class ChildNodeCountUpdatedEventOps[Self <: ChildNodeCountUpdatedEvent] (val x: Self) extends AnyVal {
    
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
    def setChildNodeCount(value: integer): Self = this.set("childNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
  }
}
