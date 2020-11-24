package typings.firefoxWebextBrowser.browser.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsOpenDetails extends js.Object {
  
  /** Specify the window to get the openness from. */
  var windowId: js.UndefOr[Double] = js.native
}
object IsOpenDetails {
  
  @scala.inline
  def apply(): IsOpenDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsOpenDetails]
  }
  
  @scala.inline
  implicit class IsOpenDetailsOps[Self <: IsOpenDetails] (val x: Self) extends AnyVal {
    
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
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
}
