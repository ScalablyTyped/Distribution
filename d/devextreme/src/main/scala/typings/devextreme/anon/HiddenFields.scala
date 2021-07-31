package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxGantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HiddenFields extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var component: js.UndefOr[dxGantt] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var hiddenFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var readOnlyFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var values: js.UndefOr[js.Any] = js.undefined
}
object HiddenFields {
  
  @scala.inline
  def apply(): HiddenFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenFields]
  }
  
  @scala.inline
  implicit class HiddenFieldsMutableBuilder[Self <: HiddenFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setHiddenFields(value: js.Array[String]): Self = StObject.set(x, "hiddenFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenFieldsUndefined: Self = StObject.set(x, "hiddenFields", js.undefined)
    
    @scala.inline
    def setHiddenFieldsVarargs(value: String*): Self = StObject.set(x, "hiddenFields", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setReadOnlyFields(value: js.Array[String]): Self = StObject.set(x, "readOnlyFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyFieldsUndefined: Self = StObject.set(x, "readOnlyFields", js.undefined)
    
    @scala.inline
    def setReadOnlyFieldsVarargs(value: String*): Self = StObject.set(x, "readOnlyFields", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
