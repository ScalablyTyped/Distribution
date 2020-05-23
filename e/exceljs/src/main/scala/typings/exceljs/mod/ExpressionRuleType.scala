package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import typings.exceljs.exceljsStrings.expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var formulae: js.UndefOr[js.Array[_]] = js.undefined
  var `type`: expression
}

object ExpressionRuleType {
  @scala.inline
  def apply(priority: Double, `type`: expression, formulae: js.Array[_] = null, style: PartialStyle = null): ExpressionRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (formulae != null) __obj.updateDynamic("formulae")(formulae.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionRuleType]
  }
}

