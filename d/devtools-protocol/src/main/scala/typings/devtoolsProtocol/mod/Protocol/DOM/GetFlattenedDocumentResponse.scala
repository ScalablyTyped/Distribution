package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFlattenedDocumentResponse extends js.Object {
  /**
    * Resulting node.
    */
  var nodes: js.Array[Node] = js.native
}

object GetFlattenedDocumentResponse {
  @scala.inline
  def apply(nodes: js.Array[Node]): GetFlattenedDocumentResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFlattenedDocumentResponse]
  }
  @scala.inline
  implicit class GetFlattenedDocumentResponseOps[Self <: GetFlattenedDocumentResponse] (val x: Self) extends AnyVal {
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
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

