package typings.fastifyJwt.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationTokenExpiredMessage extends js.Object {
  
  var authorizationTokenExpiredMessage: js.UndefOr[String] = js.native
  
  var authorizationTokenInvalid: js.UndefOr[(js.Function1[/* err */ Error, String]) | String] = js.native
  
  var authorizationTokenUntrusted: js.UndefOr[String] = js.native
  
  var badRequestErrorMessage: js.UndefOr[String] = js.native
  
  var noAuthorizationInHeaderMessage: js.UndefOr[String] = js.native
}
object AuthorizationTokenExpiredMessage {
  
  @scala.inline
  def apply(): AuthorizationTokenExpiredMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationTokenExpiredMessage]
  }
  
  @scala.inline
  implicit class AuthorizationTokenExpiredMessageOps[Self <: AuthorizationTokenExpiredMessage] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationTokenExpiredMessage(value: String): Self = this.set("authorizationTokenExpiredMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationTokenExpiredMessage: Self = this.set("authorizationTokenExpiredMessage", js.undefined)
    
    @scala.inline
    def setAuthorizationTokenInvalidFunction1(value: /* err */ Error => String): Self = this.set("authorizationTokenInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAuthorizationTokenInvalid(value: (js.Function1[/* err */ Error, String]) | String): Self = this.set("authorizationTokenInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationTokenInvalid: Self = this.set("authorizationTokenInvalid", js.undefined)
    
    @scala.inline
    def setAuthorizationTokenUntrusted(value: String): Self = this.set("authorizationTokenUntrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationTokenUntrusted: Self = this.set("authorizationTokenUntrusted", js.undefined)
    
    @scala.inline
    def setBadRequestErrorMessage(value: String): Self = this.set("badRequestErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadRequestErrorMessage: Self = this.set("badRequestErrorMessage", js.undefined)
    
    @scala.inline
    def setNoAuthorizationInHeaderMessage(value: String): Self = this.set("noAuthorizationInHeaderMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAuthorizationInHeaderMessage: Self = this.set("noAuthorizationInHeaderMessage", js.undefined)
  }
}
