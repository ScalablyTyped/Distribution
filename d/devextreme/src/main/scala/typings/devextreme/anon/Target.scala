package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var column: js.UndefOr[dxTreeListColumn] = js.undefined
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var component: js.UndefOr[dxTreeList] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var row: js.UndefOr[dxTreeListRowObject] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var targetElement: js.UndefOr[dxElement] = js.undefined
}
object Target {
  
  inline def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setColumn(value: dxTreeListColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setComponent(value: dxTreeList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setRow(value: dxTreeListRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetElement(value: dxElement): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    inline def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
