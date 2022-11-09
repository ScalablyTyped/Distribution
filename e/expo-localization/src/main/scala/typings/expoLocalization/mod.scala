package typings.expoLocalization

import typings.expoLocalization.buildLocalizationDottypesMod.Calendar
import typings.expoLocalization.buildLocalizationDottypesMod.Locale
import typings.expoLocalization.buildLocalizationDottypesMod.Localization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-localization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-localization", "CalendarIdentifier")
  @js.native
  object CalendarIdentifier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier & String
      ] = js.native
    
    /* "buddhist" */ val BUDDHIST: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.BUDDHIST & String = js.native
    
    /* "chinese" */ val CHINESE: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.CHINESE & String = js.native
    
    /* "coptic" */ val COPTIC: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.COPTIC & String = js.native
    
    /* "dangi" */ val DANGI: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.DANGI & String = js.native
    
    /* "ethioaa" */ val ETHIOAA: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ETHIOAA & String = js.native
    
    /* "ethiopic" */ val ETHIOPIC: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ETHIOPIC & String = js.native
    
    /* "gregory" */ val GREGORIAN: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.GREGORIAN & String = js.native
    
    /* "gregory" */ val GREGORY: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.GREGORY & String = js.native
    
    /* "hebrew" */ val HEBREW: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.HEBREW & String = js.native
    
    /* "indian" */ val INDIAN: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.INDIAN & String = js.native
    
    /* "islamic" */ val ISLAMIC: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC & String = js.native
    
    /* "islamic-civil" */ val ISLAMIC_CIVIL: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC_CIVIL & String = js.native
    
    /* "islamic-rgsa" */ val ISLAMIC_RGSA: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC_RGSA & String = js.native
    
    /* "islamic-tbla" */ val ISLAMIC_TBLA: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC_TBLA & String = js.native
    
    /* "islamic-umalqura" */ val ISLAMIC_UMALQURA: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISLAMIC_UMALQURA & String = js.native
    
    /* "iso8601" */ val ISO8601: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ISO8601 & String = js.native
    
    /* "japanese" */ val JAPANESE: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.JAPANESE & String = js.native
    
    /* "persian" */ val PERSIAN: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.PERSIAN & String = js.native
    
    /* "roc" */ val ROC: typings.expoLocalization.buildLocalizationDottypesMod.CalendarIdentifier.ROC & String = js.native
  }
  
  @JSImport("expo-localization", "Weekday")
  @js.native
  object Weekday extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoLocalization.buildLocalizationDottypesMod.Weekday & Double] = js.native
    
    /* 6 */ val FRIDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.FRIDAY & Double = js.native
    
    /* 2 */ val MONDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.MONDAY & Double = js.native
    
    /* 7 */ val SATURDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.SATURDAY & Double = js.native
    
    /* 1 */ val SUNDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.SUNDAY & Double = js.native
    
    /* 5 */ val THURSDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.THURSDAY & Double = js.native
    
    /* 3 */ val TUESDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.TUESDAY & Double = js.native
    
    /* 4 */ val WEDNESDAY: typings.expoLocalization.buildLocalizationDottypesMod.Weekday.WEDNESDAY & Double = js.native
  }
  
  @JSImport("expo-localization", "currency")
  @js.native
  val currency: String | Null = js.native
  
  @JSImport("expo-localization", "decimalSeparator")
  @js.native
  val decimalSeparator: String = js.native
  
  @JSImport("expo-localization", "digitGroupingSeparator")
  @js.native
  val digitGroupingSeparator: String = js.native
  
  inline def getCalendars(): js.Array[Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalendars")().asInstanceOf[js.Array[Calendar]]
  
  inline def getLocales(): js.Array[Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")().asInstanceOf[js.Array[Locale]]
  
  inline def getLocalizationAsync(): js.Promise[Localization] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizationAsync")().asInstanceOf[js.Promise[Localization]]
  
  @JSImport("expo-localization", "isMetric")
  @js.native
  val isMetric: Boolean = js.native
  
  @JSImport("expo-localization", "isRTL")
  @js.native
  val isRTL: Boolean = js.native
  
  @JSImport("expo-localization", "isoCurrencyCodes")
  @js.native
  val isoCurrencyCodes: js.Array[String] = js.native
  
  @JSImport("expo-localization", "locale")
  @js.native
  val locale: String = js.native
  
  @JSImport("expo-localization", "locales")
  @js.native
  val locales: js.Array[String] = js.native
  
  @JSImport("expo-localization", "region")
  @js.native
  val region: String | Null = js.native
  
  @JSImport("expo-localization", "timezone")
  @js.native
  val timezone: String = js.native
}
