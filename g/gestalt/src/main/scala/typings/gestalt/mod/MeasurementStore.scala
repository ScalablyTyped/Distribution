package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasurementStore[K, V] extends StObject {
  
  def get(key: K): js.UndefOr[V]
  
  def has(key: K): Boolean
  
  def reset(): Unit
  
  def set(key: K, value: V): Unit
}
object MeasurementStore {
  
  inline def apply[K, V](get: K => js.UndefOr[V], has: K => Boolean, reset: () => Unit, set: (K, V) => Unit): MeasurementStore[K, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[MeasurementStore[K, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasurementStore[?, ?], K, V] (val x: Self & (MeasurementStore[K, V])) extends AnyVal {
    
    inline def setGet(value: K => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSet(value: (K, V) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
