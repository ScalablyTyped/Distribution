package typings.firebase.compatMod.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User profile information, visible only to the Firebase project's
  * apps.
  *
  */
trait UserInfo extends StObject {
  
  var displayName: String | Null
  
  var email: String | Null
  
  var phoneNumber: String | Null
  
  var photoURL: String | Null
  
  var providerId: String
  
  /**
    * The user's unique ID.
    */
  var uid: String
}
object UserInfo {
  
  inline def apply(providerId: String, uid: String): UserInfo = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], displayName = null, email = null, phoneNumber = null, photoURL = null)
    __obj.asInstanceOf[UserInfo]
  }
  
  extension [Self <: UserInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
    
    inline def setPhotoURLNull: Self = StObject.set(x, "photoURL", null)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
