package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRuleSelectorRequest extends js.Object {
  var range: SourceRange = js.native
  var selector: String = js.native
  var styleSheetId: StyleSheetId = js.native
}

object SetRuleSelectorRequest {
  @scala.inline
  def apply(range: SourceRange, selector: String, styleSheetId: StyleSheetId): SetRuleSelectorRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRuleSelectorRequest]
  }
  @scala.inline
  implicit class SetRuleSelectorRequestOps[Self <: SetRuleSelectorRequest] (val x: Self) extends AnyVal {
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
    def setRange(value: SourceRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
  }
  
}

