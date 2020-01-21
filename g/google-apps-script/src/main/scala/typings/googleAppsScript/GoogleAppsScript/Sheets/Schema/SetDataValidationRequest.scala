package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDataValidationRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.undefined
  var rule: js.UndefOr[DataValidationRule] = js.undefined
}

object SetDataValidationRequest {
  @scala.inline
  def apply(range: GridRange = null, rule: DataValidationRule = null): SetDataValidationRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDataValidationRequest]
  }
}

