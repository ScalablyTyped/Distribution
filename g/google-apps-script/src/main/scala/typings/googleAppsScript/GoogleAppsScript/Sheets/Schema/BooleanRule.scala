package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanRule extends js.Object {
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  var format: js.UndefOr[CellFormat] = js.undefined
}

object BooleanRule {
  @scala.inline
  def apply(condition: BooleanCondition = null, format: CellFormat = null): BooleanRule = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanRule]
  }
}

