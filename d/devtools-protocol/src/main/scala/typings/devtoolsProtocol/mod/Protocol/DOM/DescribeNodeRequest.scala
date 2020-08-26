package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNodeRequest extends js.Object {
  /**
    * Identifier of the backend node.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  /**
    * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
    * entire subtree or provide an integer larger than 0.
    */
  var depth: js.UndefOr[integer] = js.native
  /**
    * Identifier of the node.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  /**
    * JavaScript object id of the node wrapper.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  /**
    * Whether or not iframes and shadow roots should be traversed when returning the subtree
    * (default is false).
    */
  var pierce: js.UndefOr[Boolean] = js.native
}

object DescribeNodeRequest {
  @scala.inline
  def apply(): DescribeNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNodeRequest]
  }
  @scala.inline
  implicit class DescribeNodeRequestOps[Self <: DescribeNodeRequest] (val x: Self) extends AnyVal {
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
    def setDepth(value: integer): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setPierce(value: Boolean): Self = this.set("pierce", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePierce: Self = this.set("pierce", js.undefined)
  }
  
}

