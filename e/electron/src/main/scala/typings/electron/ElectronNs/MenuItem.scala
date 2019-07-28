package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.MenuItem")
@js.native
class MenuItem protected () extends js.Object {
  // Docs: http://electronjs.org/docs/api/menu-item
  def this(options: MenuItemConstructorOptions) = this()
  var accelerator: String = js.native
  var checked: Boolean = js.native
  var click: js.Function = js.native
  var commandId: Double = js.native
  var enabled: Boolean = js.native
  var icon: NativeImage = js.native
  var id: String = js.native
  var label: String = js.native
  var menu: Menu = js.native
  var registerAccelerator: Boolean = js.native
  var role: String = js.native
  var sublabel: String = js.native
  var submenu: Menu = js.native
  var `type`: String = js.native
  var visible: Boolean = js.native
}

