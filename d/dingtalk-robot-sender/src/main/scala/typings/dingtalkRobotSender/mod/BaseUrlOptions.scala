package typings.dingtalkRobotSender.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseUrlOptions extends js.Object {
  
  var accessToken: String = js.native
  
  var baseUrl: String = js.native
  
  var httpclient: js.UndefOr[js.Any] = js.native
}
object BaseUrlOptions {
  
  @scala.inline
  def apply(accessToken: String, baseUrl: String): BaseUrlOptions = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrlOptions]
  }
  
  @scala.inline
  implicit class BaseUrlOptionsOps[Self <: BaseUrlOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpclient(value: js.Any): Self = this.set("httpclient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpclient: Self = this.set("httpclient", js.undefined)
  }
}
