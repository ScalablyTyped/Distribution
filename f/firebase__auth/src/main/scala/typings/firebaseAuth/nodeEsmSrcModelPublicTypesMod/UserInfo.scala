package typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInfo extends StObject {
  
  /**
    * The display name of the user.
    */
  val displayName: String | Null
  
  /**
    * The email of the user.
    */
  val email: String | Null
  
  /**
    * The phone number normalized based on the E.164 standard (e.g. +16505550101) for the
    * user.
    *
    * @remarks
    * This is null if the user has no phone credential linked to the account.
    */
  val phoneNumber: String | Null
  
  /**
    * The profile photo URL of the user.
    */
  val photoURL: String | Null
  
  /**
    * The provider used to authenticate the user.
    */
  val providerId: String
  
  /**
    * The user's unique ID, scoped to the project.
    */
  val uid: String
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
