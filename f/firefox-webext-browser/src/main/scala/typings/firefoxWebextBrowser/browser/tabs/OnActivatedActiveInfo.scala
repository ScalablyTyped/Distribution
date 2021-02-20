package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnActivatedActiveInfo extends StObject {
  
  /** The ID of the tab that was previously active, if that tab is still open. */
  var previousTabId: js.UndefOr[Double] = js.native
  
  /** The ID of the tab that has become active. */
  var tabId: Double = js.native
  
  /** The ID of the window the active tab changed inside of. */
  var windowId: Double = js.native
}
object OnActivatedActiveInfo {
  
  @scala.inline
  def apply(tabId: Double, windowId: Double): OnActivatedActiveInfo = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnActivatedActiveInfo]
  }
  
  @scala.inline
  implicit class OnActivatedActiveInfoMutableBuilder[Self <: OnActivatedActiveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousTabId(value: Double): Self = StObject.set(x, "previousTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTabIdUndefined: Self = StObject.set(x, "previousTabId", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
