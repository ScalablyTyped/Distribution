package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodPropertyDescriptor[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
  
  var configurable: js.UndefOr[Boolean] = js.undefined
  
  var enumerable: js.UndefOr[Boolean] = js.undefined
  
  var value: T
  
  var writable: js.UndefOr[Boolean] = js.undefined
}
object MethodPropertyDescriptor {
  
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](value: T): MethodPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPropertyDescriptor[T]]
  }
  
  extension [Self <: MethodPropertyDescriptor[?], T /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & MethodPropertyDescriptor[T]) {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    inline def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
