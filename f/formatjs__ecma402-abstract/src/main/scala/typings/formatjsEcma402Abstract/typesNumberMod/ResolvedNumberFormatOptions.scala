package typings.formatjsEcma402Abstract.typesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Intl.ResolvedNumberFormatOptions & std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/number.NumberFormatInternal, 'currencySign' | 'unit' | 'unitDisplay' | 'notation' | 'compactDisplay' | 'signDisplay'> */
@js.native
trait ResolvedNumberFormatOptions extends StObject {
  
  var compactDisplay: js.UndefOr[String] with NumberFormatOptionsCompactDisplay = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var currencyDisplay: js.UndefOr[String] = js.native
  
  var currencySign: NumberFormatOptionsCurrencySign = js.native
  
  var locale: String = js.native
  
  var maximumFractionDigits: Double = js.native
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  
  var minimumFractionDigits: Double = js.native
  
  var minimumIntegerDigits: Double = js.native
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  
  var notation: js.UndefOr[String] with NumberFormatOptionsNotation = js.native
  
  var numberingSystem: String = js.native
  
  var signDisplay: js.UndefOr[String] with NumberFormatOptionsSignDisplay = js.native
  
  var style: String = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var unitDisplay: js.UndefOr[String] with NumberFormatOptionsUnitDisplay = js.native
  
  var useGrouping: Boolean = js.native
}
object ResolvedNumberFormatOptions {
  
  @scala.inline
  def apply(
    compactDisplay: js.UndefOr[String] with NumberFormatOptionsCompactDisplay,
    currencySign: NumberFormatOptionsCurrencySign,
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    notation: js.UndefOr[String] with NumberFormatOptionsNotation,
    numberingSystem: String,
    signDisplay: js.UndefOr[String] with NumberFormatOptionsSignDisplay,
    style: String,
    unitDisplay: js.UndefOr[String] with NumberFormatOptionsUnitDisplay,
    useGrouping: Boolean
  ): ResolvedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNumberFormatOptions]
  }
  
  @scala.inline
  implicit class ResolvedNumberFormatOptionsMutableBuilder[Self <: ResolvedNumberFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompactDisplay(value: js.UndefOr[String] with NumberFormatOptionsCompactDisplay): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplay(value: String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    @scala.inline
    def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    @scala.inline
    def setNotation(value: js.UndefOr[String] with NumberFormatOptionsNotation): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDisplay(value: js.UndefOr[String] with NumberFormatOptionsSignDisplay): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplay(value: js.UndefOr[String] with NumberFormatOptionsUnitDisplay): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
  }
}
