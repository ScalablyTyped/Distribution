package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.libTypesNumberMod.RawNumberFormatResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatToRawFixedMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/ToRawFixed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ToRawFixed(x: Double, minFraction: Double, maxFraction: Double): RawNumberFormatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("ToRawFixed")(x.asInstanceOf[js.Any], minFraction.asInstanceOf[js.Any], maxFraction.asInstanceOf[js.Any])).asInstanceOf[RawNumberFormatResult]
}
