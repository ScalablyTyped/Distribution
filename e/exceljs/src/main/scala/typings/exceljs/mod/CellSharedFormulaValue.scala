package typings.exceljs.mod

import typings.exceljs.anon.Error
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellSharedFormulaValue extends _CellValue {
  var date1904: Boolean = js.native
  val formula: js.UndefOr[String] = js.native
  var result: js.UndefOr[Double | String | Date | Error] = js.native
  var sharedFormula: String = js.native
}

object CellSharedFormulaValue {
  @scala.inline
  def apply(date1904: Boolean, sharedFormula: String): CellSharedFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], sharedFormula = sharedFormula.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSharedFormulaValue]
  }
  @scala.inline
  implicit class CellSharedFormulaValueOps[Self <: CellSharedFormulaValue] (val x: Self) extends AnyVal {
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
    def setDate1904(value: Boolean): Self = this.set("date1904", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedFormula(value: String): Self = this.set("sharedFormula", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    @scala.inline
    def setResult(value: Double | String | Date | Error): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

