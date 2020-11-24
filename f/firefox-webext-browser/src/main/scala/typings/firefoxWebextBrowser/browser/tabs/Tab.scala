package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tab extends js.Object {
  
  /** Whether the tab is active in its window. (Does not necessarily mean the window is focused.) */
  var active: Boolean = js.native
  
  /** Whether the tab is drawing attention. */
  var attention: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the tab has produced sound over the past couple of seconds (but it might not be heard if also muted). Equivalent to whether the speaker audio indicator is showing.
    */
  var audible: js.UndefOr[Boolean] = js.native
  
  /** The CookieStoreId used for the tab. */
  var cookieStoreId: js.UndefOr[String] = js.native
  
  /** True while the tab is not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.native
  
  /**
    * The URL of the tab's favicon. This property is only present if the extension's manifest includes the `"tabs"` permission. It may also be an empty string if the tab is loading.
    */
  var favIconUrl: js.UndefOr[String] = js.native
  
  /** The height of the tab in pixels. */
  var height: js.UndefOr[Double] = js.native
  
  /** True if the tab is hidden. */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** Whether the tab is highlighted. Works as an alias of active */
  var highlighted: Boolean = js.native
  
  /**
    * The ID of the tab. Tab IDs are unique within a browser session. Under some circumstances a Tab may not be assigned an ID, for example when querying foreign tabs using the `sessions` API, in which case a session ID may be present. Tab ID can also be set to `tabs.TAB_ID_NONE` for apps and devtools windows.
    */
  var id: js.UndefOr[Double] = js.native
  
  /** Whether the tab is in an incognito window. */
  var incognito: Boolean = js.native
  
  /** The zero-based index of the tab within its window. */
  var index: Double = js.native
  
  /** Whether the document in the tab can be rendered in reader mode. */
  var isArticle: js.UndefOr[Boolean] = js.native
  
  /** Whether the document in the tab is being rendered in reader mode. */
  var isInReaderMode: js.UndefOr[Boolean] = js.native
  
  /** The last time the tab was accessed as the number of milliseconds since epoch. */
  var lastAccessed: js.UndefOr[Double] = js.native
  
  /** Current tab muted state and the reason for the last state change. */
  var mutedInfo: js.UndefOr[MutedInfo] = js.native
  
  /**
    * The ID of the tab that opened this tab, if any. This property is only present if the opener tab still exists.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  
  /** Whether the tab is pinned. */
  var pinned: Boolean = js.native
  
  /**
    * Whether the tab is selected.
    * @deprecated Please use `tabs.Tab.highlighted`.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /** The session ID used to uniquely identify a Tab obtained from the `sessions` API. */
  var sessionId: js.UndefOr[String] = js.native
  
  /** Current tab sharing state for screen, microphone and camera. */
  var sharingState: js.UndefOr[SharingState] = js.native
  
  /** Either _loading_ or _complete_. */
  var status: js.UndefOr[String] = js.native
  
  /** The ID of this tab's successor, if any; `tabs.TAB_ID_NONE` otherwise. */
  var successorTabId: js.UndefOr[Double] = js.native
  
  /**
    * The title of the tab. This property is only present if the extension's manifest includes the `"tabs"` permission.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The URL the tab is displaying. This property is only present if the extension's manifest includes the `"tabs"` permission.
    */
  var url: js.UndefOr[String] = js.native
  
  /** The width of the tab in pixels. */
  var width: js.UndefOr[Double] = js.native
  
  /** The ID of the window the tab is contained within. */
  var windowId: js.UndefOr[Double] = js.native
}
object Tab {
  
  @scala.inline
  def apply(active: Boolean, highlighted: Boolean, incognito: Boolean, index: Double, pinned: Boolean): Tab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttention(value: Boolean): Self = this.set("attention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttention: Self = this.set("attention", js.undefined)
    
    @scala.inline
    def setAudible(value: Boolean): Self = this.set("audible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudible: Self = this.set("audible", js.undefined)
    
    @scala.inline
    def setCookieStoreId(value: String): Self = this.set("cookieStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieStoreId: Self = this.set("cookieStoreId", js.undefined)
    
    @scala.inline
    def setDiscarded(value: Boolean): Self = this.set("discarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscarded: Self = this.set("discarded", js.undefined)
    
    @scala.inline
    def setFavIconUrl(value: String): Self = this.set("favIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavIconUrl: Self = this.set("favIconUrl", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsArticle(value: Boolean): Self = this.set("isArticle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArticle: Self = this.set("isArticle", js.undefined)
    
    @scala.inline
    def setIsInReaderMode(value: Boolean): Self = this.set("isInReaderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInReaderMode: Self = this.set("isInReaderMode", js.undefined)
    
    @scala.inline
    def setLastAccessed(value: Double): Self = this.set("lastAccessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessed: Self = this.set("lastAccessed", js.undefined)
    
    @scala.inline
    def setMutedInfo(value: MutedInfo): Self = this.set("mutedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutedInfo: Self = this.set("mutedInfo", js.undefined)
    
    @scala.inline
    def setOpenerTabId(value: Double): Self = this.set("openerTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenerTabId: Self = this.set("openerTabId", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    
    @scala.inline
    def setSharingState(value: SharingState): Self = this.set("sharingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingState: Self = this.set("sharingState", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSuccessorTabId(value: Double): Self = this.set("successorTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessorTabId: Self = this.set("successorTabId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
}
