package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User provider data to include when importing a user.
  */
trait UserProviderRequest extends StObject {
  
  /**
    * The display name for the linked provider.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email for the linked provider.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number for the linked provider.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The photo URL for the linked provider.
    */
  var photoURL: js.UndefOr[String] = js.undefined
  
  /**
    * The linked provider ID (for example, "google.com" for the Google provider).
    */
  var providerId: String
  
  /**
    * The user identifier for the linked provider.
    */
  var uid: String
}
object UserProviderRequest {
  
  inline def apply(providerId: String, uid: String): UserProviderRequest = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProviderRequest]
  }
  
  extension [Self <: UserProviderRequest](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
    
    inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
