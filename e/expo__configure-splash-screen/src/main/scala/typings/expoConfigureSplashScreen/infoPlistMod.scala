package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.PartialStatusBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/configure-splash-screen/build/ios/Info.plist", JSImport.Namespace)
@js.native
object infoPlistMod extends js.Object {
  def default(iosProjectPath: String): js.Promise[Unit] = js.native
  def default(iosProjectPath: String, hasStatusBarHiddenStatusBarStyle: PartialStatusBarOptions): js.Promise[Unit] = js.native
}

