package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.MenuItem")
@js.native
class MenuItem protected () extends js.Object {
  // Docs: http://electron.atom.io/docs/api/menu-item
  def this(options: MenuItemConstructorOptions) = this()
  var checked: scala.Boolean = js.native
  var click: js.Function = js.native
  var enabled: scala.Boolean = js.native
  var label: java.lang.String = js.native
  var visible: scala.Boolean = js.native
}

