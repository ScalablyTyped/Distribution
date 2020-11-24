package typings.firebase.mod.firebase.auth

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
trait AuthCredential extends js.Object {
  
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
  implicit class AuthCredentialOps[Self <: AuthCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInMethod(value: String): Self = this.set("signInMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Object): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
