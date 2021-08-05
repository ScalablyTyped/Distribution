package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxGantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValues extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var component: js.UndefOr[dxGantt] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var newValues: js.UndefOr[js.Any] = js.undefined
  
  var values: js.UndefOr[js.Any] = js.undefined
}
object NewValues {
  
  inline def apply(): NewValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewValues]
  }
  
  extension [Self <: NewValues](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNewValues(value: js.Any): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
    
    inline def setNewValuesUndefined: Self = StObject.set(x, "newValues", js.undefined)
    
    inline def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
