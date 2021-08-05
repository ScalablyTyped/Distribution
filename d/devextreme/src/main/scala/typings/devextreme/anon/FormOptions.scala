package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormOptions[T] extends StObject {
  
  var component: js.UndefOr[T] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var formOptions: js.UndefOr[js.Any] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object FormOptions {
  
  inline def apply[T](): FormOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions[T]]
  }
  
  extension [Self <: FormOptions[?], T](x: Self & FormOptions[T]) {
    
    inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setFormOptions(value: js.Any): Self = StObject.set(x, "formOptions", value.asInstanceOf[js.Any])
    
    inline def setFormOptionsUndefined: Self = StObject.set(x, "formOptions", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
