package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`1`
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeExponentForMagnitudeMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/ComputeExponentForMagnitude", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ComputeExponentForMagnitude(numberFormat: NumberFormat, magnitude: Double, hasGetInternalSlots: `1`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeExponentForMagnitude")(numberFormat.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[Double]
}
