package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoAdsAdmobWithIosAdMobMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-ads-admob/withIosAdMob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGoogleMobileAdsAppId(config: PickExpoConfigios): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleMobileAdsAppId")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setGoogleMobileAdsAppId(
    config: PickExpoConfigios,
    param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleMobileAdsAppId")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-ads-admob/withIosAdMob", "withIosAdMob")
  @js.native
  val withIosAdMob: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
