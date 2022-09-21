package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column[TRowData, TKey] extends StObject {
  
  var column: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxDataGrid.Column[TRowData, TKey]] = js.undefined
  
  var component: js.UndefOr[dxDataGrid[TRowData, TKey]] = js.undefined
  
  var row: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxDataGrid.Row[TRowData, TKey]] = js.undefined
}
object Column {
  
  inline def apply[TRowData, TKey](): Column[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column[TRowData, TKey]]
  }
  
  extension [Self <: Column[?, ?], TRowData, TKey](x: Self & (Column[TRowData, TKey])) {
    
    inline def setColumn(value: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setRow(value: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
