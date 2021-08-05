package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxGantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedRowKey extends StObject {
  
  var component: js.UndefOr[dxGantt] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var selectedRowKey: js.UndefOr[js.Any] = js.undefined
}
object SelectedRowKey {
  
  inline def apply(): SelectedRowKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedRowKey]
  }
  
  extension [Self <: SelectedRowKey](x: Self) {
    
    inline def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSelectedRowKey(value: js.Any): Self = StObject.set(x, "selectedRowKey", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowKeyUndefined: Self = StObject.set(x, "selectedRowKey", js.undefined)
  }
}
