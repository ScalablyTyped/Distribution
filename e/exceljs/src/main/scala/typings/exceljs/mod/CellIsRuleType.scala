package typings.exceljs.mod

import typings.exceljs.exceljsStrings.cellIs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellIsRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var formulae: js.UndefOr[js.Array[_]] = js.native
  var operator: js.UndefOr[CellIsOperators] = js.native
  var `type`: cellIs = js.native
}

object CellIsRuleType {
  @scala.inline
  def apply(priority: Double, `type`: cellIs): CellIsRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellIsRuleType]
  }
  @scala.inline
  implicit class CellIsRuleTypeOps[Self <: CellIsRuleType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: cellIs): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormulaeVarargs(value: js.Any*): Self = this.set("formulae", js.Array(value :_*))
    @scala.inline
    def setFormulae(value: js.Array[_]): Self = this.set("formulae", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulae: Self = this.set("formulae", js.undefined)
    @scala.inline
    def setOperator(value: CellIsOperators): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
  }
  
}

