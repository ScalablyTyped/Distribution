package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveScriptToEvaluateOnNewDocumentRequest extends js.Object {
  var identifier: ScriptIdentifier = js.native
}

object RemoveScriptToEvaluateOnNewDocumentRequest {
  @scala.inline
  def apply(identifier: ScriptIdentifier): RemoveScriptToEvaluateOnNewDocumentRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveScriptToEvaluateOnNewDocumentRequest]
  }
  @scala.inline
  implicit class RemoveScriptToEvaluateOnNewDocumentRequestOps[Self <: RemoveScriptToEvaluateOnNewDocumentRequest] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: ScriptIdentifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
  }
  
}

