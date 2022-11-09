package typings.expoLocalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<expo-localization.expo-localization/build/Localization.types.Localization, 'getCalendars' | 'getLocales'> */
  trait OmitLocalizationgetCalend extends StObject {
    
    var currency: js.UndefOr[String | Null] = js.undefined
    
    var decimalSeparator: String
    
    var digitGroupingSeparator: String
    
    var isMetric: Boolean
    
    var isRTL: Boolean
    
    var isoCurrencyCodes: js.Array[String]
    
    var locale: String
    
    var locales: js.Array[String]
    
    var region: js.UndefOr[String | Null] = js.undefined
    
    var timezone: String
  }
  object OmitLocalizationgetCalend {
    
    inline def apply(
      decimalSeparator: String,
      digitGroupingSeparator: String,
      isMetric: Boolean,
      isRTL: Boolean,
      isoCurrencyCodes: js.Array[String],
      locale: String,
      locales: js.Array[String],
      timezone: String
    ): OmitLocalizationgetCalend = {
      val __obj = js.Dynamic.literal(decimalSeparator = decimalSeparator.asInstanceOf[js.Any], digitGroupingSeparator = digitGroupingSeparator.asInstanceOf[js.Any], isMetric = isMetric.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], isoCurrencyCodes = isoCurrencyCodes.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitLocalizationgetCalend]
    }
    
    extension [Self <: OmitLocalizationgetCalend](x: Self) {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setDigitGroupingSeparator(value: String): Self = StObject.set(x, "digitGroupingSeparator", value.asInstanceOf[js.Any])
      
      inline def setIsMetric(value: Boolean): Self = StObject.set(x, "isMetric", value.asInstanceOf[js.Any])
      
      inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      inline def setIsoCurrencyCodes(value: js.Array[String]): Self = StObject.set(x, "isoCurrencyCodes", value.asInstanceOf[js.Any])
      
      inline def setIsoCurrencyCodesVarargs(value: String*): Self = StObject.set(x, "isoCurrencyCodes", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionNull: Self = StObject.set(x, "region", null)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
