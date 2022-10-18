package typings.formatjsIntl.srcTypesMod

import typings.std.Intl.PluralRuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<std.Intl.PluralRulesOptions, 'localeMatcher'> & @formatjs/intl.@formatjs/intl/src/types.CustomFormatConfig<string> */
trait FormatPluralOptions extends StObject {
  
  var format: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: string extends keyof @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats[string] : string */ js.Any
  ] = js.undefined
  
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[PluralRuleType] = js.undefined
}
object FormatPluralOptions {
  
  inline def apply(): FormatPluralOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatPluralOptions]
  }
  
  extension [Self <: FormatPluralOptions](x: Self) {
    
    inline def setFormat(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends keyof @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats[string] : string */ js.Any
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
    
    inline def setType(value: PluralRuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
