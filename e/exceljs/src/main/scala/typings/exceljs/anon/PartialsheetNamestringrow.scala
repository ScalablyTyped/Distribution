package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  sheetName :string,   row :number,   col :number}> */
@js.native
trait PartialsheetNamestringrow extends StObject {
  
  var col: js.UndefOr[Double] = js.native
  
  var row: js.UndefOr[Double] = js.native
  
  var sheetName: js.UndefOr[String] = js.native
}
object PartialsheetNamestringrow {
  
  @scala.inline
  def apply(): PartialsheetNamestringrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialsheetNamestringrow]
  }
  
  @scala.inline
  implicit class PartialsheetNamestringrowMutableBuilder[Self <: PartialsheetNamestringrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColUndefined: Self = StObject.set(x, "col", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
  }
}
