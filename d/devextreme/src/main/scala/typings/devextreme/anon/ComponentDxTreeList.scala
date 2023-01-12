package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxTreeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDxTreeList[TRowData, TKey] extends StObject {
  
  val component: dxTreeList[TRowData, TKey]
  
  val row: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxTreeList.Row[TRowData, TKey]] = js.undefined
}
object ComponentDxTreeList {
  
  inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey]): ComponentDxTreeList[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDxTreeList[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentDxTreeList[?, ?], TRowData, TKey] (val x: Self & (ComponentDxTreeList[TRowData, TKey])) extends AnyVal {
    
    inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setRow(value: typings.devextreme.mod.DevExpress.ui.dxTreeList.Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
