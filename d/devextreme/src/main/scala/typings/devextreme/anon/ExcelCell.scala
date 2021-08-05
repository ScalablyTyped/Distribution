package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.excelExporter.ExcelDataGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelCell extends StObject {
  
  var excelCell: js.UndefOr[js.Any] = js.undefined
  
  var gridCell: js.UndefOr[ExcelDataGridCell] = js.undefined
}
object ExcelCell {
  
  inline def apply(): ExcelCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelCell]
  }
  
  extension [Self <: ExcelCell](x: Self) {
    
    inline def setExcelCell(value: js.Any): Self = StObject.set(x, "excelCell", value.asInstanceOf[js.Any])
    
    inline def setExcelCellUndefined: Self = StObject.set(x, "excelCell", js.undefined)
    
    inline def setGridCell(value: ExcelDataGridCell): Self = StObject.set(x, "gridCell", value.asInstanceOf[js.Any])
    
    inline def setGridCellUndefined: Self = StObject.set(x, "gridCell", js.undefined)
  }
}
