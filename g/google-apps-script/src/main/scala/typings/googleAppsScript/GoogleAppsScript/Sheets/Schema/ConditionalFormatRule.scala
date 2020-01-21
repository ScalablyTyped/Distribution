package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalFormatRule extends js.Object {
  var booleanRule: js.UndefOr[BooleanRule] = js.undefined
  var gradientRule: js.UndefOr[GradientRule] = js.undefined
  var ranges: js.UndefOr[js.Array[GridRange]] = js.undefined
}

object ConditionalFormatRule {
  @scala.inline
  def apply(
    booleanRule: BooleanRule = null,
    gradientRule: GradientRule = null,
    ranges: js.Array[GridRange] = null
  ): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    if (booleanRule != null) __obj.updateDynamic("booleanRule")(booleanRule.asInstanceOf[js.Any])
    if (gradientRule != null) __obj.updateDynamic("gradientRule")(gradientRule.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormatRule]
  }
}

