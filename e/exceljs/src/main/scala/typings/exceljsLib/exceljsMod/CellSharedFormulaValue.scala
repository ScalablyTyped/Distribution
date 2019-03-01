package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSharedFormulaValue extends _CellValue {
  val formula: js.UndefOr[java.lang.String] = js.undefined
  var result: scala.Double | java.lang.String | stdLib.Date
  var sharedFormula: java.lang.String
}

object CellSharedFormulaValue {
  @scala.inline
  def apply(
    result: scala.Double | java.lang.String | stdLib.Date,
    sharedFormula: java.lang.String,
    formula: java.lang.String = null
  ): CellSharedFormulaValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.updateDynamic("sharedFormula")(sharedFormula)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    __obj.asInstanceOf[CellSharedFormulaValue]
  }
}

