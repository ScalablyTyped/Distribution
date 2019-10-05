package typings.electron.electronMod

import typings.electron.Electron.MenuItemConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "MenuItem")
@js.native
class MenuItem protected ()
  extends typings.electron.Electron.MenuItem {
  // Docs: http://electronjs.org/docs/api/menu-item
  def this(options: MenuItemConstructorOptions) = this()
}

