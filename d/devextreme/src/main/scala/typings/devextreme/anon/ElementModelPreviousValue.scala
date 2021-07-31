package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementModelPreviousValue extends StObject {
  
  var component: js.UndefOr[dxFilterBuilder] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var previousValue: js.UndefOr[js.Any] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object ElementModelPreviousValue {
  
  @scala.inline
  def apply(): ElementModelPreviousValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementModelPreviousValue]
  }
  
  @scala.inline
  implicit class ElementModelPreviousValueMutableBuilder[Self <: ElementModelPreviousValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxFilterBuilder): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setPreviousValue(value: js.Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
