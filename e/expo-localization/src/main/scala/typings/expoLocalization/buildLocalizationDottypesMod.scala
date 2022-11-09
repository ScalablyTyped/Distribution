package typings.expoLocalization

import typings.expoLocalization.expoLocalizationStrings.ltr
import typings.expoLocalization.expoLocalizationStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLocalizationDottypesMod {
  
  @js.native
  sealed trait CalendarIdentifier extends StObject
  @JSImport("expo-localization/build/Localization.types", "CalendarIdentifier")
  @js.native
  object CalendarIdentifier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalendarIdentifier & String] = js.native
    
    /** Thai Buddhist calendar */
    @js.native
    sealed trait BUDDHIST
      extends StObject
         with CalendarIdentifier
    /* "buddhist" */ val BUDDHIST: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.BUDDHIST & String = js.native
    
    /** Traditional Chinese calendar */
    @js.native
    sealed trait CHINESE
      extends StObject
         with CalendarIdentifier
    /* "chinese" */ val CHINESE: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.CHINESE & String = js.native
    
    /** Coptic calendar */
    @js.native
    sealed trait COPTIC
      extends StObject
         with CalendarIdentifier
    /* "coptic" */ val COPTIC: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.COPTIC & String = js.native
    
    /** Traditional Korean calendar */
    @js.native
    sealed trait DANGI
      extends StObject
         with CalendarIdentifier
    /* "dangi" */ val DANGI: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.DANGI & String = js.native
    
    /** Ethiopic calendar, Amete Alem (epoch approx. 5493 B.C.E) */
    @js.native
    sealed trait ETHIOAA
      extends StObject
         with CalendarIdentifier
    /* "ethioaa" */ val ETHIOAA: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ETHIOAA & String = js.native
    
    /** Ethiopic calendar, Amete Mihret (epoch approx, 8 C.E.) */
    @js.native
    sealed trait ETHIOPIC
      extends StObject
         with CalendarIdentifier
    /* "ethiopic" */ val ETHIOPIC: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ETHIOPIC & String = js.native
    
    /** Gregorian calendar (alias) */
    @js.native
    sealed trait GREGORIAN
      extends StObject
         with CalendarIdentifier
    /* "gregory" */ val GREGORIAN: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.GREGORIAN & String = js.native
    
    /** Gregorian calendar */
    @js.native
    sealed trait GREGORY
      extends StObject
         with CalendarIdentifier
    /* "gregory" */ val GREGORY: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.GREGORY & String = js.native
    
    /** Traditional Hebrew calendar */
    @js.native
    sealed trait HEBREW
      extends StObject
         with CalendarIdentifier
    /* "hebrew" */ val HEBREW: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.HEBREW & String = js.native
    
    /** Indian calendar */
    @js.native
    sealed trait INDIAN
      extends StObject
         with CalendarIdentifier
    /* "indian" */ val INDIAN: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.INDIAN & String = js.native
    
    /** Islamic calendar */
    @js.native
    sealed trait ISLAMIC
      extends StObject
         with CalendarIdentifier
    /* "islamic" */ val ISLAMIC: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC & String = js.native
    
    /** Islamic calendar, tabular (intercalary years [2,5,7,10,13,16,18,21,24,26,29] - civil epoch) */
    @js.native
    sealed trait ISLAMIC_CIVIL
      extends StObject
         with CalendarIdentifier
    /* "islamic-civil" */ val ISLAMIC_CIVIL: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC_CIVIL & String = js.native
    
    /** Islamic calendar, Saudi Arabia sighting */
    @js.native
    sealed trait ISLAMIC_RGSA
      extends StObject
         with CalendarIdentifier
    /* "islamic-rgsa" */ val ISLAMIC_RGSA: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC_RGSA & String = js.native
    
    /**Islamic calendar, tabular (intercalary years [2,5,7,10,13,16,18,21,24,26,29] - astronomical epoch) */
    @js.native
    sealed trait ISLAMIC_TBLA
      extends StObject
         with CalendarIdentifier
    /* "islamic-tbla" */ val ISLAMIC_TBLA: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC_TBLA & String = js.native
    
    /** Islamic calendar, Umm al-Qura */
    @js.native
    sealed trait ISLAMIC_UMALQURA
      extends StObject
         with CalendarIdentifier
    /* "islamic-umalqura" */ val ISLAMIC_UMALQURA: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC_UMALQURA & String = js.native
    
    /** ISO calendar (Gregorian calendar using the ISO 8601 calendar week rules) */
    @js.native
    sealed trait ISO8601
      extends StObject
         with CalendarIdentifier
    /* "iso8601" */ val ISO8601: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISO8601 & String = js.native
    
    /** Japanese imperial calendar */
    @js.native
    sealed trait JAPANESE
      extends StObject
         with CalendarIdentifier
    /* "japanese" */ val JAPANESE: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.JAPANESE & String = js.native
    
    /** Persian calendar */
    @js.native
    sealed trait PERSIAN
      extends StObject
         with CalendarIdentifier
    /* "persian" */ val PERSIAN: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.PERSIAN & String = js.native
    
    /** Civil (algorithmic) Arabic calendar */
    @js.native
    sealed trait ROC
      extends StObject
         with CalendarIdentifier
    /* "roc" */ val ROC: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ROC & String = js.native
  }
  
  @js.native
  sealed trait Weekday extends StObject
  @JSImport("expo-localization/build/Localization.types", "Weekday")
  @js.native
  object Weekday extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Weekday & Double] = js.native
    
    @js.native
    sealed trait FRIDAY
      extends StObject
         with Weekday
    /* 6 */ val FRIDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.FRIDAY & Double = js.native
    
    @js.native
    sealed trait MONDAY
      extends StObject
         with Weekday
    /* 2 */ val MONDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.MONDAY & Double = js.native
    
    @js.native
    sealed trait SATURDAY
      extends StObject
         with Weekday
    /* 7 */ val SATURDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.SATURDAY & Double = js.native
    
    @js.native
    sealed trait SUNDAY
      extends StObject
         with Weekday
    /* 1 */ val SUNDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.SUNDAY & Double = js.native
    
    @js.native
    sealed trait THURSDAY
      extends StObject
         with Weekday
    /* 5 */ val THURSDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.THURSDAY & Double = js.native
    
    @js.native
    sealed trait TUESDAY
      extends StObject
         with Weekday
    /* 3 */ val TUESDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.TUESDAY & Double = js.native
    
    @js.native
    sealed trait WEDNESDAY
      extends StObject
         with Weekday
    /* 4 */ val WEDNESDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.WEDNESDAY & Double = js.native
  }
  
  trait Calendar extends StObject {
    
    /**
      * The calendar identifier, one of [Unicode calendar types](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/calendar).
      *
      * On Android is limited to one of device's [available calendar types](https://developer.android.com/reference/java/util/Calendar#getAvailableCalendarTypes()).
      *
      * On iOS uses [calendar identifiers](https://developer.apple.com/documentation/foundation/calendar/identifier), but maps them to the corresponding Unicode types, will also never contain `'dangi'` or `'islamic-rgsa'` due to it not being implemented on iOS.
      */
    var calendar: CalendarIdentifier | Null
    
    /**
      * The first day of the week. For most calendars Sunday is numbered `1`, with Saturday being number `7`.
      * Can be null on some browsers that don't support the [weekInfo](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/weekInfo) property in [Intl](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl) API.
      * @example `1`, `7`.
      */
    var firstWeekday: Weekday | Null
    
    /**
      * Time zone for the calendar. Can be `null` on Web.
      * @example `'America/Los_Angeles'`, `'Europe/Warsaw'`, `'GMT+1'`.
      */
    var timeZone: String | Null
    
    /**
      * True when current device settings use 24 hour time format.
      * Can be null on some browsers that don't support the [hourCycle](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/hourCycle) property in [Intl](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl) API.
      */
    var uses24hourClock: Boolean | Null
  }
  object Calendar {
    
    inline def apply(): Calendar = {
      val __obj = js.Dynamic.literal(calendar = null, firstWeekday = null, timeZone = null, uses24hourClock = null)
      __obj.asInstanceOf[Calendar]
    }
    
    extension [Self <: Calendar](x: Self) {
      
      inline def setCalendar(value: CalendarIdentifier): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarNull: Self = StObject.set(x, "calendar", null)
      
      inline def setFirstWeekday(value: Weekday): Self = StObject.set(x, "firstWeekday", value.asInstanceOf[js.Any])
      
      inline def setFirstWeekdayNull: Self = StObject.set(x, "firstWeekday", null)
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
      
      inline def setUses24hourClock(value: Boolean): Self = StObject.set(x, "uses24hourClock", value.asInstanceOf[js.Any])
      
      inline def setUses24hourClockNull: Self = StObject.set(x, "uses24hourClock", null)
    }
  }
  
  trait Locale extends StObject {
    
    /**
      * Currency code for the locale.
      * Is `null` on Web, use a table lookup based on region instead.
      * @example `'USD'`, `'EUR'`, `'PLN'`.
      */
    var currencyCode: String | Null
    
    /**
      * Currency symbol for the locale.
      * Is `null` on Web, use a table lookup based on region (if available) instead.
      * @example `'$'`, `'€'`, `'zł'`.
      */
    var currencySymbol: String | Null
    
    /**
      * Decimal separator used for formatting numbers with fractional parts.
      * @example `'.'`, `','`.
      */
    var decimalSeparator: String | Null
    
    /**
      * Digit grouping separator used for formatting large numbers.
      * @example `'.'`, `','`.
      */
    var digitGroupingSeparator: String | Null
    
    /**
      * An [IETF BCP 47 language tag](https://en.wikipedia.org/wiki/IETF_language_tag) without the region code.
      * @example `'en'`, `'es'`, `'pl'`.
      */
    var languageCode: String
    
    /**
      * An [IETF BCP 47 language tag](https://en.wikipedia.org/wiki/IETF_language_tag) with a region code.
      * @example `'en-US'`, `'es-419'`, `'pl-PL'`.
      */
    var languageTag: String
    
    /**
      * The measurement system used in the locale.
      * On iOS is one of `'metric'`, `'us'`. On Android is one of `'metric'`, `'us'`, `'uk'`.
      *
      * Is `null` on Web, as user chosen measurement system is not exposed on the web and using locale to determine measurement systems is unreliable.
      * Ask for user preferences if possible.
      */
    var measurementSystem: (/* template literal string: metric */ String) | Null
    
    /**
      * The region code for your device that comes from the Region setting under Language & Region on iOS, Region settings on Android and is parsed from locale on Web (can be `null` on Web).
      */
    var regionCode: String | Null
    
    /**
      * Text direction for the locale. One of: `'ltr'`, `'rtl'`, but can also be `null` on some browsers without support for the [textInfo](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/textInfo) property in [Intl](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl) API.
      */
    var textDirection: ltr | rtl | Null
  }
  object Locale {
    
    inline def apply(languageCode: String, languageTag: String): Locale = {
      val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], currencyCode = null, currencySymbol = null, decimalSeparator = null, digitGroupingSeparator = null, measurementSystem = null, regionCode = null, textDirection = null)
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
      
      inline def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
      
      inline def setCurrencySymbolNull: Self = StObject.set(x, "currencySymbol", null)
      
      inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setDecimalSeparatorNull: Self = StObject.set(x, "decimalSeparator", null)
      
      inline def setDigitGroupingSeparator(value: String): Self = StObject.set(x, "digitGroupingSeparator", value.asInstanceOf[js.Any])
      
      inline def setDigitGroupingSeparatorNull: Self = StObject.set(x, "digitGroupingSeparator", null)
      
      inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      inline def setLanguageTag(value: String): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
      
      inline def setMeasurementSystem(value: /* template literal string: metric */ String): Self = StObject.set(x, "measurementSystem", value.asInstanceOf[js.Any])
      
      inline def setMeasurementSystemNull: Self = StObject.set(x, "measurementSystem", null)
      
      inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
      
      inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
      
      inline def setTextDirection(value: ltr | rtl): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionNull: Self = StObject.set(x, "textDirection", null)
    }
  }
  
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
      * These are returned in the order that the user defined in the device settings.
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
