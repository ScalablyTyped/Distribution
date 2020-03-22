package typings.formatjsIntlUtils.relativeTimeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ u in @formatjs/intl-utils.@formatjs/intl-utils/dist/plural-rules-types.LDMLPluralRule ]:? string} */
trait RelativeTimeData extends js.Object {
  var few: js.UndefOr[String] = js.undefined
  var many: js.UndefOr[String] = js.undefined
  var one: js.UndefOr[String] = js.undefined
  var other: js.UndefOr[String] = js.undefined
  var two: js.UndefOr[String] = js.undefined
  var zero: js.UndefOr[String] = js.undefined
}

object RelativeTimeData {
  @scala.inline
  def apply(
    few: String = null,
    many: String = null,
    one: String = null,
    other: String = null,
    two: String = null,
    zero: String = null
  ): RelativeTimeData = {
    val __obj = js.Dynamic.literal()
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeData]
  }
}

