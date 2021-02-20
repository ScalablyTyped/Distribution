package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.excelExporter.ExcelDataGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelCell extends StObject {
  
  var excelCell: js.UndefOr[js.Any] = js.native
  
  var gridCell: js.UndefOr[ExcelDataGridCell] = js.native
}
object ExcelCell {
  
  @scala.inline
  def apply(): ExcelCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelCell]
  }
  
  @scala.inline
  implicit class ExcelCellMutableBuilder[Self <: ExcelCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcelCell(value: js.Any): Self = StObject.set(x, "excelCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelCellUndefined: Self = StObject.set(x, "excelCell", js.undefined)
    
    @scala.inline
    def setGridCell(value: ExcelDataGridCell): Self = StObject.set(x, "gridCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridCellUndefined: Self = StObject.set(x, "gridCell", js.undefined)
  }
}
