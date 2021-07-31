package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.ImageResizeModeStatusBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainActivityMod {
  
  @JSImport("@expo/configure-splash-screen/build/android/MainActivity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(projectRootPath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(projectRootPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def default(projectRootPath: String, config: ImageResizeModeStatusBar): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(projectRootPath.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
