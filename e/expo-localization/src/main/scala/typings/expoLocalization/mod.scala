package typings.expoLocalization

import typings.expoLocalization.localizationTypesMod.Localization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-localization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalizationAsync(): js.Promise[Localization] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizationAsync")().asInstanceOf[js.Promise[Localization]]
  
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
