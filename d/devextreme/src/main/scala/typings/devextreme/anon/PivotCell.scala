package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.excelExporter.ExcelPivotGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotCell extends StObject {
  
  var excelCell: js.UndefOr[js.Any] = js.native
  
  var pivotCell: js.UndefOr[ExcelPivotGridCell] = js.native
}
object PivotCell {
  
  @scala.inline
  def apply(): PivotCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotCell]
  }
  
  @scala.inline
  implicit class PivotCellMutableBuilder[Self <: PivotCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcelCell(value: js.Any): Self = StObject.set(x, "excelCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelCellUndefined: Self = StObject.set(x, "excelCell", js.undefined)
    
    @scala.inline
    def setPivotCell(value: ExcelPivotGridCell): Self = StObject.set(x, "pivotCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotCellUndefined: Self = StObject.set(x, "pivotCell", js.undefined)
  }
}
