package typings.easySession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionOptions extends js.Object {
  
  var freshTimeout: js.UndefOr[Double] = js.native
  
  var ipCheck: js.UndefOr[Boolean] = js.native
  
  var maxFreshTimeout: js.UndefOr[Double] = js.native
  
  var uaCheck: js.UndefOr[Boolean] = js.native
}
object SessionOptions {
  
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
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
    def setFreshTimeout(value: Double): Self = this.set("freshTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreshTimeout: Self = this.set("freshTimeout", js.undefined)
    
    @scala.inline
    def setIpCheck(value: Boolean): Self = this.set("ipCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpCheck: Self = this.set("ipCheck", js.undefined)
    
    @scala.inline
    def setMaxFreshTimeout(value: Double): Self = this.set("maxFreshTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFreshTimeout: Self = this.set("maxFreshTimeout", js.undefined)
    
    @scala.inline
    def setUaCheck(value: Boolean): Self = this.set("uaCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUaCheck: Self = this.set("uaCheck", js.undefined)
  }
}
