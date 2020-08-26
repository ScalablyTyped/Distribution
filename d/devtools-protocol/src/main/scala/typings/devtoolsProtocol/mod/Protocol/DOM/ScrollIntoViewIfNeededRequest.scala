package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollIntoViewIfNeededRequest extends js.Object {
  /**
    * Identifier of the backend node.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  /**
    * Identifier of the node.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  /**
    * JavaScript object id of the node wrapper.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  /**
    * The rect to be scrolled into view, relative to the node's border box, in CSS pixels.
    * When omitted, center of the node will be used, similar to Element.scrollIntoView.
    */
  var rect: js.UndefOr[Rect] = js.native
}

object ScrollIntoViewIfNeededRequest {
  @scala.inline
  def apply(): ScrollIntoViewIfNeededRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollIntoViewIfNeededRequest]
  }
  @scala.inline
  implicit class ScrollIntoViewIfNeededRequestOps[Self <: ScrollIntoViewIfNeededRequest] (val x: Self) extends AnyVal {
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
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setRect(value: Rect): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
  }
  
}

