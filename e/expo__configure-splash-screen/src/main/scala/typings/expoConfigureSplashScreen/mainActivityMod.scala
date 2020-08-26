package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.constantsMod.ResizeMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/configure-splash-screen/build/android/MainActivity", JSImport.Namespace)
@js.native
object mainActivityMod extends js.Object {
  def default(projectRootPath: String, resizeMode: ResizeMode): js.Promise[Unit] = js.native
  def default(projectRootPath: String, resizeMode: ResizeMode, statusBarTranslucent: Boolean): js.Promise[Unit] = js.native
}

