package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddConditionalFormatRuleRequest extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var rule: js.UndefOr[ConditionalFormatRule] = js.native
}

object AddConditionalFormatRuleRequest {
  @scala.inline
  def apply(): AddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddConditionalFormatRuleRequest]
  }
  @scala.inline
  implicit class AddConditionalFormatRuleRequestOps[Self <: AddConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setRule(value: ConditionalFormatRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
  
}

