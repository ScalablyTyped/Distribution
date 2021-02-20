package typings.es6WeakMap

import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("es6-weak-map", JSImport.Namespace)
  @js.native
  class ^[K, V] () extends WeakMap[K, V] {
    def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  trait Iterable[T] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[T, _, js.UndefOr[scala.Nothing]]] = js.native
  }
  
  @js.native
  trait WeakMap[K, V] extends StObject {
    
    def delete(key: K): Boolean = js.native
    
    def get(key: K): V = js.native
    
    def has(key: K): Boolean = js.native
    
    def set(key: K): WeakMap[K, V] = js.native
    def set(key: K, value: V): WeakMap[K, V] = js.native
  }
}
