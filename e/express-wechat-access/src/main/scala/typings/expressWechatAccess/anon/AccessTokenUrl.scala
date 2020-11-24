package typings.expressWechatAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessTokenUrl extends js.Object {
  
  var accessTokenUrl: js.UndefOr[String] = js.native
  
  var appId: String = js.native
  
  var appSecret: String = js.native
  
  var https: js.UndefOr[Boolean] = js.native
  
  var ticketUrl: js.UndefOr[String] = js.native
}
object AccessTokenUrl {
  
  @scala.inline
  def apply(appId: String, appSecret: String): AccessTokenUrl = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appSecret = appSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenUrl]
  }
  
  @scala.inline
  implicit class AccessTokenUrlOps[Self <: AccessTokenUrl] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppSecret(value: String): Self = this.set("appSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUrl(value: String): Self = this.set("accessTokenUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessTokenUrl: Self = this.set("accessTokenUrl", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setTicketUrl(value: String): Self = this.set("ticketUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicketUrl: Self = this.set("ticketUrl", js.undefined)
  }
}
