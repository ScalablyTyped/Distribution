package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRuleRequest extends js.Object {
  /**
    * Text position of a new rule in the target style sheet.
    */
  var location: SourceRange = js.native
  /**
    * The text of a new rule.
    */
  var ruleText: String = js.native
  /**
    * The css style sheet identifier where a new rule should be inserted.
    */
  var styleSheetId: StyleSheetId = js.native
}

object AddRuleRequest {
  @scala.inline
  def apply(location: SourceRange, ruleText: String, styleSheetId: StyleSheetId): AddRuleRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], ruleText = ruleText.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRuleRequest]
  }
  @scala.inline
  implicit class AddRuleRequestOps[Self <: AddRuleRequest] (val x: Self) extends AnyVal {
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
    def setLocation(value: SourceRange): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleText(value: String): Self = this.set("ruleText", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
  }
  
}

