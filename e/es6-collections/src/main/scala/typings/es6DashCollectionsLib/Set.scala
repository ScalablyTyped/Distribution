package typings
package es6DashCollectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set[T] extends js.Object {
  var size: scala.Double = js.native
  def add(value: T): Set[T] = js.native
  def clear(): scala.Unit = js.native
  def delete(value: T): scala.Boolean = js.native
  def entries(): Iterator[js.Tuple2[T, T]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], scala.Unit]): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def has(value: T): scala.Boolean = js.native
  def keys(): Iterator[T] = js.native
  def values(): Iterator[T] = js.native
}

