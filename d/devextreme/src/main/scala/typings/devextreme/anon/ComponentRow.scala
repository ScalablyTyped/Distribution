package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRow[TRowData, TKey] extends StObject {
  
  var component: js.UndefOr[dxDataGrid[TRowData, TKey]] = js.undefined
  
  var row: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxDataGrid.Row[TRowData, TKey]] = js.undefined
}
object ComponentRow {
  
  inline def apply[TRowData, TKey](): ComponentRow[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRow[TRowData, TKey]]
  }
  
  extension [Self <: ComponentRow[?, ?], TRowData, TKey](x: Self & (ComponentRow[TRowData, TKey])) {
    
    inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setRow(value: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
