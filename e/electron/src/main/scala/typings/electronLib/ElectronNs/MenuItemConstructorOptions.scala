package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MenuItemConstructorOptions extends js.Object {
  var accelerator: js.UndefOr[Accelerator] = js.undefined
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
       * This field allows fine-grained definition of the specific location within a
       * given menu.
       */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Define the action of the menu item, when specified the click property will be
       * ignored. See .
       */
  var role: js.UndefOr[java.lang.String] = js.undefined
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

