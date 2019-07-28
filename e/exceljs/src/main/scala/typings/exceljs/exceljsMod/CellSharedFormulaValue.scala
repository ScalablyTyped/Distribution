package typings.exceljs.exceljsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSharedFormulaValue extends _CellValue {
  val formula: js.UndefOr[String] = js.undefined
  var result: Double | String | Date
  var sharedFormula: String
}

object CellSharedFormulaValue {
  @scala.inline
  def apply(result: Double | String | Date, sharedFormula: String, formula: String = null): CellSharedFormulaValue = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], sharedFormula = sharedFormula)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    __obj.asInstanceOf[CellSharedFormulaValue]
  }
}

