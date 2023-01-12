package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.Currency
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`-1`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`0`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`1`
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatLocaleInternalData
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatPart
import typings.std.Intl.PluralRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatFormatToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/format_to_parts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    numberResult: NumberResult,
    data: NumberFormatLocaleInternalData,
    pl: PluralRules,
    options: Currency
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(numberResult.asInstanceOf[js.Any], data.asInstanceOf[js.Any], pl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  
  trait NumberResult extends StObject {
    
    var exponent: Double
    
    var formattedString: String
    
    var magnitude: Double
    
    var roundedNumber: Double
    
    var sign: `-1` | `0` | `1`
  }
  object NumberResult {
    
    inline def apply(
      exponent: Double,
      formattedString: String,
      magnitude: Double,
      roundedNumber: Double,
      sign: `-1` | `0` | `1`
    ): NumberResult = {
      val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], formattedString = formattedString.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any], roundedNumber = roundedNumber.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberResult] (val x: Self) extends AnyVal {
      
      inline def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setFormattedString(value: String): Self = StObject.set(x, "formattedString", value.asInstanceOf[js.Any])
      
      inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
      
      inline def setRoundedNumber(value: Double): Self = StObject.set(x, "roundedNumber", value.asInstanceOf[js.Any])
      
      inline def setSign(value: `-1` | `0` | `1`): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
    }
  }
}
