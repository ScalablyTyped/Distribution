package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigandroidandr
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.java_
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.kt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withAndroidSplashLegacyMainActivityMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashLegacyMainActivity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSplashScreenLegacyMainActivity(config: PickExpoConfigandroidandr, mainActivity: String, language: java_ | kt): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setSplashScreenLegacyMainActivity")(config.asInstanceOf[js.Any], mainActivity.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashLegacyMainActivity", "withAndroidSplashLegacyMainActivity")
  @js.native
  val withAndroidSplashLegacyMainActivity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
