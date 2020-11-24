package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnActivatedActiveInfo extends js.Object {
  
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
  implicit class OnActivatedActiveInfoOps[Self <: OnActivatedActiveInfo] (val x: Self) extends AnyVal {
    
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
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTabId(value: Double): Self = this.set("previousTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousTabId: Self = this.set("previousTabId", js.undefined)
  }
}
