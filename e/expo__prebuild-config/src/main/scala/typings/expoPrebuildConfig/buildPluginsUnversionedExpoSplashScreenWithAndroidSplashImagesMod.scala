package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigandroidspla
import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenGetAndroidSplashConfigMod.SplashScreenConfig
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.dark
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoSplashScreenWithAndroidSplashImagesMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashImages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSplashImageDrawablesAsync(config: PickExpoConfigandroidspla, projectRoot: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setSplashImageDrawablesAsync")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setSplashImageDrawablesForThemeAsync(config: Null, theme: dark | light, projectRoot: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setSplashImageDrawablesForThemeAsync")(config.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setSplashImageDrawablesForThemeAsync(config: SplashScreenConfig, theme: dark | light, projectRoot: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setSplashImageDrawablesForThemeAsync")(config.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashImages", "withAndroidSplashImages")
  @js.native
  val withAndroidSplashImages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
