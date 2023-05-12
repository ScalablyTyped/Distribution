package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUpdateProperties extends StObject {
  
  /**
    * Whether the tab should be active. Does not affect whether the window is focused (see `windows.update`).
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Adds or removes the tab from the current selection. */
  var highlighted: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the load should replace the current history entry for the tab. */
  var loadReplace: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the tab should be muted. */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  
  /** Whether the tab should be pinned. */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of this tab's successor. If specified, the successor tab must be in the same window as this tab.
    */
  var successorTabId: js.UndefOr[Double] = js.undefined
  
  /** A URL to navigate the tab to. */
  var url: js.UndefOr[String] = js.undefined
}
object UpdateUpdateProperties {
  
  inline def apply(): UpdateUpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUpdateProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUpdateProperties] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    inline def setLoadReplace(value: Boolean): Self = StObject.set(x, "loadReplace", value.asInstanceOf[js.Any])
    
    inline def setLoadReplaceUndefined: Self = StObject.set(x, "loadReplace", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setOpenerTabId(value: Double): Self = StObject.set(x, "openerTabId", value.asInstanceOf[js.Any])
    
    inline def setOpenerTabIdUndefined: Self = StObject.set(x, "openerTabId", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setSuccessorTabId(value: Double): Self = StObject.set(x, "successorTabId", value.asInstanceOf[js.Any])
    
    inline def setSuccessorTabIdUndefined: Self = StObject.set(x, "successorTabId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
