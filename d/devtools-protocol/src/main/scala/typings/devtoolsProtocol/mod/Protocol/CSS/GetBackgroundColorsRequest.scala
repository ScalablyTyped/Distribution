package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackgroundColorsRequest extends js.Object {
  /**
    * Id of the node to get background colors for.
    */
  var nodeId: NodeId = js.native
}

object GetBackgroundColorsRequest {
  @scala.inline
  def apply(nodeId: NodeId): GetBackgroundColorsRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundColorsRequest]
  }
  @scala.inline
  implicit class GetBackgroundColorsRequestOps[Self <: GetBackgroundColorsRequest] (val x: Self) extends AnyVal {
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
  }
  
}

