package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule describing a conditional format.
  */
@js.native
trait Schema$ConditionalFormatRule extends js.Object {
  /**
    * The formatting is either &quot;on&quot; or &quot;off&quot; according to
    * the rule.
    */
  var booleanRule: js.UndefOr[Schema$BooleanRule] = js.native
  /**
    * The formatting will vary based on the gradients in the rule.
    */
  var gradientRule: js.UndefOr[Schema$GradientRule] = js.native
  /**
    * The ranges that are formatted if the condition is true. All the ranges
    * must be on the same grid.
    */
  var ranges: js.UndefOr[js.Array[Schema$GridRange]] = js.native
}

object Schema$ConditionalFormatRule {
  @scala.inline
  def apply(
    booleanRule: Schema$BooleanRule = null,
    gradientRule: Schema$GradientRule = null,
    ranges: js.Array[Schema$GridRange] = null
  ): Schema$ConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    if (booleanRule != null) __obj.updateDynamic("booleanRule")(booleanRule.asInstanceOf[js.Any])
    if (gradientRule != null) __obj.updateDynamic("gradientRule")(gradientRule.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConditionalFormatRule]
  }
}

