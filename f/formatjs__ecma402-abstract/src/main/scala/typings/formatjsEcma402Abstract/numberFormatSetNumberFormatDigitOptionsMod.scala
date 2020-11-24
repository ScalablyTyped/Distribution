package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatDigitInternalSlots
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatDigitOptions
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatNotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/NumberFormat/SetNumberFormatDigitOptions", JSImport.Namespace)
@js.native
object numberFormatSetNumberFormatDigitOptionsMod extends js.Object {
  
  def SetNumberFormatDigitOptions(
    internalSlots: NumberFormatDigitInternalSlots,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
}
