package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormulaValue extends _CellValue {
  var formula: java.lang.String
  var result: scala.Double | java.lang.String | stdLib.Date
}

object CellFormulaValue {
  @scala.inline
  def apply(formula: java.lang.String, result: scala.Double | java.lang.String | stdLib.Date): CellFormulaValue = {
    val __obj = js.Dynamic.literal(formula = formula, result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellFormulaValue]
  }
}

