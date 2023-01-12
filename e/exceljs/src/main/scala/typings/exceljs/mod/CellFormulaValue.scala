package typings.exceljs.mod

import typings.exceljs.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellFormulaValue
  extends StObject
     with _CellValue {
  
  var date1904: Boolean
  
  var formula: String
  
  var result: js.UndefOr[Double | String | js.Date | Error] = js.undefined
}
object CellFormulaValue {
  
  inline def apply(date1904: Boolean, formula: String): CellFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFormulaValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellFormulaValue] (val x: Self) extends AnyVal {
    
    inline def setDate1904(value: Boolean): Self = StObject.set(x, "date1904", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Double | String | js.Date | Error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
