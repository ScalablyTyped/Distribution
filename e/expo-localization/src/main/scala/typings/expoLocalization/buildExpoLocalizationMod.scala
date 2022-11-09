package typings.expoLocalization

import typings.expoLocalization.anon.OmitLocalizationgetCalend
import typings.expoLocalization.buildLocalizationDottypesMod.Calendar
import typings.expoLocalization.buildLocalizationDottypesMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExpoLocalizationMod {
  
  object default {
    
    @JSImport("expo-localization/build/ExpoLocalization", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.currency")
    @js.native
    val currency: String | Null = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.decimalSeparator")
    @js.native
    val decimalSeparator: String = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.digitGroupingSeparator")
    @js.native
    val digitGroupingSeparator: String = js.native
    
    inline def getCalendars(): js.Array[Calendar] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalendars")().asInstanceOf[js.Array[Calendar]]
    
    inline def getLocales(): js.Array[Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")().asInstanceOf[js.Array[Locale]]
    
    inline def getLocalizationAsync(): js.Promise[OmitLocalizationgetCalend] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizationAsync")().asInstanceOf[js.Promise[OmitLocalizationgetCalend]]
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.isMetric")
    @js.native
    val isMetric: Boolean = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.isRTL")
    @js.native
    val isRTL: Boolean = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.isoCurrencyCodes")
    @js.native
    val isoCurrencyCodes: js.Array[String] = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.locale")
    @js.native
    val locale: String = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.locales")
    @js.native
    val locales: js.Array[String] = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.region")
    @js.native
    val region: String | Null = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.timezone")
    @js.native
    val timezone: String = js.native
  }
}
