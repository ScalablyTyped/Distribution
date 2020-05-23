package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import typings.exceljs.exceljsStrings.top10
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Top10RuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var bottom: Boolean
  var percent: Boolean
  var rank: Double
  var `type`: top10
}

object Top10RuleType {
  @scala.inline
  def apply(
    bottom: Boolean,
    percent: Boolean,
    priority: Double,
    rank: Double,
    `type`: top10,
    style: PartialStyle = null
  ): Top10RuleType = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top10RuleType]
  }
}

