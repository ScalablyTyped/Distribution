package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsHighlighted extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var cellElement: js.UndefOr[dxElement] = js.native
  
  var columns: js.UndefOr[js.Array[dxTreeListColumn]] = js.native
  
  var component: js.UndefOr[dxTreeList] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  
  var isHighlighted: js.UndefOr[Boolean] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var newColumnIndex: js.UndefOr[Double] = js.native
  
  var newRowIndex: js.UndefOr[Double] = js.native
  
  var prevColumnIndex: js.UndefOr[Double] = js.native
  
  var prevRowIndex: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[js.Array[dxTreeListRowObject]] = js.native
}
object IsHighlighted {
  
  @scala.inline
  def apply(): IsHighlighted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsHighlighted]
  }
  
  @scala.inline
  implicit class IsHighlightedMutableBuilder[Self <: IsHighlighted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setCellElement(value: dxElement): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[dxTreeListColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: dxTreeListColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setComponent(value: dxTreeList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setRows(value: js.Array[dxTreeListRowObject]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: dxTreeListRowObject*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
