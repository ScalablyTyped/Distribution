package typings.fileServicesUtils

import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMultiMapMod {
  
  @JSImport("@file-services/utils/dist/set-multi-map", "SetMultiMap")
  @js.native
  open class SetMultiMap[K, V] ()
    extends StObject
       with Iterable[js.Tuple2[K, V]] {
    
    def add(key: K, value: V): this.type = js.native
    
    def clear(): Unit = js.native
    
    def delete(key: K, value: V): Boolean = js.native
    
    def deleteKey(key: K): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
    
    def get(key: K): js.UndefOr[ReadonlySet[V]] = js.native
    
    def has(key: K, value: V): Boolean = js.native
    
    def hasKey(key: K): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_SetMultiMap: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    
    def keys(): IterableIterator[K] = js.native
    
    /* private */ var map: Any = js.native
    
    def size: Double = js.native
    
    def values(): IterableIterator[V] = js.native
  }
}
