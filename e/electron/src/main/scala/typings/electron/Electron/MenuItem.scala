package typings.electron.Electron

import typings.electron.electronStrings.about
import typings.electron.electronStrings.appMenu
import typings.electron.electronStrings.checkbox
import typings.electron.electronStrings.clearRecentDocuments
import typings.electron.electronStrings.close
import typings.electron.electronStrings.copy
import typings.electron.electronStrings.cut
import typings.electron.electronStrings.delete
import typings.electron.electronStrings.editMenu
import typings.electron.electronStrings.fileMenu
import typings.electron.electronStrings.forceReload
import typings.electron.electronStrings.front
import typings.electron.electronStrings.help
import typings.electron.electronStrings.hide
import typings.electron.electronStrings.hideOthers
import typings.electron.electronStrings.mergeAllWindows
import typings.electron.electronStrings.minimize
import typings.electron.electronStrings.moveTabToNewWindow
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.paste
import typings.electron.electronStrings.pasteAndMatchStyle
import typings.electron.electronStrings.quit
import typings.electron.electronStrings.radio
import typings.electron.electronStrings.recentDocuments
import typings.electron.electronStrings.redo
import typings.electron.electronStrings.reload
import typings.electron.electronStrings.resetZoom
import typings.electron.electronStrings.selectAll
import typings.electron.electronStrings.selectNextTab
import typings.electron.electronStrings.selectPreviousTab
import typings.electron.electronStrings.separator
import typings.electron.electronStrings.services
import typings.electron.electronStrings.startSpeaking
import typings.electron.electronStrings.stopSpeaking
import typings.electron.electronStrings.submenu
import typings.electron.electronStrings.toggleDevTools
import typings.electron.electronStrings.toggleTabBar
import typings.electron.electronStrings.togglefullscreen
import typings.electron.electronStrings.undo
import typings.electron.electronStrings.unhide
import typings.electron.electronStrings.viewMenu
import typings.electron.electronStrings.window
import typings.electron.electronStrings.windowMenu
import typings.electron.electronStrings.zoom
import typings.electron.electronStrings.zoomIn
import typings.electron.electronStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem extends js.Object {
  var accelerator: js.UndefOr[Accelerator] = js.native
  var checked: Boolean = js.native
  var click: js.Function = js.native
  var commandId: Double = js.native
  var enabled: Boolean = js.native
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  var id: String = js.native
  var label: String = js.native
  var menu: Menu = js.native
  var registerAccelerator: Boolean = js.native
  var role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.native
  var sublabel: String = js.native
  var submenu: js.UndefOr[Menu] = js.native
  var toolTip: String = js.native
  var `type`: normal | separator | submenu | checkbox | radio = js.native
  var visible: Boolean = js.native
}

object MenuItem {
  @scala.inline
  def apply(
    checked: Boolean,
    click: js.Function,
    commandId: Double,
    enabled: Boolean,
    id: String,
    label: String,
    menu: Menu,
    registerAccelerator: Boolean,
    sublabel: String,
    toolTip: String,
    `type`: normal | separator | submenu | checkbox | radio,
    visible: Boolean
  ): MenuItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], commandId = commandId.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], registerAccelerator = registerAccelerator.asInstanceOf[js.Any], sublabel = sublabel.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  @scala.inline
  implicit class MenuItemOps[Self <: MenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: js.Function): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandId(value: Double): Self = this.set("commandId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu(value: Menu): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisterAccelerator(value: Boolean): Self = this.set("registerAccelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def setSublabel(value: String): Self = this.set("sublabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: normal | separator | submenu | checkbox | radio): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccelerator(value: Accelerator): Self = this.set("accelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerator: Self = this.set("accelerator", js.undefined)
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setRole(
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
    ): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSubmenu(value: Menu): Self = this.set("submenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
  }
  
}

