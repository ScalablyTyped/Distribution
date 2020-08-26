package typings.formatjsIntlUtils.polyfillUtilsMod

import typings.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatDigitOptions
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatNotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/lib/src/polyfill-utils", "setNumberFormatDigitOptions")
@js.native
object setNumberFormatDigitOptions extends js.Object {
  def apply(
    internalSlots: NumberFormatDigitInternalSlots,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
}

