package typings.embroiderSharedInternals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGetOrCreateMod {
  
  @JSImport("@embroider/shared-internals/src/get-or-create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOrCreate[K, V](map: AbstractMap[K, V], key: K, construct: js.Function1[/* key */ K, V]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreate")(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], construct.asInstanceOf[js.Any])).asInstanceOf[V]
  
  trait AbstractMap[K, V] extends StObject {
    
    def get(key: K): js.UndefOr[V]
    
    def set(key: K, value: V): Unit
  }
  object AbstractMap {
    
    inline def apply[K, V](get: K => js.UndefOr[V], set: (K, V) => Unit): AbstractMap[K, V] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[AbstractMap[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractMap[?, ?], K, V] (val x: Self & (AbstractMap[K, V])) extends AnyVal {
      
      inline def setGet(value: K => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (K, V) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
