package typings.electron.global.Electron

import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.electronStrings.checkbox
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.radio
import typings.electron.electronStrings.separator
import typings.electron.electronStrings.submenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.MenuItem")
@js.native
class MenuItem protected ()
  extends typings.electron.Electron.MenuItem {
  // Docs: http://electronjs.org/docs/api/menu-item
  /**
    * MenuItem
    */
  def this(options: MenuItemConstructorOptions) = this()
  /* CompleteClass */
  override var checked: Boolean = js.native
  /* CompleteClass */
  override var click: js.Function = js.native
  /* CompleteClass */
  override var commandId: Double = js.native
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var label: String = js.native
  /* CompleteClass */
  override var menu: typings.electron.Electron.Menu = js.native
  /* CompleteClass */
  override var registerAccelerator: Boolean = js.native
  /* CompleteClass */
  override var sublabel: String = js.native
  /* CompleteClass */
  override var toolTip: String = js.native
  /* CompleteClass */
  override var `type`: normal | separator | submenu | checkbox | radio = js.native
  /* CompleteClass */
  override var visible: Boolean = js.native
}

