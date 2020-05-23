package typings.electronUtil.mod

import typings.electron.Electron.Accelerator
import typings.electron.Electron.BrowserWindow
import typings.electron.Electron.KeyboardEvent
import typings.electron.Electron.Menu
import typings.electron.Electron.MenuItem
import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.Electron.NativeImage_
import typings.electronUtil.electronUtilStrings.about
import typings.electronUtil.electronUtilStrings.checkbox
import typings.electronUtil.electronUtilStrings.clearRecentDocuments
import typings.electronUtil.electronUtilStrings.close
import typings.electronUtil.electronUtilStrings.copy
import typings.electronUtil.electronUtilStrings.cut
import typings.electronUtil.electronUtilStrings.delete
import typings.electronUtil.electronUtilStrings.editMenu
import typings.electronUtil.electronUtilStrings.fileMenu
import typings.electronUtil.electronUtilStrings.forceReload
import typings.electronUtil.electronUtilStrings.front
import typings.electronUtil.electronUtilStrings.help
import typings.electronUtil.electronUtilStrings.hide
import typings.electronUtil.electronUtilStrings.hideOthers
import typings.electronUtil.electronUtilStrings.mergeAllWindows
import typings.electronUtil.electronUtilStrings.minimize
import typings.electronUtil.electronUtilStrings.moveTabToNewWindow
import typings.electronUtil.electronUtilStrings.normal
import typings.electronUtil.electronUtilStrings.paste
import typings.electronUtil.electronUtilStrings.pasteAndMatchStyle
import typings.electronUtil.electronUtilStrings.quit
import typings.electronUtil.electronUtilStrings.radio
import typings.electronUtil.electronUtilStrings.recentDocuments
import typings.electronUtil.electronUtilStrings.redo
import typings.electronUtil.electronUtilStrings.reload
import typings.electronUtil.electronUtilStrings.resetZoom
import typings.electronUtil.electronUtilStrings.selectAll
import typings.electronUtil.electronUtilStrings.selectNextTab
import typings.electronUtil.electronUtilStrings.selectPreviousTab
import typings.electronUtil.electronUtilStrings.separator
import typings.electronUtil.electronUtilStrings.services
import typings.electronUtil.electronUtilStrings.startSpeaking
import typings.electronUtil.electronUtilStrings.stopSpeaking
import typings.electronUtil.electronUtilStrings.submenu
import typings.electronUtil.electronUtilStrings.toggleDevTools
import typings.electronUtil.electronUtilStrings.toggleTabBar
import typings.electronUtil.electronUtilStrings.togglefullscreen
import typings.electronUtil.electronUtilStrings.undo
import typings.electronUtil.electronUtilStrings.unhide
import typings.electronUtil.electronUtilStrings.viewMenu
import typings.electronUtil.electronUtilStrings.window
import typings.electronUtil.electronUtilStrings.windowMenu
import typings.electronUtil.electronUtilStrings.zoom
import typings.electronUtil.electronUtilStrings.zoomIn
import typings.electronUtil.electronUtilStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Readonly<electron.electron.MenuItemConstructorOptions> */
trait OpenUrlMenuItemOptions extends js.Object {
  val accelerator: js.UndefOr[Accelerator] = js.undefined
  val acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined
  val after: js.UndefOr[js.Array[String]] = js.undefined
  val afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  val before: js.UndefOr[js.Array[String]] = js.undefined
  val beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  val checked: js.UndefOr[Boolean] = js.undefined
  val click: js.UndefOr[
    js.Function3[
      /* menuItem */ MenuItem, 
      /* browserWindow */ BrowserWindow, 
      /* event */ KeyboardEvent, 
      Unit
    ]
  ] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val icon: js.UndefOr[NativeImage_ | String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val label: js.UndefOr[String] = js.undefined
  val registerAccelerator: js.UndefOr[Boolean] = js.undefined
  val role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | typings.electronUtil.electronUtilStrings.appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.undefined
  val sublabel: js.UndefOr[String] = js.undefined
  val submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.undefined
  val toolTip: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[
    normal | separator | typings.electronUtil.electronUtilStrings.submenu | checkbox | radio
  ] = js.undefined
  /**
  	URL to be opened when the menu item is clicked.
  	*/
  val url: String
  val visible: js.UndefOr[Boolean] = js.undefined
}

object OpenUrlMenuItemOptions {
  @scala.inline
  def apply(
    url: String,
    accelerator: Accelerator = null,
    acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined,
    after: js.Array[String] = null,
    afterGroupContaining: js.Array[String] = null,
    before: js.Array[String] = null,
    beforeGroupContaining: js.Array[String] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    click: (/* menuItem */ MenuItem, /* browserWindow */ BrowserWindow, /* event */ KeyboardEvent) => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    icon: NativeImage_ | String = null,
    id: String = null,
    label: String = null,
    registerAccelerator: js.UndefOr[Boolean] = js.undefined,
    role: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | typings.electronUtil.electronUtilStrings.appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu = null,
    sublabel: String = null,
    submenu: js.Array[MenuItemConstructorOptions] | Menu = null,
    toolTip: String = null,
    `type`: normal | separator | submenu | checkbox | radio = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OpenUrlMenuItemOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (accelerator != null) __obj.updateDynamic("accelerator")(accelerator.asInstanceOf[js.Any])
    if (!js.isUndefined(acceleratorWorksWhenHidden)) __obj.updateDynamic("acceleratorWorksWhenHidden")(acceleratorWorksWhenHidden.get.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterGroupContaining != null) __obj.updateDynamic("afterGroupContaining")(afterGroupContaining.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeGroupContaining != null) __obj.updateDynamic("beforeGroupContaining")(beforeGroupContaining.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction3(click))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(registerAccelerator)) __obj.updateDynamic("registerAccelerator")(registerAccelerator.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sublabel != null) __obj.updateDynamic("sublabel")(sublabel.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlMenuItemOptions]
  }
}

