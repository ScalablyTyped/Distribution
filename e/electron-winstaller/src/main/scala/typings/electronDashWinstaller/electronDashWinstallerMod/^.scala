package typings.electronDashWinstaller.electronDashWinstallerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-winstaller", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertVersion(version: String): String = js.native
  def createWindowsInstaller(options: Options): js.Promise[Unit] = js.native
}

