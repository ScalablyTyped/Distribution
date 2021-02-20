package typings.exceljs.mod

import typings.exceljs.anon.Error
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class CellSharedFormulaValueMutableBuilder[Self <: CellSharedFormulaValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate1904(value: Boolean): Self = StObject.set(x, "date1904", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setResult(value: Double | String | Date | Error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setSharedFormula(value: String): Self = StObject.set(x, "sharedFormula", value.asInstanceOf[js.Any])
  }
}
