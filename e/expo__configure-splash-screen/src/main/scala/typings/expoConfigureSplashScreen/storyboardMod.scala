package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.ImageImageResizeMode
import typings.expoConfigureSplashScreen.pbxprojMod.IosProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyboardMod {
  
  @JSImport("@expo/configure-splash-screen/build/ios/Storyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(iosProject: IosProject): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iosProject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def default(iosProject: IosProject, config: ImageImageResizeMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iosProject.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
