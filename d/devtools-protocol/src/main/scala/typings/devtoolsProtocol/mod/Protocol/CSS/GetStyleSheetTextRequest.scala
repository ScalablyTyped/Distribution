package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStyleSheetTextRequest extends js.Object {
  var styleSheetId: StyleSheetId = js.native
}

object GetStyleSheetTextRequest {
  @scala.inline
  def apply(styleSheetId: StyleSheetId): GetStyleSheetTextRequest = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStyleSheetTextRequest]
  }
  @scala.inline
  implicit class GetStyleSheetTextRequestOps[Self <: GetStyleSheetTextRequest] (val x: Self) extends AnyVal {
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
  }
  
}

