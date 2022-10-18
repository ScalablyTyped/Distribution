package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatDigitInternalSlots
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatDigitOptions
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatNotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatSetNumberFormatDigitOptionsMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/SetNumberFormatDigitOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SetNumberFormatDigitOptions(
    internalSlots: NumberFormatDigitInternalSlots,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetNumberFormatDigitOptions")(internalSlots.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], mnfdDefault.asInstanceOf[js.Any], mxfdDefault.asInstanceOf[js.Any], notation.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
