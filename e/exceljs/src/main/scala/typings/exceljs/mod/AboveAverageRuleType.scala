package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import typings.exceljs.exceljsStrings.aboveAverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboveAverageRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var aboveAverage: Boolean
  var `type`: aboveAverage
}

object AboveAverageRuleType {
  @scala.inline
  def apply(aboveAverage: Boolean, priority: Double, `type`: aboveAverage, style: PartialStyle = null): AboveAverageRuleType = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboveAverageRuleType]
  }
}

