package typings.expoConfigureSplashScreen

import typings.colorString.mod.ColorDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/configure-splash-screen/build/ios/BackgroundAsset", JSImport.Namespace)
@js.native
object backgroundAssetMod extends js.Object {
  def default(iosProjectPath: String, color: ColorDescriptor): js.Promise[Unit] = js.native
  def default(iosProjectPath: String, color: ColorDescriptor, darkModeColor: ColorDescriptor): js.Promise[Unit] = js.native
}

