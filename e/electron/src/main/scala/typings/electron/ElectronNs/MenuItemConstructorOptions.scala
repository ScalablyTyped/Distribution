package typings.electron.ElectronNs

import typings.electron.electronStrings.about
import typings.electron.electronStrings.appMenu
import typings.electron.electronStrings.checkbox
import typings.electron.electronStrings.close
import typings.electron.electronStrings.copy
import typings.electron.electronStrings.cut
import typings.electron.electronStrings.delete
import typings.electron.electronStrings.editMenu
import typings.electron.electronStrings.fileMenu
import typings.electron.electronStrings.forcereload
import typings.electron.electronStrings.front
import typings.electron.electronStrings.help
import typings.electron.electronStrings.hide
import typings.electron.electronStrings.hideothers
import typings.electron.electronStrings.minimize
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.paste
import typings.electron.electronStrings.pasteandmatchstyle
import typings.electron.electronStrings.quit
import typings.electron.electronStrings.radio
import typings.electron.electronStrings.redo
import typings.electron.electronStrings.reload
import typings.electron.electronStrings.resetzoom
import typings.electron.electronStrings.selectall
import typings.electron.electronStrings.separator
import typings.electron.electronStrings.services
import typings.electron.electronStrings.startspeaking
import typings.electron.electronStrings.stopspeaking
import typings.electron.electronStrings.submenu
import typings.electron.electronStrings.toggledevtools
import typings.electron.electronStrings.togglefullscreen
import typings.electron.electronStrings.undo
import typings.electron.electronStrings.unhide
import typings.electron.electronStrings.viewMenu
import typings.electron.electronStrings.window
import typings.electron.electronStrings.windowMenu
import typings.electron.electronStrings.zoom
import typings.electron.electronStrings.zoomin
import typings.electron.electronStrings.zoomout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemConstructorOptions extends js.Object {
  var accelerator: js.UndefOr[Accelerator] = js.undefined
  /**
    * Inserts this item after the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu.
    */
  var after: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group after the containing group of the item with the specified
    * label.
    */
  var afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Inserts this item before the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu. Also
    * implies that the menu item in question should be placed in the same “group” as
    * the item.
    */
  var before: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group before the containing group of the item with the specified
    * label.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Should only be specified for checkbox or radio type menu items.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * Will be called with click(menuItem, browserWindow, event) when the menu item is
    * clicked.
    */
  var click: js.UndefOr[
    js.Function3[/* menuItem */ MenuItem, /* browserWindow */ BrowserWindow, /* event */ Event, Unit]
  ] = js.undefined
  /**
    * If false, the menu item will be greyed out and unclickable.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[NativeImage | String] = js.undefined
  /**
    * Unique within a single menu. If defined then it can be used as a reference to
    * this item by the position attribute.
    */
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  /**
    * If false, the accelerator won't be registered with the system, but it will still
    * be displayed. Defaults to true.
    */
  var registerAccelerator: js.UndefOr[Boolean] = js.undefined
  /**
    * Can be undo, redo, cut, copy, paste, pasteandmatchstyle, delete, selectall,
    * reload, forcereload, toggledevtools, resetzoom, zoomin, zoomout,
    * togglefullscreen, window, minimize, close, help, about, services, hide,
    * hideothers, unhide, quit, startspeaking, stopspeaking, close, minimize, zoom,
    * front, appMenu, fileMenu, editMenu, viewMenu or windowMenu Define the action of
    * the menu item, when specified the click property will be ignored. See .
    */
  var role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteandmatchstyle | delete | selectall | reload | forcereload | toggledevtools | resetzoom | zoomin | zoomout | togglefullscreen | window | minimize | close | help | about | services | hide | hideothers | unhide | quit | startspeaking | stopspeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | windowMenu
  ] = js.undefined
  var sublabel: js.UndefOr[String] = js.undefined
  /**
    * Should be specified for submenu type menu items. If submenu is specified, the
    * type: 'submenu' can be omitted. If the value is not a then it will be
    * automatically converted to one using Menu.buildFromTemplate.
    */
  var submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.undefined
  /**
    * Can be normal, separator, submenu, checkbox or radio.
    */
  var `type`: js.UndefOr[normal | separator | submenu | checkbox | radio] = js.undefined
  /**
    * If false, the menu item will be entirely hidden.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object MenuItemConstructorOptions {
  @scala.inline
  def apply(
    accelerator: Accelerator = null,
    after: js.Array[String] = null,
    afterGroupContaining: js.Array[String] = null,
    before: js.Array[String] = null,
    beforeGroupContaining: js.Array[String] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    click: (/* menuItem */ MenuItem, /* browserWindow */ BrowserWindow, /* event */ Event) => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    icon: NativeImage | String = null,
    id: String = null,
    label: String = null,
    registerAccelerator: js.UndefOr[Boolean] = js.undefined,
    role: undo | redo | cut | copy | paste | pasteandmatchstyle | delete | selectall | reload | forcereload | toggledevtools | resetzoom | zoomin | zoomout | togglefullscreen | window | minimize | close | help | about | services | hide | hideothers | unhide | quit | startspeaking | stopspeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | windowMenu = null,
    sublabel: String = null,
    submenu: js.Array[MenuItemConstructorOptions] | Menu = null,
    `type`: normal | separator | submenu | checkbox | radio = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MenuItemConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (accelerator != null) __obj.updateDynamic("accelerator")(accelerator)
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterGroupContaining != null) __obj.updateDynamic("afterGroupContaining")(afterGroupContaining)
    if (before != null) __obj.updateDynamic("before")(before)
    if (beforeGroupContaining != null) __obj.updateDynamic("beforeGroupContaining")(beforeGroupContaining)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction3(click))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(registerAccelerator)) __obj.updateDynamic("registerAccelerator")(registerAccelerator)
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sublabel != null) __obj.updateDynamic("sublabel")(sublabel)
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MenuItemConstructorOptions]
  }
}

