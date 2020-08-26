package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConditionalFormatRuleRequest extends js.Object {
  /** The zero-based index of the rule to be deleted. */
  var index: js.UndefOr[Double] = js.native
  /** The sheet the rule is being deleted from. */
  var sheetId: js.UndefOr[Double] = js.native
}

object DeleteConditionalFormatRuleRequest {
  @scala.inline
  def apply(): DeleteConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConditionalFormatRuleRequest]
  }
  @scala.inline
  implicit class DeleteConditionalFormatRuleRequestOps[Self <: DeleteConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
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
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
  
}

