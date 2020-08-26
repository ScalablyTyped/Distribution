package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFrameOwnerResponse extends js.Object {
  /**
    * Resulting node.
    */
  var backendNodeId: BackendNodeId = js.native
  /**
    * Id of the node at given coordinates, only when enabled and requested document.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
}

object GetFrameOwnerResponse {
  @scala.inline
  def apply(backendNodeId: BackendNodeId): GetFrameOwnerResponse = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameOwnerResponse]
  }
  @scala.inline
  implicit class GetFrameOwnerResponseOps[Self <: GetFrameOwnerResponse] (val x: Self) extends AnyVal {
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
    def setBackendNodeId(value: BackendNodeId): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
  }
  
}

