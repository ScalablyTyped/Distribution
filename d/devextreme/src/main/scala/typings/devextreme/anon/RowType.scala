package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowType extends StObject {
  
  var column: js.UndefOr[dxDataGridColumn] = js.undefined
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var component: js.UndefOr[dxDataGrid] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
  
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  var rowType: js.UndefOr[String] = js.undefined
}
object RowType {
  
  @scala.inline
  def apply(): RowType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowType]
  }
  
  @scala.inline
  implicit class RowTypeMutableBuilder[Self <: RowType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: dxDataGridColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRow(value: dxDataGridRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
