package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.interfaceBuilderMod.IBSplashScreenDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withIosSplashScreenStoryboardMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withIosSplashScreenStoryboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withIosSplashScreenStoryboard", "STORYBOARD_FILE_PATH")
  @js.native
  val STORYBOARD_FILE_PATH: /* "./SplashScreen.storyboard" */ String = js.native
  
  inline def getTemplateAsync(): js.Promise[IBSplashScreenDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateAsync")().asInstanceOf[js.Promise[IBSplashScreenDocument]]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withIosSplashScreenStoryboard", "withIosSplashScreenStoryboard")
  @js.native
  val withIosSplashScreenStoryboard: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin<Mod<IBSplashScreenDocument>> */ Any = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withIosSplashScreenStoryboard", "withIosSplashScreenStoryboardBaseMod")
  @js.native
  val withIosSplashScreenStoryboardBaseMod: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
