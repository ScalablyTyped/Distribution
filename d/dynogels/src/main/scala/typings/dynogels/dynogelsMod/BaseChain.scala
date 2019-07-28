package typings.dynogels.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseChain[T] extends js.Object {
  def beginsWith(value: js.Any): T
  def between(value1: js.Any, value2: js.Any): T
  def eq(value: js.Any): T
  def equals(value: js.Any): T
  def exists(): T
  def gt(value: js.Any): T
  def gte(value: js.Any): T
  def lt(value: js.Any): T
  def lte(value: js.Any): T
  def `null`(): T
}

object BaseChain {
  @scala.inline
  def apply[T](
    beginsWith: js.Any => T,
    between: (js.Any, js.Any) => T,
    eq: js.Any => T,
    equals: js.Any => T,
    exists: () => T,
    gt: js.Any => T,
    gte: js.Any => T,
    lt: js.Any => T,
    lte: js.Any => T,
    `null`: () => T
  ): BaseChain[T] = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), eq = js.Any.fromFunction1(eq), equals = js.Any.fromFunction1(equals), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[BaseChain[T]]
  }
}

