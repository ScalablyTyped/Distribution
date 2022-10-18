package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`0`
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatComputeExponentMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/ComputeExponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ComputeExponent(numberFormat: NumberFormat, x: Double, hasGetInternalSlots: `0`): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeExponent")(numberFormat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
}
