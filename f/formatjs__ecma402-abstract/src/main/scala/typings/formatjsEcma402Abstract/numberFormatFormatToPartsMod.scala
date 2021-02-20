package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.CompactDisplay
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`-1`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`0`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`1`
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatLocaleInternalData
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatPart
import typings.std.Intl.PluralRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFormatFormatToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/NumberFormat/format_to_parts", JSImport.Default)
  @js.native
  def default(
    numberResult: NumberResult,
    data: NumberFormatLocaleInternalData,
    pl: PluralRules,
    options: CompactDisplay
  ): js.Array[NumberFormatPart] = js.native
  
  @js.native
  trait NumberResult extends StObject {
    
    var exponent: Double = js.native
    
    var formattedString: String = js.native
    
    var magnitude: Double = js.native
    
    var roundedNumber: Double = js.native
    
    var sign: `-1` | `0` | `1` = js.native
  }
  object NumberResult {
    
    @scala.inline
    def apply(
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
    implicit class NumberResultMutableBuilder[Self <: NumberResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedString(value: String): Self = StObject.set(x, "formattedString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedNumber(value: Double): Self = StObject.set(x, "roundedNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign(value: `-1` | `0` | `1`): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
    }
  }
}
