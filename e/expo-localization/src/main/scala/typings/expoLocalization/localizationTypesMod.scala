package typings.expoLocalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localizationTypesMod {
  
  trait Localization extends StObject {
    
    /**
      * Three-character ISO 4217 currency code. Returns `null` on web.
      *
      * @example `'USD'`, `'EUR'`, `'CNY'`, `null`
      */
    var currency: String | Null
    
    /**
      * Decimal separator used for formatting numbers.
      *
      * @example `','`, `'.'`
      */
    var decimalSeparator: String
    
    /**
      * Digit grouping separator used when formatting numbers larger than 1000.
      *
      * @example `'.'`, `''`, `','`
      */
    var digitGroupingSeparator: String
    
    /**
      * Boolean value that indicates whether the system uses the metric system.
      * On Android and web, this is inferred from the current region.
      */
    var isMetric: Boolean
    
    /**
      * Returns if the system's language is written from Right-to-Left.
      * This can be used to build features like [bidirectional icons](https://material.io/design/usability/bidirectionality.html).
      *
      * Returns `false` in Server Side Rendering (SSR) environments.
      */
    var isRTL: Boolean
    
    /**
      * A list of all the supported language ISO codes.
      */
    var isoCurrencyCodes: js.Array[String]
    
    /**
      * An [IETF BCP 47 language tag](https://en.wikipedia.org/wiki/IETF_language_tag),
      * consisting of a two-character language code and optional script, region and variant codes.
      *
      * @example `'en'`, `'en-US'`, `'zh-Hans'`, `'zh-Hans-CN'`, `'en-emodeng'`
      */
    var locale: String
    
    /**
      * List of all the native languages provided by the user settings.
      * These are returned in the order the user defines in their device settings.
      *
      * @example `['en', 'en-US', 'zh-Hans', 'zh-Hans-CN', 'en-emodeng']`
      */
    var locales: js.Array[String]
    
    /**
      * The region code for your device that comes from the Region setting under Language & Region on iOS.
      * This value is always available on iOS, but might return `null` on Android or web.
      *
      * @example `'US'`, `'NZ'`, `null`
      */
    var region: String | Null
    
    /**
      * The current time zone in display format.
      * On Web time zone is calculated with Intl.DateTimeFormat().resolvedOptions().timeZone. For a
      * better estimation you could use the moment-timezone package but it will add significant bloat to
      * your website's bundle size.
      *
      * @example `'America/Los_Angeles'`
      */
    var timezone: String
  }
  object Localization {
    
    inline def apply(
      decimalSeparator: String,
      digitGroupingSeparator: String,
      isMetric: Boolean,
      isRTL: Boolean,
      isoCurrencyCodes: js.Array[String],
      locale: String,
      locales: js.Array[String],
      timezone: String
    ): Localization = {
      val __obj = js.Dynamic.literal(decimalSeparator = decimalSeparator.asInstanceOf[js.Any], digitGroupingSeparator = digitGroupingSeparator.asInstanceOf[js.Any], isMetric = isMetric.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], isoCurrencyCodes = isoCurrencyCodes.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], currency = null, region = null)
      __obj.asInstanceOf[Localization]
    }
    
    extension [Self <: Localization](x: Self) {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
      
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
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
