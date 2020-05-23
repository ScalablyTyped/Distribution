package typings.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map[K, V] extends js.Object {
  var size: Double = js.native
  def clear(): Unit = js.native
  def delete(key: K): Boolean = js.native
  def entries(): IterableIteratorShim[js.Tuple2[K, V]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], Unit], thisArg: js.Any): Unit = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): Boolean = js.native
  def keys(): IterableIteratorShim[K] = js.native
  def set(key: K, value: V): Map[K, V] = js.native
  def values(): IterableIteratorShim[V] = js.native
}

