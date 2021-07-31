package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelTitleElement[T] extends StObject {
  
  var component: js.UndefOr[T] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var titleElement: js.UndefOr[dxElement] = js.undefined
}
object ModelTitleElement {
  
  @scala.inline
  def apply[T](): ModelTitleElement[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelTitleElement[T]]
  }
  
  @scala.inline
  implicit class ModelTitleElementMutableBuilder[Self <: ModelTitleElement[?], T] (val x: Self & ModelTitleElement[T]) extends AnyVal {
    
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
    def setTitleElement(value: dxElement): Self = StObject.set(x, "titleElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleElementUndefined: Self = StObject.set(x, "titleElement", js.undefined)
  }
}
