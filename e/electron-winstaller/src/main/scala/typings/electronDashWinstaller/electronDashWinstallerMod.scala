package typings.electronDashWinstaller

import typings.electronDashWinstaller.libOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-winstaller", JSImport.Namespace)
@js.native
object electronDashWinstallerMod extends js.Object {
  def convertVersion(version: String): String = js.native
  def createWindowsInstaller(options: Options): js.Promise[Unit] = js.native
}

