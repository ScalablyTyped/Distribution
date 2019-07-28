package typings.exceljs.exceljsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormulaValue extends _CellValue {
  var formula: String
  var result: Double | String | Date
}

object CellFormulaValue {
  @scala.inline
  def apply(formula: String, result: Double | String | Date): CellFormulaValue = {
    val __obj = js.Dynamic.literal(formula = formula, result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellFormulaValue]
  }
}

