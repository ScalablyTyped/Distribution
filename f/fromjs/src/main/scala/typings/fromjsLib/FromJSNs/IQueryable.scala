package typings
package fromjsLib.FromJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryable[T] extends js.Object {
  def all(predicate: js.Function1[/* item */ T, scala.Boolean]): scala.Boolean = js.native
  def any(): scala.Boolean = js.native
  def any(predicate: js.Function1[/* item */ T, scala.Boolean]): scala.Boolean = js.native
  def concat(second: js.Array[T]): IQueryable[T] = js.native
  def contains(item: T): scala.Boolean = js.native
  def count(): scala.Double = js.native
  def distinct(): IQueryable[T] = js.native
  def each(action: js.Function1[/* item */ T, scala.Unit]): scala.Unit = js.native
  def each(action: js.Function1[/* item */ T, scala.Unit], a: scala.Boolean): scala.Unit = js.native
  def each[TKey](action: js.Function2[/* value */ T, /* key */ TKey, scala.Unit]): scala.Unit = js.native
  def first(): T = js.native
  def first(predicate: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  def firstOrDefault(): T = js.native
  def last(): T = js.native
  def max(): T = js.native
  def orderBy[TResult](item: js.Function1[/* item */ T, TResult]): IOrderedQueryable[T] = js.native
  def orderByDesc[TResult](item: js.Function1[/* item */ T, TResult]): IOrderedQueryable[T] = js.native
  def select[TResult](item: js.Function1[/* item */ T, TResult]): IQueryable[TResult] = js.native
  def selectMany[TResult](item: js.Function1[/* item */ T, js.Array[TResult]]): IQueryable[TResult] = js.native
  def single(): T = js.native
  def single(predicate: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  def singleOrDefault(): T = js.native
  def singleOrDefault(predicate: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  def skip[TResult](count: stdLib.Number): IQueryable[TResult] = js.native
  def sum(): T = js.native
  def take[TResult](count: stdLib.Number): IQueryable[TResult] = js.native
  def toArray(): js.Array[T] = js.native
  def where(predicate: js.Function1[/* item */ T, scala.Boolean]): IQueryable[T] = js.native
}

