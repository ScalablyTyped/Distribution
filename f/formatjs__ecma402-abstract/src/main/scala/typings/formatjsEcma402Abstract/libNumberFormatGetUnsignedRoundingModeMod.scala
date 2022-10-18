package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.libTypesNumberMod.RoundingModeType
import typings.formatjsEcma402Abstract.libTypesNumberMod.UnsignedRoundingModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatGetUnsignedRoundingModeMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/GetUnsignedRoundingMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetUnsignedRoundingMode(roundingMode: RoundingModeType, isNegative: Boolean): UnsignedRoundingModeType = (^.asInstanceOf[js.Dynamic].applyDynamic("GetUnsignedRoundingMode")(roundingMode.asInstanceOf[js.Any], isNegative.asInstanceOf[js.Any])).asInstanceOf[UnsignedRoundingModeType]
}
