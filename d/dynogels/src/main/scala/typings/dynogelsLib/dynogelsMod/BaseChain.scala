package typings
package dynogelsLib.dynogelsMod

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
    beginsWith: js.Function1[js.Any, T],
    between: js.Function2[js.Any, js.Any, T],
    eq: js.Function1[js.Any, T],
    equals: js.Function1[js.Any, T],
    exists: js.Function0[T],
    gt: js.Function1[js.Any, T],
    gte: js.Function1[js.Any, T],
    lt: js.Function1[js.Any, T],
    lte: js.Function1[js.Any, T],
    `null`: js.Function0[T]
  ): BaseChain[T] = {
    val __obj = js.Dynamic.literal(`null` = `null`)
    __obj.updateDynamic("beginsWith")(beginsWith)
    __obj.updateDynamic("between")(between)
    __obj.updateDynamic("eq")(eq)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("exists")(exists)
    __obj.updateDynamic("gt")(gt)
    __obj.updateDynamic("gte")(gte)
    __obj.updateDynamic("lt")(lt)
    __obj.updateDynamic("lte")(lte)
    __obj.asInstanceOf[BaseChain[T]]
  }
}

