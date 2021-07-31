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
  
  @scala.inline
  def apply(): FormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormData]
  }
  
  @scala.inline
  implicit class FormDataMutableBuilder[Self <: FormData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
  }
}
