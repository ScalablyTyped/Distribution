package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakeComputedStyleUpdatesResponse extends js.Object {
  
  /**
    * The list of node Ids that have their tracked computed styles updated
    */
  var nodeIds: js.Array[NodeId] = js.native
}
object TakeComputedStyleUpdatesResponse {
  
  @scala.inline
  def apply(nodeIds: js.Array[NodeId]): TakeComputedStyleUpdatesResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeComputedStyleUpdatesResponse]
  }
  
  @scala.inline
  implicit class TakeComputedStyleUpdatesResponseOps[Self <: TakeComputedStyleUpdatesResponse] (val x: Self) extends AnyVal {
    
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
