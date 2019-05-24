package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemConstructorOptions extends js.Object {
  var accelerator: js.UndefOr[Accelerator] = js.undefined
  /**
    * Inserts this item after the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu.
    */
  var after: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group after the containing group of the item with the specified
    * label.
    */
  var afterGroupContaining: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Inserts this item before the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu. Also
    * implies that the menu item in question should be placed in the same “group” as
    * the item.
    */
  var before: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group before the containing group of the item with the specified
    * label.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Should only be specified for checkbox or radio type menu items.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will be called with click(menuItem, browserWindow, event) when the menu item is
    * clicked.
    */
  var click: js.UndefOr[
    js.Function3[
      /* menuItem */ MenuItem, 
      /* browserWindow */ BrowserWindow, 
      /* event */ Event, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * If false, the menu item will be greyed out and unclickable.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[NativeImage | java.lang.String] = js.undefined
  /**
    * Unique within a single menu. If defined then it can be used as a reference to
    * this item by the position attribute.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If false, the accelerator won't be registered with the system, but it will still
    * be displayed. Defaults to true.
    */
  var registerAccelerator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Can be undo, redo, cut, copy, paste, pasteandmatchstyle, delete, selectall,
    * reload, forcereload, toggledevtools, resetzoom, zoomin, zoomout,
    * togglefullscreen, window, minimize, close, help, about, services, hide,
    * hideothers, unhide, quit, startspeaking, stopspeaking, close, minimize, zoom or
    * front Define the action of the menu item, when specified the click property will
    * be ignored. See .
    */
  var role: js.UndefOr[
    electronLib.electronLibStrings.undo | electronLib.electronLibStrings.redo | electronLib.electronLibStrings.cut | electronLib.electronLibStrings.copy | electronLib.electronLibStrings.paste | electronLib.electronLibStrings.pasteandmatchstyle | electronLib.electronLibStrings.delete | electronLib.electronLibStrings.selectall | electronLib.electronLibStrings.reload | electronLib.electronLibStrings.forcereload | electronLib.electronLibStrings.toggledevtools | electronLib.electronLibStrings.resetzoom | electronLib.electronLibStrings.zoomin | electronLib.electronLibStrings.zoomout | electronLib.electronLibStrings.togglefullscreen | electronLib.electronLibStrings.window | electronLib.electronLibStrings.minimize | electronLib.electronLibStrings.close | electronLib.electronLibStrings.help | electronLib.electronLibStrings.about | electronLib.electronLibStrings.services | electronLib.electronLibStrings.hide | electronLib.electronLibStrings.hideothers | electronLib.electronLibStrings.unhide | electronLib.electronLibStrings.quit | electronLib.electronLibStrings.startspeaking | electronLib.electronLibStrings.stopspeaking | electronLib.electronLibStrings.zoom | electronLib.electronLibStrings.front
  ] = js.undefined
  var sublabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Should be specified for submenu type menu items. If submenu is specified, the
    * type: 'submenu' can be omitted. If the value is not a then it will be
    * automatically converted to one using Menu.buildFromTemplate.
    */
  var submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.undefined
  /**
    * Can be normal, separator, submenu, checkbox or radio.
    */
  var `type`: js.UndefOr[
    electronLib.electronLibStrings.normal | electronLib.electronLibStrings.separator | electronLib.electronLibStrings.submenu | electronLib.electronLibStrings.checkbox | electronLib.electronLibStrings.radio
  ] = js.undefined
  /**
    * If false, the menu item will be entirely hidden.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object MenuItemConstructorOptions {
  @scala.inline
  def apply(
    accelerator: Accelerator = null,
    after: js.Array[java.lang.String] = null,
    afterGroupContaining: js.Array[java.lang.String] = null,
    before: js.Array[java.lang.String] = null,
    beforeGroupContaining: js.Array[java.lang.String] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    click: (/* menuItem */ MenuItem, /* browserWindow */ BrowserWindow, /* event */ Event) => scala.Unit = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: NativeImage | java.lang.String = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    registerAccelerator: js.UndefOr[scala.Boolean] = js.undefined,
    role: electronLib.electronLibStrings.undo | electronLib.electronLibStrings.redo | electronLib.electronLibStrings.cut | electronLib.electronLibStrings.copy | electronLib.electronLibStrings.paste | electronLib.electronLibStrings.pasteandmatchstyle | electronLib.electronLibStrings.delete | electronLib.electronLibStrings.selectall | electronLib.electronLibStrings.reload | electronLib.electronLibStrings.forcereload | electronLib.electronLibStrings.toggledevtools | electronLib.electronLibStrings.resetzoom | electronLib.electronLibStrings.zoomin | electronLib.electronLibStrings.zoomout | electronLib.electronLibStrings.togglefullscreen | electronLib.electronLibStrings.window | electronLib.electronLibStrings.minimize | electronLib.electronLibStrings.close | electronLib.electronLibStrings.help | electronLib.electronLibStrings.about | electronLib.electronLibStrings.services | electronLib.electronLibStrings.hide | electronLib.electronLibStrings.hideothers | electronLib.electronLibStrings.unhide | electronLib.electronLibStrings.quit | electronLib.electronLibStrings.startspeaking | electronLib.electronLibStrings.stopspeaking | electronLib.electronLibStrings.zoom | electronLib.electronLibStrings.front = null,
    sublabel: java.lang.String = null,
    submenu: js.Array[MenuItemConstructorOptions] | Menu = null,
    `type`: electronLib.electronLibStrings.normal | electronLib.electronLibStrings.separator | electronLib.electronLibStrings.submenu | electronLib.electronLibStrings.checkbox | electronLib.electronLibStrings.radio = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
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

