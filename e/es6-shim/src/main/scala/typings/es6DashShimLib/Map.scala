package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map[K, V] extends js.Object {
  var size: scala.Double = js.native
  def clear(): scala.Unit = js.native
  def delete(key: K): scala.Boolean = js.native
  def entries(): IterableIteratorShim[js.Tuple2[K, V]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], scala.Unit]): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): scala.Boolean = js.native
  def keys(): IterableIteratorShim[K] = js.native
  def set(key: K, value: V): Map[K, V] = js.native
  def values(): IterableIteratorShim[V] = js.native
}

