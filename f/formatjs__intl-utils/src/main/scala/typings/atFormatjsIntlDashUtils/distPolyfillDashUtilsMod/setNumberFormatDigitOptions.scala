package typings.atFormatjsIntlDashUtils.distPolyfillDashUtilsMod

import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitInternalSlots
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitOptions
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatNotation
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/polyfill-utils", "setNumberFormatDigitOptions")
@js.native
object setNumberFormatDigitOptions extends js.Object {
  def apply[TObject /* <: js.Object */, TInternalSlots /* <: NumberFormatDigitInternalSlots */](
    internalSlotMap: WeakMap[TObject, TInternalSlots],
    pl: TObject,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
}

