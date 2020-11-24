package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDetachedDetachInfo extends js.Object {
  
  var oldPosition: Double = js.native
  
  var oldWindowId: Double = js.native
}
object OnDetachedDetachInfo {
  
  @scala.inline
  def apply(oldPosition: Double, oldWindowId: Double): OnDetachedDetachInfo = {
    val __obj = js.Dynamic.literal(oldPosition = oldPosition.asInstanceOf[js.Any], oldWindowId = oldWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDetachedDetachInfo]
  }
  
  @scala.inline
  implicit class OnDetachedDetachInfoOps[Self <: OnDetachedDetachInfo] (val x: Self) extends AnyVal {
    
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
    def setOldPosition(value: Double): Self = this.set("oldPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldWindowId(value: Double): Self = this.set("oldWindowId", value.asInstanceOf[js.Any])
  }
}
