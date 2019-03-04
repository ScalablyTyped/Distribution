package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedChain[T] extends BaseChain[T] {
  def contains(value: js.Any): T
  def in(values: js.Array[_]): T
  def ne(value: js.Any): T
  def notContains(value: js.Any): T
}

object ExtendedChain {
  @scala.inline
  def apply[T](
    beginsWith: js.Function1[js.Any, T],
    between: js.Function2[js.Any, js.Any, T],
    contains: js.Function1[js.Any, T],
    eq: js.Function1[js.Any, T],
    equals: js.Function1[js.Any, T],
    exists: js.Function0[T],
    gt: js.Function1[js.Any, T],
    gte: js.Function1[js.Any, T],
    in: js.Function1[js.Array[_], T],
    lt: js.Function1[js.Any, T],
    lte: js.Function1[js.Any, T],
    ne: js.Function1[js.Any, T],
    notContains: js.Function1[js.Any, T],
    `null`: js.Function0[T]
  ): ExtendedChain[T] = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith, between = between, contains = contains, eq = eq, equals = equals, exists = exists, gt = gt, gte = gte, in = in, lt = lt, lte = lte, ne = ne, notContains = notContains)
    __obj.updateDynamic("null")(`null`)
    __obj.asInstanceOf[ExtendedChain[T]]
  }
}

