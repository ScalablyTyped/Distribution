package typings.devtoolsProtocol.mod.Protocol.DOMDebugger

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveDOMBreakpointRequest extends js.Object {
  
  /**
    * Identifier of the node to remove breakpoint from.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Type of the breakpoint to remove.
    */
  var `type`: DOMBreakpointType = js.native
}
object RemoveDOMBreakpointRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, `type`: DOMBreakpointType): RemoveDOMBreakpointRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveDOMBreakpointRequest]
  }
  
  @scala.inline
  implicit class RemoveDOMBreakpointRequestOps[Self <: RemoveDOMBreakpointRequest] (val x: Self) extends AnyVal {
    
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
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DOMBreakpointType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
