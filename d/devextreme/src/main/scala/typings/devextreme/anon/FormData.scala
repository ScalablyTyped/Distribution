package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxForm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormData extends StObject {
  
  var component: js.UndefOr[dxForm] = js.undefined
  
  var formData: js.UndefOr[js.Any] = js.undefined
}
object FormData {
  
  inline def apply(): FormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormData]
  }
  
  extension [Self <: FormData](x: Self) {
    
    inline def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
  }
}
