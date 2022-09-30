package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigandroid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withAndroidAdMobMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-ads-admob/withAndroidAdMob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGoogleMobileAdsAppId(config: PickExpoConfigandroid): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleMobileAdsAppId")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getGoogleMobileAdsAutoInit(config: PickExpoConfigandroid): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleMobileAdsAutoInit")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setAdMobConfig(
    config: PickExpoConfigandroid,
    androidManifest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Manifest.AndroidManifest */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setAdMobConfig")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-ads-admob/withAndroidAdMob", "withAndroidAdMob")
  @js.native
  val withAndroidAdMob: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
