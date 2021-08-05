package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHighlighted extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var cellElement: js.UndefOr[dxElement] = js.undefined
  
  var columns: js.UndefOr[js.Array[dxTreeListColumn]] = js.undefined
  
  var component: js.UndefOr[dxTreeList] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var isHighlighted: js.UndefOr[Boolean] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var newColumnIndex: js.UndefOr[Double] = js.undefined
  
  var newRowIndex: js.UndefOr[Double] = js.undefined
  
  var prevColumnIndex: js.UndefOr[Double] = js.undefined
  
  var prevRowIndex: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[js.Array[dxTreeListRowObject]] = js.undefined
}
object IsHighlighted {
  
  inline def apply(): IsHighlighted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsHighlighted]
  }
  
  extension [Self <: IsHighlighted](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setCellElement(value: dxElement): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    
    inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
    
    inline def setColumns(value: js.Array[dxTreeListColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: dxTreeListColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setComponent(value: dxTreeList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
    
    inline def setIsHighlightedUndefined: Self = StObject.set(x, "isHighlighted", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNewColumnIndex(value: Double): Self = StObject.set(x, "newColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setNewColumnIndexUndefined: Self = StObject.set(x, "newColumnIndex", js.undefined)
    
    inline def setNewRowIndex(value: Double): Self = StObject.set(x, "newRowIndex", value.asInstanceOf[js.Any])
    
    inline def setNewRowIndexUndefined: Self = StObject.set(x, "newRowIndex", js.undefined)
    
    inline def setPrevColumnIndex(value: Double): Self = StObject.set(x, "prevColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setPrevColumnIndexUndefined: Self = StObject.set(x, "prevColumnIndex", js.undefined)
    
    inline def setPrevRowIndex(value: Double): Self = StObject.set(x, "prevRowIndex", value.asInstanceOf[js.Any])
    
    inline def setPrevRowIndexUndefined: Self = StObject.set(x, "prevRowIndex", js.undefined)
    
    inline def setRows(value: js.Array[dxTreeListRowObject]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: dxTreeListRowObject*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
