package typings.dynogels.mod

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
    beginsWith: js.Any => T,
    between: (js.Any, js.Any) => T,
    contains: js.Any => T,
    eq: js.Any => T,
    equals: js.Any => T,
    exists: () => T,
    gt: js.Any => T,
    gte: js.Any => T,
    in: js.Array[_] => T,
    lt: js.Any => T,
    lte: js.Any => T,
    ne: js.Any => T,
    notContains: js.Any => T,
    `null`: () => T
  ): ExtendedChain[T] = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), contains = js.Any.fromFunction1(contains), eq = js.Any.fromFunction1(eq), equals = js.Any.fromFunction1(equals), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), ne = js.Any.fromFunction1(ne), notContains = js.Any.fromFunction1(notContains))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[ExtendedChain[T]]
  }
}

