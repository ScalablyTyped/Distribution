package typings.electron.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Tray")
@js.native
class Tray protected ()
  extends typings.electron.ElectronNs.Tray {
  def this(image: String) = this()
  def this(image: typings.electron.ElectronNs.NativeImage) = this()
}

