package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[T] extends StObject {
  
  var component: js.UndefOr[T] = js.undefined
}
object Component {
  
  inline def apply[T](): Component[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component[T]]
  }
  
  extension [Self <: Component[?], T](x: Self & Component[T]) {
    
    inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
