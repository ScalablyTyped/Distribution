package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.User
import typings.evernote.mod.UserStore.PublicUserInfo
import typings.evernote.mod.UserStore.UserUrls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationToken extends StObject {
  
  var authenticationToken: js.UndefOr[String] = js.undefined
  
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  
  var expiration: js.UndefOr[Timestamp] = js.undefined
  
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  
  var publicUserInfo: js.UndefOr[PublicUserInfo] = js.undefined
  
  var secondFactorDeliveryHint: js.UndefOr[String] = js.undefined
  
  var secondFactorRequired: js.UndefOr[Boolean] = js.undefined
  
  var urls: js.UndefOr[UserUrls] = js.undefined
  
  var user: js.UndefOr[User] = js.undefined
  
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}
object AuthenticationToken {
  
  inline def apply(): AuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationToken]
  }
  
  extension [Self <: AuthenticationToken](x: Self) {
    
    inline def setAuthenticationToken(value: String): Self = StObject.set(x, "authenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "authenticationToken", js.undefined)
    
    inline def setCurrentTime(value: Timestamp): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    inline def setExpiration(value: Timestamp): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setNoteStoreUrl(value: String): Self = StObject.set(x, "noteStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setNoteStoreUrlUndefined: Self = StObject.set(x, "noteStoreUrl", js.undefined)
    
    inline def setPublicUserInfo(value: PublicUserInfo): Self = StObject.set(x, "publicUserInfo", value.asInstanceOf[js.Any])
    
    inline def setPublicUserInfoUndefined: Self = StObject.set(x, "publicUserInfo", js.undefined)
    
    inline def setSecondFactorDeliveryHint(value: String): Self = StObject.set(x, "secondFactorDeliveryHint", value.asInstanceOf[js.Any])
    
    inline def setSecondFactorDeliveryHintUndefined: Self = StObject.set(x, "secondFactorDeliveryHint", js.undefined)
    
    inline def setSecondFactorRequired(value: Boolean): Self = StObject.set(x, "secondFactorRequired", value.asInstanceOf[js.Any])
    
    inline def setSecondFactorRequiredUndefined: Self = StObject.set(x, "secondFactorRequired", js.undefined)
    
    inline def setUrls(value: UserUrls): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWebApiUrlPrefix(value: String): Self = StObject.set(x, "webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    inline def setWebApiUrlPrefixUndefined: Self = StObject.set(x, "webApiUrlPrefix", js.undefined)
  }
}
