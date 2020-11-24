package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnAttachedAttachInfo extends js.Object {
  
  var newPosition: Double = js.native
  
  var newWindowId: Double = js.native
}
object OnAttachedAttachInfo {
  
  @scala.inline
  def apply(newPosition: Double, newWindowId: Double): OnAttachedAttachInfo = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], newWindowId = newWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAttachedAttachInfo]
  }
  
  @scala.inline
  implicit class OnAttachedAttachInfoOps[Self <: OnAttachedAttachInfo] (val x: Self) extends AnyVal {
    
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
    def setNewPosition(value: Double): Self = this.set("newPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWindowId(value: Double): Self = this.set("newWindowId", value.asInstanceOf[js.Any])
  }
}
