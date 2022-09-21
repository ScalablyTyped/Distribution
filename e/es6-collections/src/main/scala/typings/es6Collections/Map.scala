package typings.es6Collections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map[K, V] extends StObject {
  
  def clear(): Unit = js.native
  
  def delete(key: K): Boolean = js.native
  
  def entries(): Iterator[js.Tuple2[K, V]] = js.native
  
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], Unit], thisArg: Any): Unit = js.native
  
  def get(key: K): V = js.native
  
  def has(key: K): Boolean = js.native
  
  def keys(): Iterator[K] = js.native
  
  def set(key: K): Map[K, V] = js.native
  def set(key: K, value: V): Map[K, V] = js.native
  
  var size: Double = js.native
  
  def values(): Iterator[V] = js.native
}
