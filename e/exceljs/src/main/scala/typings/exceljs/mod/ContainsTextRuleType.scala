package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import typings.exceljs.exceljsStrings.containsText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainsTextRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var operator: js.UndefOr[ContainsTextOperators] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: containsText
}

object ContainsTextRuleType {
  @scala.inline
  def apply(
    priority: Double,
    `type`: containsText,
    operator: ContainsTextOperators = null,
    style: PartialStyle = null,
    text: String = null
  ): ContainsTextRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsTextRuleType]
  }
}

