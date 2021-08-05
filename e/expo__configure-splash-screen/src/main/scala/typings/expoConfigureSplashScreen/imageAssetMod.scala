package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.DarkModeImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageAssetMod {
  
  @JSImport("@expo/configure-splash-screen/build/ios/ImageAsset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(iosProjectPath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iosProjectPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(iosProjectPath: String, config: DarkModeImage): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iosProjectPath.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
