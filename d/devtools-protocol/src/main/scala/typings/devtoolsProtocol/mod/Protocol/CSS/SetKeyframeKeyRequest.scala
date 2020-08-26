package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetKeyframeKeyRequest extends js.Object {
  var keyText: String = js.native
  var range: SourceRange = js.native
  var styleSheetId: StyleSheetId = js.native
}

object SetKeyframeKeyRequest {
  @scala.inline
  def apply(keyText: String, range: SourceRange, styleSheetId: StyleSheetId): SetKeyframeKeyRequest = {
    val __obj = js.Dynamic.literal(keyText = keyText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeyframeKeyRequest]
  }
  @scala.inline
  implicit class SetKeyframeKeyRequestOps[Self <: SetKeyframeKeyRequest] (val x: Self) extends AnyVal {
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
    def setKeyText(value: String): Self = this.set("keyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: SourceRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
  }
  
}

