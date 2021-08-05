package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typings.devextreme.mod.DevExpress.ui.dxTreeListNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var columns: js.UndefOr[js.Array[dxTreeListColumn]] = js.undefined
  
  var component: js.UndefOr[dxTreeList] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  
  var isNewRow: js.UndefOr[Boolean] = js.undefined
  
  var isSelected: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var node: js.UndefOr[dxTreeListNode] = js.undefined
  
  var rowElement: js.UndefOr[dxElement] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  var rowType: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object Node {
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setColumns(value: js.Array[dxTreeListColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: dxTreeListColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setComponent(value: dxTreeList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
    
    inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNode(value: dxTreeListNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setRowElement(value: dxElement): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
    
    inline def setRowElementUndefined: Self = StObject.set(x, "rowElement", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    
    inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
    
    inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
