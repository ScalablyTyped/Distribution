package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.User
import typings.evernote.mod.UserStore.PublicUserInfo
import typings.evernote.mod.UserStore.UserUrls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationToken extends js.Object {
  
  var authenticationToken: js.UndefOr[String] = js.native
  
  var currentTime: js.UndefOr[Timestamp] = js.native
  
  var expiration: js.UndefOr[Timestamp] = js.native
  
  var noteStoreUrl: js.UndefOr[String] = js.native
  
  var publicUserInfo: js.UndefOr[PublicUserInfo] = js.native
  
  var secondFactorDeliveryHint: js.UndefOr[String] = js.native
  
  var secondFactorRequired: js.UndefOr[Boolean] = js.native
  
  var urls: js.UndefOr[UserUrls] = js.native
  
  var user: js.UndefOr[User] = js.native
  
  var webApiUrlPrefix: js.UndefOr[String] = js.native
}
object AuthenticationToken {
  
  @scala.inline
  def apply(): AuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationToken]
  }
  
  @scala.inline
  implicit class AuthenticationTokenOps[Self <: AuthenticationToken] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationToken(value: String): Self = this.set("authenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("authenticationToken", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: Timestamp): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    
    @scala.inline
    def setExpiration(value: Timestamp): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setNoteStoreUrl(value: String): Self = this.set("noteStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteStoreUrl: Self = this.set("noteStoreUrl", js.undefined)
    
    @scala.inline
    def setPublicUserInfo(value: PublicUserInfo): Self = this.set("publicUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicUserInfo: Self = this.set("publicUserInfo", js.undefined)
    
    @scala.inline
    def setSecondFactorDeliveryHint(value: String): Self = this.set("secondFactorDeliveryHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondFactorDeliveryHint: Self = this.set("secondFactorDeliveryHint", js.undefined)
    
    @scala.inline
    def setSecondFactorRequired(value: Boolean): Self = this.set("secondFactorRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondFactorRequired: Self = this.set("secondFactorRequired", js.undefined)
    
    @scala.inline
    def setUrls(value: UserUrls): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setWebApiUrlPrefix(value: String): Self = this.set("webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebApiUrlPrefix: Self = this.set("webApiUrlPrefix", js.undefined)
  }
}
