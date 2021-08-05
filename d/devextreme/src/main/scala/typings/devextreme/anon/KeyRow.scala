package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRow extends StObject {
  
  var column: js.UndefOr[dxTreeListColumn] = js.undefined
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var component: js.UndefOr[dxTreeList] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
  
  var row: js.UndefOr[dxTreeListRowObject] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  var rowType: js.UndefOr[String] = js.undefined
}
object KeyRow {
  
  inline def apply(): KeyRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRow]
  }
  
  extension [Self <: KeyRow](x: Self) {
    
    inline def setColumn(value: dxTreeListColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setComponent(value: dxTreeList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRow(value: dxTreeListRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    
    inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
