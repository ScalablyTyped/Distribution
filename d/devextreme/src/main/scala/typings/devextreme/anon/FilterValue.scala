package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterValue[T] extends StObject {
  
  var component: js.UndefOr[T] = js.undefined
  
  var filterValue: js.UndefOr[js.Any] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object FilterValue {
  
  inline def apply[T](): FilterValue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterValue[T]]
  }
  
  extension [Self <: FilterValue[?], T](x: Self & FilterValue[T]) {
    
    inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setFilterValue(value: js.Any): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    
    inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
