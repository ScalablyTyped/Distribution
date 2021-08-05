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
  
  inline def apply[T](): ModelTitleElement[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelTitleElement[T]]
  }
  
  extension [Self <: ModelTitleElement[?], T](x: Self & ModelTitleElement[T]) {
    
    inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setTitleElement(value: dxElement): Self = StObject.set(x, "titleElement", value.asInstanceOf[js.Any])
    
    inline def setTitleElementUndefined: Self = StObject.set(x, "titleElement", js.undefined)
  }
}
