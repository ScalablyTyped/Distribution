package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalFormattingBaseRule extends js.Object {
  var priority: Double
  var style: js.UndefOr[PartialStyle] = js.undefined
}

object ConditionalFormattingBaseRule {
  @scala.inline
  def apply(priority: Double, style: PartialStyle = null): ConditionalFormattingBaseRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingBaseRule]
  }
}

