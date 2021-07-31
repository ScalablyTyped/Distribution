package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatRoundingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/number.NumberFormatDigitInternalSlots, 'roundingType' | 'minimumSignificantDigits' | 'maximumSignificantDigits' | 'minimumIntegerDigits' | 'minimumFractionDigits' | 'maximumFractionDigits'> */
trait PickNumberFormatDigitInte extends StObject {
  
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var minimumIntegerDigits: Double
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var roundingType: NumberFormatRoundingType
}
object PickNumberFormatDigitInte {
  
  @scala.inline
  def apply(minimumIntegerDigits: Double, roundingType: NumberFormatRoundingType): PickNumberFormatDigitInte = {
    val __obj = js.Dynamic.literal(minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNumberFormatDigitInte]
  }
  
  @scala.inline
  implicit class PickNumberFormatDigitInteMutableBuilder[Self <: PickNumberFormatDigitInte] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
    
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
    
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    @scala.inline
    def setRoundingType(value: NumberFormatRoundingType): Self = StObject.set(x, "roundingType", value.asInstanceOf[js.Any])
  }
}
