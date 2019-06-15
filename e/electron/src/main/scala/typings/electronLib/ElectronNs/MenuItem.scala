package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.MenuItem")
@js.native
class MenuItem protected () extends js.Object {
  // Docs: http://electronjs.org/docs/api/menu-item
  def this(options: MenuItemConstructorOptions) = this()
  var accelerator: java.lang.String = js.native
  var checked: scala.Boolean = js.native
  var click: js.Function = js.native
  var commandId: scala.Double = js.native
  var enabled: scala.Boolean = js.native
  var icon: NativeImage = js.native
  var id: java.lang.String = js.native
  var label: java.lang.String = js.native
  var menu: Menu = js.native
  var registerAccelerator: scala.Boolean = js.native
  var role: java.lang.String = js.native
  var sublabel: java.lang.String = js.native
  var submenu: Menu = js.native
  var `type`: java.lang.String = js.native
  var visible: scala.Boolean = js.native
}

