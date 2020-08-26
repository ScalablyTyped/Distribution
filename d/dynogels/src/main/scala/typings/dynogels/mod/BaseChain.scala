package typings.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseChain[T] extends js.Object {
  def beginsWith(value: js.Any): T = js.native
  def between(value1: js.Any, value2: js.Any): T = js.native
  def eq(value: js.Any): T = js.native
  def equals(value: js.Any): T = js.native
  def exists(): T = js.native
  def gt(value: js.Any): T = js.native
  def gte(value: js.Any): T = js.native
  def lt(value: js.Any): T = js.native
  def lte(value: js.Any): T = js.native
  def `null`(): T = js.native
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
  @scala.inline
  implicit class BaseChainOps[Self <: BaseChain[_], T] (val x: Self with BaseChain[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeginsWith(value: js.Any => T): Self = this.set("beginsWith", js.Any.fromFunction1(value))
    @scala.inline
    def setBetween(value: (js.Any, js.Any) => T): Self = this.set("between", js.Any.fromFunction2(value))
    @scala.inline
    def setEq(value: js.Any => T): Self = this.set("eq", js.Any.fromFunction1(value))
    @scala.inline
    def setEquals(value: js.Any => T): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setExists(value: () => T): Self = this.set("exists", js.Any.fromFunction0(value))
    @scala.inline
    def setGt(value: js.Any => T): Self = this.set("gt", js.Any.fromFunction1(value))
    @scala.inline
    def setGte(value: js.Any => T): Self = this.set("gte", js.Any.fromFunction1(value))
    @scala.inline
    def setLt(value: js.Any => T): Self = this.set("lt", js.Any.fromFunction1(value))
    @scala.inline
    def setLte(value: js.Any => T): Self = this.set("lte", js.Any.fromFunction1(value))
    @scala.inline
    def setNull(value: () => T): Self = this.set("null", js.Any.fromFunction0(value))
  }
  
}

