package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanRule extends js.Object {
  /**
    * The condition of the rule. If the condition evaluates to true,
    * the format is applied.
    */
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  /**
    * The format to apply.
    * Conditional formatting can only apply a subset of formatting:
    * bold, italic,
    * strikethrough,
    * foreground color &
    * background color.
    */
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

