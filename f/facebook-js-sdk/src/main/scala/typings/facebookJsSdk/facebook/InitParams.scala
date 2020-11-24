package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitParams extends js.Object {
  
  var appId: js.UndefOr[String] = js.native
  
  var autoLogAppEvents: js.UndefOr[Boolean] = js.native
  
  var cookie: js.UndefOr[Boolean] = js.native
  
  var frictionlessRequests: js.UndefOr[Boolean] = js.native
  
  var hideFlashCallback: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[Boolean] = js.native
  
  var version: String = js.native
  
  var xfbml: js.UndefOr[Boolean] = js.native
}
object InitParams {
  
  @scala.inline
  def apply(version: String): InitParams = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParams]
  }
  
  @scala.inline
  implicit class InitParamsOps[Self <: InitParams] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAutoLogAppEvents(value: Boolean): Self = this.set("autoLogAppEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLogAppEvents: Self = this.set("autoLogAppEvents", js.undefined)
    
    @scala.inline
    def setCookie(value: Boolean): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setFrictionlessRequests(value: Boolean): Self = this.set("frictionlessRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrictionlessRequests: Self = this.set("frictionlessRequests", js.undefined)
    
    @scala.inline
    def setHideFlashCallback(value: Boolean): Self = this.set("hideFlashCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFlashCallback: Self = this.set("hideFlashCallback", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setXfbml(value: Boolean): Self = this.set("xfbml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXfbml: Self = this.set("xfbml", js.undefined)
  }
}
