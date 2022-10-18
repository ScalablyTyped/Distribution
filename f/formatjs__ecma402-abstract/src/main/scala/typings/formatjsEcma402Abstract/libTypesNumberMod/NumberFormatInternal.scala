package typings.formatjsEcma402Abstract.libTypesNumberMod

import typings.formatjsEcma402Abstract.anon.FnCallValue
import typings.std.Intl.PluralRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatInternal
  extends StObject
     with NumberFormatDigitInternalSlots {
  
  var boundFormat: js.UndefOr[FnCallValue] = js.undefined
  
  var compactDisplay: NumberFormatOptionsCompactDisplay
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: NumberFormatOptionsCurrencyDisplay
  
  var currencySign: NumberFormatOptionsCurrencySign
  
  var dataLocale: String
  
  var dataLocaleData: NumberFormatLocaleInternalData
  
  var locale: String
  
  @JSName("notation")
  var notation_NumberFormatInternal: NumberFormatOptionsNotation
  
  var numberingSystem: String
  
  var pl: PluralRules
  
  var roundingMode: js.UndefOr[RoundingModeType] = js.undefined
  
  var signDisplay: NumberFormatOptionsSignDisplay
  
  var style: NumberFormatOptionsStyle
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: NumberFormatOptionsUnitDisplay
  
  var useGrouping: js.UndefOr[UseGroupingType] = js.undefined
}
object NumberFormatInternal {
  
  inline def apply(
    compactDisplay: NumberFormatOptionsCompactDisplay,
    currencyDisplay: NumberFormatOptionsCurrencyDisplay,
    currencySign: NumberFormatOptionsCurrencySign,
    dataLocale: String,
    dataLocaleData: NumberFormatLocaleInternalData,
    locale: String,
    minimumIntegerDigits: Double,
    notation: NumberFormatOptionsNotation,
    numberingSystem: String,
    pl: PluralRules,
    roundingType: NumberFormatRoundingType,
    signDisplay: NumberFormatOptionsSignDisplay,
    style: NumberFormatOptionsStyle,
    unitDisplay: NumberFormatOptionsUnitDisplay
  ): NumberFormatInternal = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], dataLocale = dataLocale.asInstanceOf[js.Any], dataLocaleData = dataLocaleData.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatInternal]
  }
  
  extension [Self <: NumberFormatInternal](x: Self) {
    
    inline def setBoundFormat(value: FnCallValue): Self = StObject.set(x, "boundFormat", value.asInstanceOf[js.Any])
    
    inline def setBoundFormatUndefined: Self = StObject.set(x, "boundFormat", js.undefined)
    
    inline def setCompactDisplay(value: NumberFormatOptionsCompactDisplay): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: NumberFormatOptionsCurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDataLocale(value: String): Self = StObject.set(x, "dataLocale", value.asInstanceOf[js.Any])
    
    inline def setDataLocaleData(value: NumberFormatLocaleInternalData): Self = StObject.set(x, "dataLocaleData", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setNotation(value: NumberFormatOptionsNotation): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setPl(value: PluralRules): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    inline def setRoundingMode(value: RoundingModeType): Self = StObject.set(x, "roundingMode", value.asInstanceOf[js.Any])
    
    inline def setRoundingModeUndefined: Self = StObject.set(x, "roundingMode", js.undefined)
    
    inline def setSignDisplay(value: NumberFormatOptionsSignDisplay): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: NumberFormatOptionsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: NumberFormatOptionsUnitDisplay): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: UseGroupingType): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
  }
}
