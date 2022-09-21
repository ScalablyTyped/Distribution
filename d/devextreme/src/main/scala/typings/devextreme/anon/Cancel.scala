package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.pdfExporter.Cell
import typings.devextreme.mod.DevExpress.pdfExporter.DataGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var doc: js.UndefOr[Any] = js.undefined
  
  var gridCell: js.UndefOr[DataGridCell] = js.undefined
  
  var pdfCell: js.UndefOr[Cell] = js.undefined
  
  var rect: js.UndefOr[H] = js.undefined
}
object Cancel {
  
  inline def apply(): Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setDoc(value: Any): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setGridCell(value: DataGridCell): Self = StObject.set(x, "gridCell", value.asInstanceOf[js.Any])
    
    inline def setGridCellUndefined: Self = StObject.set(x, "gridCell", js.undefined)
    
    inline def setPdfCell(value: Cell): Self = StObject.set(x, "pdfCell", value.asInstanceOf[js.Any])
    
    inline def setPdfCellUndefined: Self = StObject.set(x, "pdfCell", js.undefined)
    
    inline def setRect(value: H): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
  }
}
