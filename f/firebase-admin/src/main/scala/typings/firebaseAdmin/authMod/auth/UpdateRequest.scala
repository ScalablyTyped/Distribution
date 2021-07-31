package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the properties to update on the provided user.
  */
trait UpdateRequest extends StObject {
  
  /**
    * Whether or not the user is disabled: `true` for disabled;
    * `false` for enabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user's display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's primary email.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not the user's primary email is verified.
    */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user's updated multi-factor related properties.
    */
  var multiFactor: js.UndefOr[MultiFactorUpdateSettings] = js.undefined
  
  /**
    * The user's unhashed password.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The user's primary phone number.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's photo URL.
    */
  var photoURL: js.UndefOr[String | Null] = js.undefined
}
object UpdateRequest {
  
  @scala.inline
  def apply(): UpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRequest]
  }
  
  @scala.inline
  implicit class UpdateRequestMutableBuilder[Self <: UpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    @scala.inline
    def setMultiFactor(value: MultiFactorUpdateSettings): Self = StObject.set(x, "multiFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorUndefined: Self = StObject.set(x, "multiFactor", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoURLNull: Self = StObject.set(x, "photoURL", null)
    
    @scala.inline
    def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
  }
}
