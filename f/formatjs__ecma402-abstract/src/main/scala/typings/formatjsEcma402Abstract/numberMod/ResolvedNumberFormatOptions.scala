package typings.formatjsEcma402Abstract.numberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Intl.ResolvedNumberFormatOptions & std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatInternal, 'currencySign' | 'unit' | 'unitDisplay' | 'notation' | 'compactDisplay' | 'signDisplay'> */
trait ResolvedNumberFormatOptions extends StObject {
  
  var compactDisplay: js.UndefOr[String] & NumberFormatOptionsCompactDisplay
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: js.UndefOr[String] = js.undefined
  
  var currencySign: NumberFormatOptionsCurrencySign
  
  var locale: String
  
  var maximumFractionDigits: Double
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: Double
  
  var minimumIntegerDigits: Double
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var notation: js.UndefOr[String] & NumberFormatOptionsNotation
  
  var numberingSystem: String
  
  var signDisplay: js.UndefOr[String] & NumberFormatOptionsSignDisplay
  
  var style: String
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: js.UndefOr[String] & NumberFormatOptionsUnitDisplay
  
  var useGrouping: Boolean
}
object ResolvedNumberFormatOptions {
  
  inline def apply(
    compactDisplay: js.UndefOr[String] & NumberFormatOptionsCompactDisplay,
    currencySign: NumberFormatOptionsCurrencySign,
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    notation: js.UndefOr[String] & NumberFormatOptionsNotation,
    numberingSystem: String,
    signDisplay: js.UndefOr[String] & NumberFormatOptionsSignDisplay,
    style: String,
    unitDisplay: js.UndefOr[String] & NumberFormatOptionsUnitDisplay,
    useGrouping: Boolean
  ): ResolvedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNumberFormatOptions]
  }
  
  extension [Self <: ResolvedNumberFormatOptions](x: Self) {
    
    inline def setCompactDisplay(value: js.UndefOr[String] & NumberFormatOptionsCompactDisplay): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    inline def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    inline def setNotation(value: js.UndefOr[String] & NumberFormatOptionsNotation): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setSignDisplay(value: js.UndefOr[String] & NumberFormatOptionsSignDisplay): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: js.UndefOr[String] & NumberFormatOptionsUnitDisplay): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
  }
}
