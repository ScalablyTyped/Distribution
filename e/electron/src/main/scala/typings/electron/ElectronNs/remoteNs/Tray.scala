package typings.electron.ElectronNs.remoteNs

import typings.electron.ElectronNs.NativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.remote.Tray")
@js.native
class Tray protected ()
  extends typings.electron.ElectronNs.Tray {
  def this(image: String) = this()
  def this(image: NativeImage) = this()
}

