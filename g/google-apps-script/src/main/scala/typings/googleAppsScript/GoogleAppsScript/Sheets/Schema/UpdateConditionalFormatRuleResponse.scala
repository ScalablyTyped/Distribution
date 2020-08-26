package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConditionalFormatRuleResponse extends js.Object {
  var newIndex: js.UndefOr[Double] = js.native
  var newRule: js.UndefOr[ConditionalFormatRule] = js.native
  var oldIndex: js.UndefOr[Double] = js.native
  var oldRule: js.UndefOr[ConditionalFormatRule] = js.native
}

object UpdateConditionalFormatRuleResponse {
  @scala.inline
  def apply(): UpdateConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConditionalFormatRuleResponse]
  }
  @scala.inline
  implicit class UpdateConditionalFormatRuleResponseOps[Self <: UpdateConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
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
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewIndex: Self = this.set("newIndex", js.undefined)
    @scala.inline
    def setNewRule(value: ConditionalFormatRule): Self = this.set("newRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewRule: Self = this.set("newRule", js.undefined)
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldIndex: Self = this.set("oldIndex", js.undefined)
    @scala.inline
    def setOldRule(value: ConditionalFormatRule): Self = this.set("oldRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldRule: Self = this.set("oldRule", js.undefined)
  }
  
}

