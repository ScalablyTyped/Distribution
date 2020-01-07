package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule that may or may not match, depending on the condition.
  */
@js.native
trait Schema$BooleanRule extends js.Object {
  /**
    * The condition of the rule. If the condition evaluates to true, the format
    * is applied.
    */
  var condition: js.UndefOr[Schema$BooleanCondition] = js.native
  /**
    * The format to apply. Conditional formatting can only apply a subset of
    * formatting: bold, italic, strikethrough, foreground color &amp;
    * background color.
    */
  var format: js.UndefOr[Schema$CellFormat] = js.native
}

object Schema$BooleanRule {
  @scala.inline
  def apply(condition: Schema$BooleanCondition = null, format: Schema$CellFormat = null): Schema$BooleanRule = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BooleanRule]
  }
}

