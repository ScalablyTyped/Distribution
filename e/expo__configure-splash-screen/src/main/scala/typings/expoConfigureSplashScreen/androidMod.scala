package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfigJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidMod {
  
  @JSImport("@expo/configure-splash-screen/build/android", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(projectRootPath: String, configJSON: AndroidSplashScreenConfigJSON): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(projectRootPath.asInstanceOf[js.Any], configJSON.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
