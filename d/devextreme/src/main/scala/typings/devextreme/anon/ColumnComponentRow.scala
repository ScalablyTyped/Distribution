package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnComponentRow extends StObject {
  
  var column: js.UndefOr[dxDataGridColumn] = js.undefined
  
  var component: js.UndefOr[dxDataGrid] = js.undefined
  
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
}
object ColumnComponentRow {
  
  @scala.inline
  def apply(): ColumnComponentRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnComponentRow]
  }
  
  @scala.inline
  implicit class ColumnComponentRowMutableBuilder[Self <: ColumnComponentRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: dxDataGridColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setRow(value: dxDataGridRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
