package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var cellElement: js.UndefOr[dxElement] = js.undefined
  
  var columns: js.UndefOr[js.Array[dxDataGridColumn]] = js.undefined
  
  var component: js.UndefOr[dxDataGrid] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var isHighlighted: js.UndefOr[Boolean] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var newColumnIndex: js.UndefOr[Double] = js.undefined
  
  var newRowIndex: js.UndefOr[Double] = js.undefined
  
  var prevColumnIndex: js.UndefOr[Double] = js.undefined
  
  var prevRowIndex: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[js.Array[dxDataGridRowObject]] = js.undefined
}
object Columns {
  
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setCellElement(value: dxElement): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[dxDataGridColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: dxDataGridColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHighlightedUndefined: Self = StObject.set(x, "isHighlighted", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNewColumnIndex(value: Double): Self = StObject.set(x, "newColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewColumnIndexUndefined: Self = StObject.set(x, "newColumnIndex", js.undefined)
    
    @scala.inline
    def setNewRowIndex(value: Double): Self = StObject.set(x, "newRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewRowIndexUndefined: Self = StObject.set(x, "newRowIndex", js.undefined)
    
    @scala.inline
    def setPrevColumnIndex(value: Double): Self = StObject.set(x, "prevColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevColumnIndexUndefined: Self = StObject.set(x, "prevColumnIndex", js.undefined)
    
    @scala.inline
    def setPrevRowIndex(value: Double): Self = StObject.set(x, "prevRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevRowIndexUndefined: Self = StObject.set(x, "prevRowIndex", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[dxDataGridRowObject]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: dxDataGridRowObject*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
