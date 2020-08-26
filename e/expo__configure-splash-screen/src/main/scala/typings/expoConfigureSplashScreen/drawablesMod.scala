package typings.expoConfigureSplashScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/configure-splash-screen/build/android/Drawables", JSImport.Namespace)
@js.native
object drawablesMod extends js.Object {
  def default(androidMainPath: String): js.Promise[Unit] = js.native
  def default(
    androidMainPath: String,
    splashScreenImagePath: js.UndefOr[scala.Nothing],
    darkModeSplashScreenImagePath: String
  ): js.Promise[Unit] = js.native
  def default(androidMainPath: String, splashScreenImagePath: String): js.Promise[Unit] = js.native
  def default(androidMainPath: String, splashScreenImagePath: String, darkModeSplashScreenImagePath: String): js.Promise[Unit] = js.native
}

