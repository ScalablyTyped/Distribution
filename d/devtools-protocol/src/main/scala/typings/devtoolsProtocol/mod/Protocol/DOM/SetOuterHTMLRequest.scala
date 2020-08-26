package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOuterHTMLRequest extends js.Object {
  /**
    * Id of the node to set markup for.
    */
  var nodeId: NodeId = js.native
  /**
    * Outer HTML markup to set.
    */
  var outerHTML: String = js.native
}

object SetOuterHTMLRequest {
  @scala.inline
  def apply(nodeId: NodeId, outerHTML: String): SetOuterHTMLRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOuterHTMLRequest]
  }
  @scala.inline
  implicit class SetOuterHTMLRequestOps[Self <: SetOuterHTMLRequest] (val x: Self) extends AnyVal {
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
    def setOuterHTML(value: String): Self = this.set("outerHTML", value.asInstanceOf[js.Any])
  }
  
}

