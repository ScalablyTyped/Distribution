package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import typings.exceljs.exceljsStrings.timePeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePeriodRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var timePeriod: js.UndefOr[TimePeriodTypes] = js.undefined
  var `type`: timePeriod
}

object TimePeriodRuleType {
  @scala.inline
  def apply(
    priority: Double,
    `type`: timePeriod,
    style: PartialStyle = null,
    timePeriod: TimePeriodTypes = null
  ): TimePeriodRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (timePeriod != null) __obj.updateDynamic("timePeriod")(timePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePeriodRuleType]
  }
}

