package typings.entriaRelayExperimental

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lrucacheMod {
  
  @JSImport("@entria/relay-experimental/lib/LRUCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def create[T](capacity: Double): LRUCache[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(capacity.asInstanceOf[js.Any]).asInstanceOf[LRUCache[T]]
  
  trait Cache[T] extends StObject {
    
    def capacity(): Double
    
    def clear(): Unit
    
    def delete(key: String): Unit
    
    def get(key: String): T | Null
    
    def has(key: String): Boolean
    
    def set(key: String, value: T): Unit
    
    def size(): Double
  }
  object Cache {
    
    inline def apply[T](
      capacity: () => Double,
      clear: () => Unit,
      delete: String => Unit,
      get: String => T | Null,
      has: String => Boolean,
      set: (String, T) => Unit,
      size: () => Double
    ): Cache[T] = {
      val __obj = js.Dynamic.literal(capacity = js.Any.fromFunction0(capacity), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[Cache[T]]
    }
    
    extension [Self <: Cache[?], T](x: Self & Cache[T]) {
      
      inline def setCapacity(value: () => Double): Self = StObject.set(x, "capacity", js.Any.fromFunction0(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => T | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, T) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * JS maps (both plain objects and Map) maintain key insertion
    * order, which means there is an easy way to simulate LRU behavior
    * that should also perform quite well:
    *
    * To insert a new value, first delete the key from the inner _map,
    * then _map.set(k, v). By deleting and reinserting, you ensure that the
    * map sees the key as the last inserted key.
    *
    * Get does the same: if the key is present, delete and reinsert it.
    */
  trait LRUCache[T]
    extends StObject
       with Cache[T] {
    
    var _capacity: Double
    
    var _map: Map[String, T]
  }
  object LRUCache {
    
    inline def apply[T](
      _capacity: Double,
      _map: Map[String, T],
      capacity: () => Double,
      clear: () => Unit,
      delete: String => Unit,
      get: String => T | Null,
      has: String => Boolean,
      set: (String, T) => Unit,
      size: () => Double
    ): LRUCache[T] = {
      val __obj = js.Dynamic.literal(_capacity = _capacity.asInstanceOf[js.Any], _map = _map.asInstanceOf[js.Any], capacity = js.Any.fromFunction0(capacity), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[LRUCache[T]]
    }
    
    extension [Self <: LRUCache[?], T](x: Self & LRUCache[T]) {
      
      inline def set_capacity(value: Double): Self = StObject.set(x, "_capacity", value.asInstanceOf[js.Any])
      
      inline def set_map(value: Map[String, T]): Self = StObject.set(x, "_map", value.asInstanceOf[js.Any])
    }
  }
}
