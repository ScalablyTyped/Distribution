package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import typings.exceljs.exceljsStrings.cellIs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellIsRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var formulae: js.UndefOr[js.Array[_]] = js.undefined
  var operator: js.UndefOr[CellIsOperators] = js.undefined
  var `type`: cellIs
}

object CellIsRuleType {
  @scala.inline
  def apply(
    priority: Double,
    `type`: cellIs,
    formulae: js.Array[_] = null,
    operator: CellIsOperators = null,
    style: PartialStyle = null
  ): CellIsRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (formulae != null) __obj.updateDynamic("formulae")(formulae.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellIsRuleType]
  }
}

