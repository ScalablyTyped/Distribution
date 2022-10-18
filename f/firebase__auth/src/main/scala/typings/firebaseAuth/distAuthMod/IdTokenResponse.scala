package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IdToken as returned by the API
  *
  * @internal
  */
trait IdTokenResponse
  extends StObject
     with PhoneOrOauthTokenResponse {
  
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  var expiresIn: js.UndefOr[String] = js.undefined
  
  var idToken: js.UndefOr[IdToken] = js.undefined
  
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  
  var kind: js.UndefOr[IdTokenResponseKind] = js.undefined
  
  var localId: String
  
  var photoUrl: js.UndefOr[String | Null] = js.undefined
  
  var providerId: js.UndefOr[String] = js.undefined
  
  var rawUserInfo: js.UndefOr[String] = js.undefined
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var screenName: js.UndefOr[String | Null] = js.undefined
}
object IdTokenResponse {
  
  inline def apply(localId: String): IdTokenResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenResponse]
  }
  
  extension [Self <: IdTokenResponse](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setIdToken(value: IdToken): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    inline def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    inline def setKind(value: IdTokenResponseKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    inline def setRawUserInfo(value: String): Self = StObject.set(x, "rawUserInfo", value.asInstanceOf[js.Any])
    
    inline def setRawUserInfoUndefined: Self = StObject.set(x, "rawUserInfo", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    
    inline def setScreenNameNull: Self = StObject.set(x, "screenName", null)
    
    inline def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
  }
}
