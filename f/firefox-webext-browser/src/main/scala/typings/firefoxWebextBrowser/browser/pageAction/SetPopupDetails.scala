package typings.firefoxWebextBrowser.browser.pageAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPopupDetails extends js.Object {
  
  /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
  var popup: String | Null = js.native
  
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double = js.native
}
object SetPopupDetails {
  
  @scala.inline
  def apply(tabId: Double): SetPopupDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPopupDetails]
  }
  
  @scala.inline
  implicit class SetPopupDetailsOps[Self <: SetPopupDetails] (val x: Self) extends AnyVal {
    
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
    def setPopup(value: String): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupNull: Self = this.set("popup", null)
  }
}
