package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelSelectedItem[T] extends StObject {
  
  var component: js.UndefOr[T] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var selectedItem: js.UndefOr[js.Any] = js.undefined
}
object ModelSelectedItem {
  
  @scala.inline
  def apply[T](): ModelSelectedItem[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelSelectedItem[T]]
  }
  
  @scala.inline
  implicit class ModelSelectedItemMutableBuilder[Self <: ModelSelectedItem[?], T] (val x: Self & ModelSelectedItem[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setSelectedItem(value: js.Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
  }
}
