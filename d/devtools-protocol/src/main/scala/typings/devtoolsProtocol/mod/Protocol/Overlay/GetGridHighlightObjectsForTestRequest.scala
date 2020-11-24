package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGridHighlightObjectsForTestRequest extends js.Object {
  
  /**
    * Ids of the node to get highlight object for.
    */
  var nodeIds: js.Array[NodeId] = js.native
}
object GetGridHighlightObjectsForTestRequest {
  
  @scala.inline
  def apply(nodeIds: js.Array[NodeId]): GetGridHighlightObjectsForTestRequest = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGridHighlightObjectsForTestRequest]
  }
  
  @scala.inline
  implicit class GetGridHighlightObjectsForTestRequestOps[Self <: GetGridHighlightObjectsForTestRequest] (val x: Self) extends AnyVal {
    
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
    def setNodeIdsVarargs(value: NodeId*): Self = this.set("nodeIds", js.Array(value :_*))
    
    @scala.inline
    def setNodeIds(value: js.Array[NodeId]): Self = this.set("nodeIds", value.asInstanceOf[js.Any])
  }
}
