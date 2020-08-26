package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetStyleSheetTextRequest extends js.Object {
  var styleSheetId: StyleSheetId = js.native
  var text: String = js.native
}

object SetStyleSheetTextRequest {
  @scala.inline
  def apply(styleSheetId: StyleSheetId, text: String): SetStyleSheetTextRequest = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStyleSheetTextRequest]
  }
  @scala.inline
  implicit class SetStyleSheetTextRequestOps[Self <: SetStyleSheetTextRequest] (val x: Self) extends AnyVal {
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
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

