package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "MenuItem")
@js.native
class MenuItem protected ()
  extends electronLib.ElectronNs.MenuItem {
  // Docs: http://electron.atom.io/docs/api/menu-item
  def this(options: electronLib.ElectronNs.MenuItemConstructorOptions) = this()
}

