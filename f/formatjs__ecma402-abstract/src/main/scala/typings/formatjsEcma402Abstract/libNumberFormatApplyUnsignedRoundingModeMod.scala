package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.libTypesNumberMod.UnsignedRoundingModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatApplyUnsignedRoundingModeMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/ApplyUnsignedRoundingMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ApplyUnsignedRoundingMode(x: Double, r1: Double, r2: Double, unsignedRoundingMode: UnsignedRoundingModeType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyUnsignedRoundingMode")(x.asInstanceOf[js.Any], r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any], unsignedRoundingMode.asInstanceOf[js.Any])).asInstanceOf[Double]
}
