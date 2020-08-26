package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentResponse extends js.Object {
  /**
    * Resulting node.
    */
  var root: Node = js.native
}

object GetDocumentResponse {
  @scala.inline
  def apply(root: Node): GetDocumentResponse = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentResponse]
  }
  @scala.inline
  implicit class GetDocumentResponseOps[Self <: GetDocumentResponse] (val x: Self) extends AnyVal {
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
    def setRoot(value: Node): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

