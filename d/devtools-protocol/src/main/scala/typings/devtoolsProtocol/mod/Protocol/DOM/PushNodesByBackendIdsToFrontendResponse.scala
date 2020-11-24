package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNodesByBackendIdsToFrontendResponse extends js.Object {
  
  /**
    * The array of ids of pushed nodes that correspond to the backend ids specified in
    * backendNodeIds.
    */
  var nodeIds: js.Array[NodeId] = js.native
}
object PushNodesByBackendIdsToFrontendResponse {
  
  @scala.inline
  def apply(nodeIds: js.Array[NodeId]): PushNodesByBackendIdsToFrontendResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNodesByBackendIdsToFrontendResponse]
  }
  
  @scala.inline
  implicit class PushNodesByBackendIdsToFrontendResponseOps[Self <: PushNodesByBackendIdsToFrontendResponse] (val x: Self) extends AnyVal {
    
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
