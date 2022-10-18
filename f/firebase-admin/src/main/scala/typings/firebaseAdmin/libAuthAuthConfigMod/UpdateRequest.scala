package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * Links this user to the specified provider.
    *
    * Linking a provider to an existing user account does not invalidate the
    * refresh token of that account. In other words, the existing account
    * would continue to be able to access resources, despite not having used
    * the newly linked provider to log in. If you wish to force the user to
    * authenticate with this new provider, you need to (a) revoke their
    * refresh token (see
    * https://firebase.google.com/docs/auth/admin/manage-sessions#revoke_refresh_tokens),
    * and (b) ensure no other authentication methods are present on this
    * account.
    */
  var providerToLink: js.UndefOr[UserProvider] = js.undefined
  
  /**
    * Unlinks this user from the specified providers.
    */
  var providersToUnlink: js.UndefOr[js.Array[String]] = js.undefined
}
object UpdateRequest {
  
  inline def apply(): UpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRequest]
  }
  
  extension [Self <: UpdateRequest](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    inline def setMultiFactor(value: MultiFactorUpdateSettings): Self = StObject.set(x, "multiFactor", value.asInstanceOf[js.Any])
    
    inline def setMultiFactorUndefined: Self = StObject.set(x, "multiFactor", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
    
    inline def setPhotoURLNull: Self = StObject.set(x, "photoURL", null)
    
    inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
    
    inline def setProviderToLink(value: UserProvider): Self = StObject.set(x, "providerToLink", value.asInstanceOf[js.Any])
    
    inline def setProviderToLinkUndefined: Self = StObject.set(x, "providerToLink", js.undefined)
    
    inline def setProvidersToUnlink(value: js.Array[String]): Self = StObject.set(x, "providersToUnlink", value.asInstanceOf[js.Any])
    
    inline def setProvidersToUnlinkUndefined: Self = StObject.set(x, "providersToUnlink", js.undefined)
    
    inline def setProvidersToUnlinkVarargs(value: String*): Self = StObject.set(x, "providersToUnlink", js.Array(value*))
  }
}
