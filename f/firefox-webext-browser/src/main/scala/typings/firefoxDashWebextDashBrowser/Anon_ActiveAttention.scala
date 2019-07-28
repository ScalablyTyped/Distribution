package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.tabsNs.TabStatus
import typings.firefoxDashWebextDashBrowser.browserNs.tabsNs.WindowType
import typings.firefoxDashWebextDashBrowser.browserNs.tabsNs._QueryScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveAttention extends js.Object {
  /** Whether the tabs are active in their windows. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Whether the tabs are drawing attention. */
  var attention: js.UndefOr[Boolean] = js.undefined
  /** Whether the tabs are audible. */
  var audible: js.UndefOr[Boolean] = js.undefined
  /** True if the tab is using the camera. */
  var camera: js.UndefOr[Boolean] = js.undefined
  /** The CookieStoreId used for the tab. */
  var cookieStoreId: js.UndefOr[String] = js.undefined
  /** Whether the tabs are in the current window. */
  var currentWindow: js.UndefOr[Boolean] = js.undefined
  /** True while the tabs are not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.undefined
  /** True while the tabs are hidden. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** Whether the tabs are highlighted. Works as an alias of active. */
  var highlighted: js.UndefOr[Boolean] = js.undefined
  /** The position of the tabs within their windows. */
  var index: js.UndefOr[Double] = js.undefined
  /** Whether the tabs are in the last focused window. */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.undefined
  /** True if the tab is using the microphone. */
  var microphone: js.UndefOr[Boolean] = js.undefined
  /** Whether the tabs are muted. */
  var muted: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  /** Whether the tabs are pinned. */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /** True for any screen sharing, or a string to specify type of screen sharing. */
  var screen: js.UndefOr[Boolean | _QueryScreen] = js.undefined
  /** Whether the tabs have completed loading. */
  var status: js.UndefOr[TabStatus] = js.undefined
  /** Match page titles against a pattern. */
  var title: js.UndefOr[String] = js.undefined
  /** Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[String | js.Array[String]] = js.undefined
  /** The ID of the parent window, or `windows.WINDOW_ID_CURRENT` for the current window. */
  var windowId: js.UndefOr[Double] = js.undefined
  /** The type of window the tabs are in. */
  var windowType: js.UndefOr[WindowType] = js.undefined
}

object Anon_ActiveAttention {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    attention: js.UndefOr[Boolean] = js.undefined,
    audible: js.UndefOr[Boolean] = js.undefined,
    camera: js.UndefOr[Boolean] = js.undefined,
    cookieStoreId: String = null,
    currentWindow: js.UndefOr[Boolean] = js.undefined,
    discarded: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    highlighted: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    lastFocusedWindow: js.UndefOr[Boolean] = js.undefined,
    microphone: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    openerTabId: Int | Double = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    screen: Boolean | _QueryScreen = null,
    status: TabStatus = null,
    title: String = null,
    url: String | js.Array[String] = null,
    windowId: Int | Double = null,
    windowType: WindowType = null
  ): Anon_ActiveAttention = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention)
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible)
    if (!js.isUndefined(camera)) __obj.updateDynamic("camera")(camera)
    if (cookieStoreId != null) __obj.updateDynamic("cookieStoreId")(cookieStoreId)
    if (!js.isUndefined(currentWindow)) __obj.updateDynamic("currentWindow")(currentWindow)
    if (!js.isUndefined(discarded)) __obj.updateDynamic("discarded")(discarded)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(highlighted)) __obj.updateDynamic("highlighted")(highlighted)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lastFocusedWindow)) __obj.updateDynamic("lastFocusedWindow")(lastFocusedWindow)
    if (!js.isUndefined(microphone)) __obj.updateDynamic("microphone")(microphone)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (openerTabId != null) __obj.updateDynamic("openerTabId")(openerTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    if (windowType != null) __obj.updateDynamic("windowType")(windowType)
    __obj.asInstanceOf[Anon_ActiveAttention]
  }
}

