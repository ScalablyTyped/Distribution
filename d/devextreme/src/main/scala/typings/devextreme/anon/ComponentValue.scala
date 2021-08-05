package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDropDownBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentValue extends StObject {
  
  var component: js.UndefOr[dxDropDownBox] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object ComponentValue {
  
  inline def apply(): ComponentValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentValue]
  }
  
  extension [Self <: ComponentValue](x: Self) {
    
    inline def setComponent(value: dxDropDownBox): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
