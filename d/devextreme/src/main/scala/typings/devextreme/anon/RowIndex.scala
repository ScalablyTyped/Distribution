package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowIndex extends StObject {
  
  var column: js.UndefOr[this.type] = js.undefined
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var component: js.UndefOr[dxDataGrid] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var displayValue: js.UndefOr[js.Any] = js.undefined
  
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  var rowType: js.UndefOr[String] = js.undefined
  
  var setValue: js.UndefOr[js.Any] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
  
  var watch: js.UndefOr[js.Function] = js.undefined
}
object RowIndex {
  
  inline def apply(): RowIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowIndex]
  }
  
  extension [Self <: RowIndex](x: Self) {
    
    inline def setColumn(value: RowIndex): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisplayValue(value: js.Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
    
    inline def setRow(value: dxDataGridRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    
    inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setSetValue(value: js.Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
