package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set[T] extends js.Object {
  var size: scala.Double = js.native
  def `_es6-shim iterator_`(): IterableIteratorShim[T] = js.native
  def add(value: T): Set[T] = js.native
  def clear(): scala.Unit = js.native
  def delete(value: T): scala.Boolean = js.native
  def entries(): IterableIteratorShim[js.Tuple2[T, T]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], scala.Unit]): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def has(value: T): scala.Boolean = js.native
  def keys(): IterableIteratorShim[T] = js.native
  def values(): IterableIteratorShim[T] = js.native
}

@JSGlobal("Set")
@js.native
class SetCls[T] () extends Set[T] {
  def this(iterable: IterableShim[T]) = this()
}

