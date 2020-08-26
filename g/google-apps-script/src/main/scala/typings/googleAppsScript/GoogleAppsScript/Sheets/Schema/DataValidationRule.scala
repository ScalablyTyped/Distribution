package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValidationRule extends js.Object {
  var condition: js.UndefOr[BooleanCondition] = js.native
  var inputMessage: js.UndefOr[String] = js.native
  var showCustomUi: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object DataValidationRule {
  @scala.inline
  def apply(): DataValidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationRule]
  }
  @scala.inline
  implicit class DataValidationRuleOps[Self <: DataValidationRule] (val x: Self) extends AnyVal {
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
    def setCondition(value: BooleanCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setInputMessage(value: String): Self = this.set("inputMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMessage: Self = this.set("inputMessage", js.undefined)
    @scala.inline
    def setShowCustomUi(value: Boolean): Self = this.set("showCustomUi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCustomUi: Self = this.set("showCustomUi", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

