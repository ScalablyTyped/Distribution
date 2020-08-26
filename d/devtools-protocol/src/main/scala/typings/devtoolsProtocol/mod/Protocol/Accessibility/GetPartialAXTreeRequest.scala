package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartialAXTreeRequest extends js.Object {
  /**
    * Identifier of the backend node to get the partial accessibility tree for.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  /**
    * Whether to fetch this nodes ancestors, siblings and children. Defaults to true.
    */
  var fetchRelatives: js.UndefOr[Boolean] = js.native
  /**
    * Identifier of the node to get the partial accessibility tree for.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  /**
    * JavaScript object id of the node wrapper to get the partial accessibility tree for.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
}

object GetPartialAXTreeRequest {
  @scala.inline
  def apply(): GetPartialAXTreeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartialAXTreeRequest]
  }
  @scala.inline
  implicit class GetPartialAXTreeRequestOps[Self <: GetPartialAXTreeRequest] (val x: Self) extends AnyVal {
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
    def deleteBackendNodeId: Self = this.set("backendNodeId", js.undefined)
    @scala.inline
    def setFetchRelatives(value: Boolean): Self = this.set("fetchRelatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchRelatives: Self = this.set("fetchRelatives", js.undefined)
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

