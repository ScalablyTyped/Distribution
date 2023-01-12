package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  sheetName :string,   row :number,   col :number}> */
trait PartialsheetNamestringrow extends StObject {
  
  var col: js.UndefOr[Double] = js.undefined
  
  var row: js.UndefOr[Double] = js.undefined
  
  var sheetName: js.UndefOr[String] = js.undefined
}
object PartialsheetNamestringrow {
  
  inline def apply(): PartialsheetNamestringrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialsheetNamestringrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialsheetNamestringrow] (val x: Self) extends AnyVal {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    inline def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
  }
}
