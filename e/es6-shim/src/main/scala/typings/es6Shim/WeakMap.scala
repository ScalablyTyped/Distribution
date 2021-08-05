package typings.es6Shim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeakMap[K /* <: js.Object */, V] extends StObject {
  
  def delete(key: K): Boolean
  
  def get(key: K): js.UndefOr[V]
  
  def has(key: K): Boolean
  
  def set(key: K, value: V): WeakMap[K, V]
}
object WeakMap {
  
  inline def apply[K /* <: js.Object */, V](delete: K => Boolean, get: K => js.UndefOr[V], has: K => Boolean, set: (K, V) => WeakMap[K, V]): WeakMap[K, V] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[WeakMap[K, V]]
  }
  
  extension [Self <: WeakMap[?, ?], K /* <: js.Object */, V](x: Self & (WeakMap[K, V])) {
    
    inline def setDelete(value: K => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: K => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setSet(value: (K, V) => WeakMap[K, V]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
