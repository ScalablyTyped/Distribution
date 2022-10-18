package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickSplashScreenConfigres
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoSplashScreenWithAndroidSplashDrawablesMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashDrawables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSplashDrawableAsync(hasResizeMode: PickSplashScreenConfigres, projectRoot: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setSplashDrawableAsync")(hasResizeMode.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashDrawables", "withAndroidSplashDrawables")
  @js.native
  val withAndroidSplashDrawables: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin<Pick<SplashScreenConfig, 'resizeMode'>> */ Any = js.native
}
