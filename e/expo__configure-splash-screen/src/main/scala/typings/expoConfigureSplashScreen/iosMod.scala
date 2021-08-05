package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfigJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosMod {
  
  @JSImport("@expo/configure-splash-screen/build/ios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(projectRootPath: String, config: IosSplashScreenConfigJSON): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(projectRootPath.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
