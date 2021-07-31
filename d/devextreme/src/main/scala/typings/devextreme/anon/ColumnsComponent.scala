package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnsComponent extends StObject {
  
  var columns: js.UndefOr[js.Array[dxTreeListColumn]] = js.undefined
  
  var component: js.UndefOr[dxTreeList] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  
  var isNewRow: js.UndefOr[Boolean] = js.undefined
  
  var isSelected: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var rowElement: js.UndefOr[dxElement] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  var rowType: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object ColumnsComponent {
  
  @scala.inline
  def apply(): ColumnsComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnsComponent]
  }
  
  @scala.inline
  implicit class ColumnsComponentMutableBuilder[Self <: ColumnsComponent] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    @scala.inline
    def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setRowElement(value: dxElement): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowElementUndefined: Self = StObject.set(x, "rowElement", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
