package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.BackgroundColorDarkMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundAssetMod {
  
  @JSImport("@expo/configure-splash-screen/build/ios/BackgroundAsset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(iosProjectPath: String, config: BackgroundColorDarkMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iosProjectPath.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
