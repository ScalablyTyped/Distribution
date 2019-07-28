package typings.es6DashCollections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set[T] extends js.Object {
  var size: Double = js.native
  def add(value: T): Set[T] = js.native
  def clear(): Unit = js.native
  def delete(value: T): Boolean = js.native
  def entries(): Iterator[js.Tuple2[T, T]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], Unit], thisArg: js.Any): Unit = js.native
  def has(value: T): Boolean = js.native
  def keys(): Iterator[T] = js.native
  def values(): Iterator[T] = js.native
}

@JSGlobal("Set")
@js.native
class SetCls[T] () extends Set[T] {
  def this(iterable: ForEachable[T]) = this()
}

