package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCreateProperties extends StObject {
  
  /**
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused (see `windows.update`). Defaults to `true`.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** The CookieStoreId for the tab that opened this tab. */
  var cookieStoreId: js.UndefOr[String] = js.undefined
  
  /** Whether the tab is marked as 'discarded' when created. */
  var discarded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The position the tab should take in the window. The provided value will be clamped to between zero and the number of tabs in the window.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /** Whether the tab should be muted when created. */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the document in the tab should be opened in reader mode. */
  var openInReaderMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as the newly created tab.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  
  /** Whether the tab should be pinned. Defaults to `false` */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /** The title used for display if the tab is created in discarded mode. */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to navigate the tab to initially. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /** The window to create the new tab in. Defaults to the current window. */
  var windowId: js.UndefOr[Double] = js.undefined
}
object CreateCreateProperties {
  
  inline def apply(): CreateCreateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCreateProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCreateProperties] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
    
    inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
    
    inline def setDiscarded(value: Boolean): Self = StObject.set(x, "discarded", value.asInstanceOf[js.Any])
    
    inline def setDiscardedUndefined: Self = StObject.set(x, "discarded", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setOpenInReaderMode(value: Boolean): Self = StObject.set(x, "openInReaderMode", value.asInstanceOf[js.Any])
    
    inline def setOpenInReaderModeUndefined: Self = StObject.set(x, "openInReaderMode", js.undefined)
    
    inline def setOpenerTabId(value: Double): Self = StObject.set(x, "openerTabId", value.asInstanceOf[js.Any])
    
    inline def setOpenerTabIdUndefined: Self = StObject.set(x, "openerTabId", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
