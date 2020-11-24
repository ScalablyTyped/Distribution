package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNodesByBackendIdsToFrontendRequest extends js.Object {
  
  /**
    * The array of backend node ids.
    */
  var backendNodeIds: js.Array[BackendNodeId] = js.native
}
object PushNodesByBackendIdsToFrontendRequest {
  
  @scala.inline
  def apply(backendNodeIds: js.Array[BackendNodeId]): PushNodesByBackendIdsToFrontendRequest = {
    val __obj = js.Dynamic.literal(backendNodeIds = backendNodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNodesByBackendIdsToFrontendRequest]
  }
  
  @scala.inline
  implicit class PushNodesByBackendIdsToFrontendRequestOps[Self <: PushNodesByBackendIdsToFrontendRequest] (val x: Self) extends AnyVal {
    
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
    def setBackendNodeIdsVarargs(value: BackendNodeId*): Self = this.set("backendNodeIds", js.Array(value :_*))
    
    @scala.inline
    def setBackendNodeIds(value: js.Array[BackendNodeId]): Self = this.set("backendNodeIds", value.asInstanceOf[js.Any])
  }
}
