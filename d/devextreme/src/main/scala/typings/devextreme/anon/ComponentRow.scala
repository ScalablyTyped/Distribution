package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRow extends StObject {
  
  var component: js.UndefOr[dxDataGrid] = js.undefined
  
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
}
object ComponentRow {
  
  inline def apply(): ComponentRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRow]
  }
  
  extension [Self <: ComponentRow](x: Self) {
    
    inline def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setRow(value: dxDataGridRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
