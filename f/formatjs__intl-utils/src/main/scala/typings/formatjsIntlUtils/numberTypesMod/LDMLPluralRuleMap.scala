package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<std.Partial<std.Record<@formatjs/intl-utils.@formatjs/intl-utils/dist/plural-rules-types.LDMLPluralRule, T>>, 'other'> & {  other  :T} */
trait LDMLPluralRuleMap[T] extends js.Object {
  var few: js.UndefOr[T] = js.undefined
  var many: js.UndefOr[T] = js.undefined
  var one: js.UndefOr[T] = js.undefined
  var other: T
  var two: js.UndefOr[T] = js.undefined
  var zero: js.UndefOr[T] = js.undefined
}

object LDMLPluralRuleMap {
  @scala.inline
  def apply[T](other: T, few: T = null, many: T = null, one: T = null, two: T = null, zero: T = null): LDMLPluralRuleMap[T] = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDMLPluralRuleMap[T]]
  }
}

