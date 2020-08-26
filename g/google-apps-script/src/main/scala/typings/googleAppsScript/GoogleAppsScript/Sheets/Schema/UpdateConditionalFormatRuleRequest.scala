package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConditionalFormatRuleRequest extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var newIndex: js.UndefOr[Double] = js.native
  var rule: js.UndefOr[ConditionalFormatRule] = js.native
  var sheetId: js.UndefOr[Double] = js.native
}

object UpdateConditionalFormatRuleRequest {
  @scala.inline
  def apply(): UpdateConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConditionalFormatRuleRequest]
  }
  @scala.inline
  implicit class UpdateConditionalFormatRuleRequestOps[Self <: UpdateConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
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
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewIndex: Self = this.set("newIndex", js.undefined)
    @scala.inline
    def setRule(value: ConditionalFormatRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
  
}

