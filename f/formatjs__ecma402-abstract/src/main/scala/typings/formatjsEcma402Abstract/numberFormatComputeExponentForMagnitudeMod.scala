package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.GetInternalSlots
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFormatComputeExponentForMagnitudeMod {
  
  @JSImport("@formatjs/ecma402-abstract/NumberFormat/ComputeExponentForMagnitude", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ComputeExponentForMagnitude(numberFormat: NumberFormat, magnitude: Double, hasGetInternalSlots: GetInternalSlots): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeExponentForMagnitude")(numberFormat.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[Double]
}
