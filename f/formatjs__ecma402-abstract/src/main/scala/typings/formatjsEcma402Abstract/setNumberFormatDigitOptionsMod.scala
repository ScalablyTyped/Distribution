package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.numberMod.NumberFormatDigitInternalSlots
import typings.formatjsEcma402Abstract.numberMod.NumberFormatDigitOptions
import typings.formatjsEcma402Abstract.numberMod.NumberFormatNotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setNumberFormatDigitOptionsMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/SetNumberFormatDigitOptions", "SetNumberFormatDigitOptions")
  @js.native
  def SetNumberFormatDigitOptions(
    internalSlots: NumberFormatDigitInternalSlots,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
}
