package typings.formatjsIntlUtils.srcPolyfillUtilsMod

import typings.formatjsIntlUtils.srcNumberTypesMod.NumberFormatDigitInternalSlots
import typings.formatjsIntlUtils.srcNumberTypesMod.NumberFormatDigitOptions
import typings.formatjsIntlUtils.srcNumberTypesMod.NumberFormatNotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/src/polyfill-utils", "setNumberFormatDigitOptions")
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

