package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.CurrencyDigitsData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatCurrencyDigitsMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/CurrencyDigits", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CurrencyDigits(c: String, hasCurrencyDigitsData: CurrencyDigitsData): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CurrencyDigits")(c.asInstanceOf[js.Any], hasCurrencyDigitsData.asInstanceOf[js.Any])).asInstanceOf[Double]
}
