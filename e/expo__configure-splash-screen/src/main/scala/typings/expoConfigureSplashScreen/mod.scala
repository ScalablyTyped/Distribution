package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.`dark-content`
import typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.`light-content`
import typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.contain
import typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.cover
import typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.default
import typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.native
import typings.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfigJSON
import typings.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfigJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object SplashScreenImageResizeMode {
    
    @JSImport("@expo/configure-splash-screen/build", "SplashScreenImageResizeMode.CONTAIN")
    @js.native
    val CONTAIN: contain = js.native
    
    @JSImport("@expo/configure-splash-screen/build", "SplashScreenImageResizeMode.COVER")
    @js.native
    val COVER: cover = js.native
    
    @JSImport("@expo/configure-splash-screen/build", "SplashScreenImageResizeMode.NATIVE")
    @js.native
    val NATIVE: native = js.native
  }
  
  object SplashScreenStatusBarStyle {
    
    @JSImport("@expo/configure-splash-screen/build", "SplashScreenStatusBarStyle.DARK_CONTENT")
    @js.native
    val DARK_CONTENT: `dark-content` = js.native
    
    @JSImport("@expo/configure-splash-screen/build", "SplashScreenStatusBarStyle.DEFAULT")
    @js.native
    val DEFAULT: default = js.native
    
    @JSImport("@expo/configure-splash-screen/build", "SplashScreenStatusBarStyle.LIGHT_CONTENT")
    @js.native
    val LIGHT_CONTENT: `light-content` = js.native
  }
  
  @JSImport("@expo/configure-splash-screen/build", "configureAndroidSplashScreen")
  @js.native
  def configureAndroidSplashScreen(projectRootPath: String, configJSON: AndroidSplashScreenConfigJSON): js.Promise[Unit] = js.native
  
  @JSImport("@expo/configure-splash-screen/build", "configureIosSplashScreen")
  @js.native
  def configureIosSplashScreen(projectRootPath: String, config: IosSplashScreenConfigJSON): js.Promise[Unit] = js.native
}
