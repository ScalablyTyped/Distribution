package typings.devtoolsProtocol.mod.Protocol.Accessibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFullAXTreeResponse extends js.Object {
  var nodes: js.Array[AXNode] = js.native
}

object GetFullAXTreeResponse {
  @scala.inline
  def apply(nodes: js.Array[AXNode]): GetFullAXTreeResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFullAXTreeResponse]
  }
  @scala.inline
  implicit class GetFullAXTreeResponseOps[Self <: GetFullAXTreeResponse] (val x: Self) extends AnyVal {
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
    def setNodesVarargs(value: AXNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[AXNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

