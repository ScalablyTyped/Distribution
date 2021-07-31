package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a user's info from a third-party identity provider
  * such as Google or Facebook.
  */
trait UserInfo extends StObject {
  
  /**
    * The display name for the linked provider.
    */
  var displayName: String
  
  /**
    * The email for the linked provider.
    */
  var email: String
  
  /**
    * The phone number for the linked provider.
    */
  var phoneNumber: String
  
  /**
    * The photo URL for the linked provider.
    */
  var photoURL: String
  
  /**
    * The linked provider ID (for example, "google.com" for the Google provider).
    */
  var providerId: String
  
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
  
  /**
    * The user identifier for the linked provider.
    */
  var uid: String
}
object UserInfo {
  
  @scala.inline
  def apply(
    displayName: String,
    email: String,
    phoneNumber: String,
    photoURL: String,
    providerId: String,
    toJSON: () => js.Object,
    uid: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], photoURL = photoURL.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  
  @scala.inline
  implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
