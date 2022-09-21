package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxTreeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row[TRowData, TKey] extends StObject {
  
  val column: typings.devextreme.mod.DevExpress.ui.dxTreeList.Column[TRowData, TKey]
  
  val component: dxTreeList[TRowData, TKey]
  
  val row: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxTreeList.Row[TRowData, TKey]] = js.undefined
}
object Row {
  
  inline def apply[TRowData, TKey](
    column: typings.devextreme.mod.DevExpress.ui.dxTreeList.Column[TRowData, TKey],
    component: dxTreeList[TRowData, TKey]
  ): Row[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row[TRowData, TKey]]
  }
  
  extension [Self <: Row[?, ?], TRowData, TKey](x: Self & (Row[TRowData, TKey])) {
    
    inline def setColumn(value: typings.devextreme.mod.DevExpress.ui.dxTreeList.Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setRow(value: typings.devextreme.mod.DevExpress.ui.dxTreeList.Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
