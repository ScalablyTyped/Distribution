package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Tray")
@js.native
class Tray protected ()
  extends electronLib.ElectronNs.Tray {
  def this(image: electronLib.ElectronNs.NativeImage) = this()
  def this(image: java.lang.String) = this()
}

