package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends js.Object {
  /** Whether the tab is active in its window. (Does not necessarily mean the window is focused.) */
  var active: Boolean
  /** Whether the tab is drawing attention. */
  var attention: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the tab has produced sound over the past couple of seconds (but it might not be heard if also
    * muted). Equivalent to whether the speaker audio indicator is showing.
    */
  var audible: js.UndefOr[Boolean] = js.undefined
  /** The CookieStoreId used for the tab. */
  var cookieStoreId: js.UndefOr[String] = js.undefined
  /** True while the tab is not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.undefined
  /**
    * The URL of the tab's favicon. This property is only present if the extension's manifest includes the
    * `"tabs"` permission. It may also be an empty string if the tab is loading.
    */
  var favIconUrl: js.UndefOr[String] = js.undefined
  /** The height of the tab in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** True if the tab is hidden. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** Whether the tab is highlighted. Works as an alias of active */
  var highlighted: Boolean
  /**
    * The ID of the tab. Tab IDs are unique within a browser session. Under some circumstances a Tab may not be
    * assigned an ID, for example when querying foreign tabs using the `sessions` API, in which case a session ID
    * may be present. Tab ID can also be set to `tabs.TAB_ID_NONE` for apps and devtools windows.
    */
  var id: js.UndefOr[Double] = js.undefined
  /** Whether the tab is in an incognito window. */
  var incognito: Boolean
  /** The zero-based index of the tab within its window. */
  var index: Double
  /** Whether the document in the tab can be rendered in reader mode. */
  var isArticle: js.UndefOr[Boolean] = js.undefined
  /** Whether the document in the tab is being rendered in reader mode. */
  var isInReaderMode: js.UndefOr[Boolean] = js.undefined
  /** The last time the tab was accessed as the number of milliseconds since epoch. */
  var lastAccessed: js.UndefOr[Double] = js.undefined
  /** Current tab muted state and the reason for the last state change. */
  var mutedInfo: js.UndefOr[MutedInfo] = js.undefined
  /**
    * The ID of the tab that opened this tab, if any. This property is only present if the opener tab still exists.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  /** Whether the tab is pinned. */
  var pinned: Boolean
  /**
    * Whether the tab is selected.
    * @deprecated Please use `tabs.Tab.highlighted`.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** The session ID used to uniquely identify a Tab obtained from the `sessions` API. */
  var sessionId: js.UndefOr[String] = js.undefined
  /** Current tab sharing state for screen, microphone and camera. */
  var sharingState: js.UndefOr[SharingState] = js.undefined
  /** Either _loading_ or _complete_. */
  var status: js.UndefOr[String] = js.undefined
  /** The ID of this tab's successor, if any; `tabs.TAB_ID_NONE` otherwise. */
  var successorTabId: js.UndefOr[Double] = js.undefined
  /**
    * The title of the tab. This property is only present if the extension's manifest includes the `"tabs"`
    * permission.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The URL the tab is displaying. This property is only present if the extension's manifest includes the
    * `"tabs"` permission.
    */
  var url: js.UndefOr[String] = js.undefined
  /** The width of the tab in pixels. */
  var width: js.UndefOr[Double] = js.undefined
  /** The ID of the window the tab is contained within. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object Tab {
  @scala.inline
  def apply(
    active: Boolean,
    highlighted: Boolean,
    incognito: Boolean,
    index: Double,
    pinned: Boolean,
    attention: js.UndefOr[Boolean] = js.undefined,
    audible: js.UndefOr[Boolean] = js.undefined,
    cookieStoreId: String = null,
    discarded: js.UndefOr[Boolean] = js.undefined,
    favIconUrl: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Double] = js.undefined,
    isArticle: js.UndefOr[Boolean] = js.undefined,
    isInReaderMode: js.UndefOr[Boolean] = js.undefined,
    lastAccessed: js.UndefOr[Double] = js.undefined,
    mutedInfo: MutedInfo = null,
    openerTabId: js.UndefOr[Double] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    sessionId: String = null,
    sharingState: SharingState = null,
    status: String = null,
    successorTabId: js.UndefOr[Double] = js.undefined,
    title: String = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined,
    windowId: js.UndefOr[Double] = js.undefined
  ): Tab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any])
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention.get.asInstanceOf[js.Any])
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible.get.asInstanceOf[js.Any])
    if (cookieStoreId != null) __obj.updateDynamic("cookieStoreId")(cookieStoreId.asInstanceOf[js.Any])
    if (!js.isUndefined(discarded)) __obj.updateDynamic("discarded")(discarded.get.asInstanceOf[js.Any])
    if (favIconUrl != null) __obj.updateDynamic("favIconUrl")(favIconUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isArticle)) __obj.updateDynamic("isArticle")(isArticle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInReaderMode)) __obj.updateDynamic("isInReaderMode")(isInReaderMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastAccessed)) __obj.updateDynamic("lastAccessed")(lastAccessed.get.asInstanceOf[js.Any])
    if (mutedInfo != null) __obj.updateDynamic("mutedInfo")(mutedInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(openerTabId)) __obj.updateDynamic("openerTabId")(openerTabId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (sharingState != null) __obj.updateDynamic("sharingState")(sharingState.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(successorTabId)) __obj.updateDynamic("successorTabId")(successorTabId.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
}

