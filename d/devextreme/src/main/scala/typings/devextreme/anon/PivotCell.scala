package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.excelExporter.PivotGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotCell extends StObject {
  
  var excelCell: js.UndefOr[Any] = js.undefined
  
  var pivotCell: js.UndefOr[PivotGridCell] = js.undefined
}
object PivotCell {
  
  inline def apply(): PivotCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotCell]
  }
  
  extension [Self <: PivotCell](x: Self) {
    
    inline def setExcelCell(value: Any): Self = StObject.set(x, "excelCell", value.asInstanceOf[js.Any])
    
    inline def setExcelCellUndefined: Self = StObject.set(x, "excelCell", js.undefined)
    
    inline def setPivotCell(value: PivotGridCell): Self = StObject.set(x, "pivotCell", value.asInstanceOf[js.Any])
    
    inline def setPivotCellUndefined: Self = StObject.set(x, "pivotCell", js.undefined)
  }
}
