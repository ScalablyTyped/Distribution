package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIUserInfo extends StObject {
  
  var createdAt: js.UndefOr[Double] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  
  var lastLoginAt: js.UndefOr[Double] = js.undefined
  
  var localId: js.UndefOr[String] = js.undefined
  
  var mfaInfo: js.UndefOr[js.Array[MfaEnrollment]] = js.undefined
  
  var passwordHash: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var photoUrl: js.UndefOr[String] = js.undefined
  
  var providerUserInfo: js.UndefOr[js.Array[ProviderUserInfo]] = js.undefined
  
  var tenantId: js.UndefOr[String] = js.undefined
}
object APIUserInfo {
  
  inline def apply(): APIUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIUserInfo]
  }
  
  extension [Self <: APIUserInfo](x: Self) {
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    inline def setLastLoginAt(value: Double): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
    
    inline def setLastLoginAtUndefined: Self = StObject.set(x, "lastLoginAt", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setMfaInfo(value: js.Array[MfaEnrollment]): Self = StObject.set(x, "mfaInfo", value.asInstanceOf[js.Any])
    
    inline def setMfaInfoUndefined: Self = StObject.set(x, "mfaInfo", js.undefined)
    
    inline def setMfaInfoVarargs(value: MfaEnrollment*): Self = StObject.set(x, "mfaInfo", js.Array(value*))
    
    inline def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
    
    inline def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setProviderUserInfo(value: js.Array[ProviderUserInfo]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
    
    inline def setProviderUserInfoUndefined: Self = StObject.set(x, "providerUserInfo", js.undefined)
    
    inline def setProviderUserInfoVarargs(value: ProviderUserInfo*): Self = StObject.set(x, "providerUserInfo", js.Array(value*))
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
