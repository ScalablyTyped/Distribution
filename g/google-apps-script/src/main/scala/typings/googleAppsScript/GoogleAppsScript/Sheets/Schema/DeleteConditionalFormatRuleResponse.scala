package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConditionalFormatRuleResponse extends js.Object {
  var rule: js.UndefOr[ConditionalFormatRule] = js.native
}

object DeleteConditionalFormatRuleResponse {
  @scala.inline
  def apply(): DeleteConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConditionalFormatRuleResponse]
  }
  @scala.inline
  implicit class DeleteConditionalFormatRuleResponseOps[Self <: DeleteConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
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
    def setRule(value: ConditionalFormatRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
  
}

