package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetStyleTextsRequest extends js.Object {
  var edits: js.Array[StyleDeclarationEdit] = js.native
}

object SetStyleTextsRequest {
  @scala.inline
  def apply(edits: js.Array[StyleDeclarationEdit]): SetStyleTextsRequest = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStyleTextsRequest]
  }
  @scala.inline
  implicit class SetStyleTextsRequestOps[Self <: SetStyleTextsRequest] (val x: Self) extends AnyVal {
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
    def setEditsVarargs(value: StyleDeclarationEdit*): Self = this.set("edits", js.Array(value :_*))
    @scala.inline
    def setEdits(value: js.Array[StyleDeclarationEdit]): Self = this.set("edits", value.asInstanceOf[js.Any])
  }
  
}

