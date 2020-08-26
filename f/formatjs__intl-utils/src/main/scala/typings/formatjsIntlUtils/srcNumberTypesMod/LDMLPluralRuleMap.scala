package typings.formatjsIntlUtils.srcNumberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<std.Partial<std.Record<@formatjs/intl-utils.@formatjs/intl-utils/src/plural-rules-types.LDMLPluralRule, T>>, 'other'> & {  other :T} */
@js.native
trait LDMLPluralRuleMap[T] extends js.Object {
  var few: js.UndefOr[T] = js.native
  var many: js.UndefOr[T] = js.native
  var one: js.UndefOr[T] = js.native
  var other: T = js.native
  var two: js.UndefOr[T] = js.native
  var zero: js.UndefOr[T] = js.native
}

object LDMLPluralRuleMap {
  @scala.inline
  def apply[T](other: T): LDMLPluralRuleMap[T] = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDMLPluralRuleMap[T]]
  }
  @scala.inline
  implicit class LDMLPluralRuleMapOps[Self <: LDMLPluralRuleMap[_], T] (val x: Self with LDMLPluralRuleMap[T]) extends AnyVal {
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
    def setOther(value: T): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setFew(value: T): Self = this.set("few", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFew: Self = this.set("few", js.undefined)
    @scala.inline
    def setMany(value: T): Self = this.set("many", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMany: Self = this.set("many", js.undefined)
    @scala.inline
    def setOne(value: T): Self = this.set("one", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
    @scala.inline
    def setTwo(value: T): Self = this.set("two", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwo: Self = this.set("two", js.undefined)
    @scala.inline
    def setZero(value: T): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
  
}

