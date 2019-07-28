package typings.fromjs.FromJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrderedQueryable[T] extends IQueryable[T] {
  def thenBy[TResult](item: js.Function1[/* item */ T, TResult]): IOrderedQueryable[T] = js.native
  def thenByDesc[TResult](item: js.Function1[/* item */ T, TResult]): IOrderedQueryable[T] = js.native
}

