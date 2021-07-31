package typings.expoLocalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localizationTypesMod {
  
  trait Localization extends StObject {
    
    /**
      * Returns if the system's language is written from Right-to-Left.
      * This can be used to build features like [bidirectional icons](https://material.io/design/usability/bidirectionality.html).
      *
      * Returns `false` in SSR environments.
      */
    var isRTL: Boolean
    
    /**
      * A list of all the supported language ISO codes.
      */
    var isoCurrencyCodes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Native device language, returned in standard format.
      *
      * @example `en`, `en-US`, `es-US`
      */
    var locale: String
    
    /**
      * List of all the native languages provided by the user settings.
      * These are returned in the order the user defines in their native settings.
      */
    var locales: js.Array[String]
    
    /**
      * **Available on iOS and web**: Region code for your device which came from Region setting in Language & Region.
      *
      * @example `US`, `NZ`
      */
    var region: String | Null
    
    /**
      * The current timezone in display format.
      * On Web timezone is calculated with Intl.DateTimeFormat().resolvedOptions().timeZone. For a better estimation you could use the moment-timezone package but it will add significant bloat to your website's bundle size.
      *
      * @example `America/Los_Angeles`
      */
    var timezone: String
  }
  object Localization {
    
    @scala.inline
    def apply(isRTL: Boolean, locale: String, locales: js.Array[String], timezone: String): Localization = {
      val __obj = js.Dynamic.literal(isRTL = isRTL.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], region = null)
      __obj.asInstanceOf[Localization]
    }
    
    @scala.inline
    implicit class LocalizationMutableBuilder[Self <: Localization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsoCurrencyCodes(value: js.Array[String]): Self = StObject.set(x, "isoCurrencyCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsoCurrencyCodesUndefined: Self = StObject.set(x, "isoCurrencyCodes", js.undefined)
      
      @scala.inline
      def setIsoCurrencyCodesVarargs(value: String*): Self = StObject.set(x, "isoCurrencyCodes", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionNull: Self = StObject.set(x, "region", null)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
