package typings.expoPrebuildConfig

import typings.expoConfigTypes.mod.ExpoConfig
import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenGetIosSplashConfigMod.IOSSplashConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoSplashScreenWithIosSplashInfoPlistMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withIosSplashInfoPlist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSplashInfoPlist(
    config: ExpoConfig,
    infoPlist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any,
    splash: IOSSplashConfig
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setSplashInfoPlist")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any], splash.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withIosSplashInfoPlist", "withIosSplashInfoPlist")
  @js.native
  val withIosSplashInfoPlist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin<IOSSplashConfig> */ Any = js.native
}
