package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessorPropertyDescriptor[T] extends StObject {
  
  var configurable: js.UndefOr[Boolean] = js.undefined
  
  var enumerable: js.UndefOr[Boolean] = js.undefined
  
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  
  var set: js.UndefOr[js.Function1[/* v */ T, Unit]] = js.undefined
}
object AccessorPropertyDescriptor {
  
  inline def apply[T](): AccessorPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessorPropertyDescriptor[T]]
  }
  
  extension [Self <: AccessorPropertyDescriptor[?], T](x: Self & AccessorPropertyDescriptor[T]) {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    inline def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
    
    inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setSet(value: /* v */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
