package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DiscardedCurrentWindow extends js.Object {
  /** Whether the tabs are active in their windows. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the tabs are drawing attention. */
  var attention: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the tabs are audible. */
  var audible: js.UndefOr[scala.Boolean] = js.undefined
  /** True if the tab is using the camera. */
  var camera: js.UndefOr[scala.Boolean] = js.undefined
  /** The CookieStoreId used for the tab. */
  var cookieStoreId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the tabs are in the current window. */
  var currentWindow: js.UndefOr[scala.Boolean] = js.undefined
  /** True while the tabs are not loaded with content. */
  var discarded: js.UndefOr[scala.Boolean] = js.undefined
  /** True while the tabs are hidden. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the tabs are highlighted. Works as an alias of active. */
  var highlighted: js.UndefOr[scala.Boolean] = js.undefined
  /** The position of the tabs within their windows. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Whether the tabs are in the last focused window. */
  var lastFocusedWindow: js.UndefOr[scala.Boolean] = js.undefined
  /** True if the tab is using the microphone. */
  var microphone: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the tabs are muted. */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
           */
  var openerTabId: js.UndefOr[scala.Double] = js.undefined
  /** Whether the tabs are pinned. */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /** True for any screen sharing, or a string to specify type of screen sharing. */
  var screen: js.UndefOr[scala.Boolean | firefoxDashWebextDashBrowserLib.browserNs.tabsNs._QueryScreen] = js.undefined
  /** Whether the tabs have completed loading. */
  var status: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.tabsNs.TabStatus] = js.undefined
  /** Match page titles against a pattern. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** The ID of the parent window, or `windows.WINDOW_ID_CURRENT` for the current window. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
  /** The type of window the tabs are in. */
  var windowType: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.tabsNs.WindowType] = js.undefined
}

