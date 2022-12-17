package typings.formatjsIntl.libSrcTypesMod

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsSignDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.RoundingModeType
import typings.formatjsEcma402Abstract.typesNumberMod.RoundingPriorityType
import typings.formatjsEcma402Abstract.typesNumberMod.TrailingZeroDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.UseGroupingType
import typings.formatjsIntl.formatjsIntlStrings.compact
import typings.formatjsIntl.formatjsIntlStrings.engineering
import typings.formatjsIntl.formatjsIntlStrings.long
import typings.formatjsIntl.formatjsIntlStrings.narrow
import typings.formatjsIntl.formatjsIntlStrings.scientific
import typings.formatjsIntl.formatjsIntlStrings.short
import typings.formatjsIntl.formatjsIntlStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract.NumberFormatOptions, 'localeMatcher'> & @formatjs/intl.@formatjs/intl/lib/src/types.CustomFormatConfig<'number'> */
trait FormatNumberOptions extends StObject {
  
  var compactDisplay: js.UndefOr[short | long] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: js.UndefOr[String] = js.undefined
  
  var currencySign: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'number' extends keyof @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats['number'] : string */ js.Any
  ] = js.undefined
  
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var notation: js.UndefOr[standard | scientific | engineering | compact] = js.undefined
  
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  var roundingIncrement: js.UndefOr[Double] = js.undefined
  
  var roundingMode: js.UndefOr[RoundingModeType] = js.undefined
  
  var roundingPriority: js.UndefOr[RoundingPriorityType] = js.undefined
  
  var signDisplay: js.UndefOr[NumberFormatOptionsSignDisplay] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var trailingZeroDisplay: js.UndefOr[TrailingZeroDisplay] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: js.UndefOr[short | long | narrow] = js.undefined
  
  var useGrouping: js.UndefOr[UseGroupingType] = js.undefined
}
object FormatNumberOptions {
  
  inline def apply(): FormatNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatNumberOptions]
  }
  
  extension [Self <: FormatNumberOptions](x: Self) {
    
    inline def setCompactDisplay(value: short | long): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCompactDisplayUndefined: Self = StObject.set(x, "compactDisplay", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    inline def setCurrencySign(value: String): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    inline def setCurrencySignUndefined: Self = StObject.set(x, "currencySign", js.undefined)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setFormat(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'number' extends keyof @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats['number'] : string */ js.Any
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
    
    inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
    
    inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
    
    inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    inline def setNotation(value: standard | scientific | engineering | compact): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setRoundingIncrement(value: Double): Self = StObject.set(x, "roundingIncrement", value.asInstanceOf[js.Any])
    
    inline def setRoundingIncrementUndefined: Self = StObject.set(x, "roundingIncrement", js.undefined)
    
    inline def setRoundingMode(value: RoundingModeType): Self = StObject.set(x, "roundingMode", value.asInstanceOf[js.Any])
    
    inline def setRoundingModeUndefined: Self = StObject.set(x, "roundingMode", js.undefined)
    
    inline def setRoundingPriority(value: RoundingPriorityType): Self = StObject.set(x, "roundingPriority", value.asInstanceOf[js.Any])
    
    inline def setRoundingPriorityUndefined: Self = StObject.set(x, "roundingPriority", js.undefined)
    
    inline def setSignDisplay(value: NumberFormatOptionsSignDisplay): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    inline def setSignDisplayUndefined: Self = StObject.set(x, "signDisplay", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTrailingZeroDisplay(value: TrailingZeroDisplay): Self = StObject.set(x, "trailingZeroDisplay", value.asInstanceOf[js.Any])
    
    inline def setTrailingZeroDisplayUndefined: Self = StObject.set(x, "trailingZeroDisplay", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: short | long | narrow): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplayUndefined: Self = StObject.set(x, "unitDisplay", js.undefined)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: UseGroupingType): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
  }
}
