package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface that represents the credentials returned by an auth provider.
  * Implementations specify the details about each auth provider's credential
  * requirements.
  *
  */
@js.native
trait AuthCredential extends StObject {
  
  /**
    * The authentication provider ID for the credential.
    * For example, 'facebook.com', or 'google.com'.
    */
  var providerId: String = js.native
  
  /**
    * The authentication sign in method for the credential.
    * For example, 'password', or 'emailLink. This corresponds to the sign-in
    * method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    */
  var signInMethod: String = js.native
  
  /**
    * Returns a JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}
object AuthCredential {
  
  @scala.inline
  def apply(providerId: String, signInMethod: String, toJSON: () => js.Object): AuthCredential = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], signInMethod = signInMethod.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[AuthCredential]
  }
  
  @scala.inline
  implicit class AuthCredentialMutableBuilder[Self <: AuthCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInMethod(value: String): Self = StObject.set(x, "signInMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
