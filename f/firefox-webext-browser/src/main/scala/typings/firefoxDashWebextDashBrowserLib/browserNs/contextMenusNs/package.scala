package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenusNs {
  /* contextMenus types */
  /**
       * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of all other
       * contexts except for 'tab' and 'tools_menu'.
       */
  type ContextType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.all | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.page | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.frame | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.selection | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.link | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.editable | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.password | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.image | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.video | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.audio | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.launcher | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.bookmark | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.browser_action | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.page_action | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.tab
  /** The type of menu item. */
  type ItemType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.normal | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.checkbox | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.radio | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.separator
  type _OnClickDataModifiers = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.Shift | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.Alt | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.Command | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.Ctrl | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.MacCtrl
  /**
       * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and
       * 'tab' are supported. showDefaults cannot be used with this option.
       */
  type _OverrideContextContext = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.bookmark | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.tab
}
