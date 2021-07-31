package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQueryInfo extends StObject {
  
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
  var screen: js.UndefOr[Boolean | QueryQueryInfoScreen] = js.undefined
  
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
object QueryQueryInfo {
  
  @scala.inline
  def apply(): QueryQueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryQueryInfo]
  }
  
  @scala.inline
  implicit class QueryQueryInfoMutableBuilder[Self <: QueryQueryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
    
    @scala.inline
    def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudibleUndefined: Self = StObject.set(x, "audible", js.undefined)
    
    @scala.inline
    def setCamera(value: Boolean): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
    
    @scala.inline
    def setCurrentWindow(value: Boolean): Self = StObject.set(x, "currentWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWindowUndefined: Self = StObject.set(x, "currentWindow", js.undefined)
    
    @scala.inline
    def setDiscarded(value: Boolean): Self = StObject.set(x, "discarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscardedUndefined: Self = StObject.set(x, "discarded", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLastFocusedWindow(value: Boolean): Self = StObject.set(x, "lastFocusedWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFocusedWindowUndefined: Self = StObject.set(x, "lastFocusedWindow", js.undefined)
    
    @scala.inline
    def setMicrophone(value: Boolean): Self = StObject.set(x, "microphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrophoneUndefined: Self = StObject.set(x, "microphone", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setOpenerTabId(value: Double): Self = StObject.set(x, "openerTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenerTabIdUndefined: Self = StObject.set(x, "openerTabId", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setScreen(value: Boolean | QueryQueryInfoScreen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    
    @scala.inline
    def setStatus(value: TabStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    
    @scala.inline
    def setWindowType(value: WindowType): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTypeUndefined: Self = StObject.set(x, "windowType", js.undefined)
  }
}
