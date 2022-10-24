package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`0`
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatComputeExponentForMagnitudeMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/ComputeExponentForMagnitude", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ComputeExponentForMagnitude(numberFormat: NumberFormat, magnitude: Double, param2: `0`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeExponentForMagnitude")(numberFormat.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
