package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The account conflict error.
  * Refer to {@link firebase.auth.Auth.signInWithPopup} for more information.
  *
  * <h4>Common Error Codes</h4>
  * <dl>
  * <dt>auth/account-exists-with-different-credential</dt>
  * <dd>Thrown if there already exists an account with the email address
  *     asserted by the credential. Resolve this by calling
  *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail} with the error.email
  *     and then asking the user to sign in using one of the returned providers.
  *     Once the user is signed in, the original credential retrieved from the
  *     error.credential can be linked to the user with
  *     {@link firebase.User.linkWithCredential} to prevent the user from signing
  *     in again to the original provider via popup or redirect. If you are using
  *     redirects for sign in, save the credential in session storage and then
  *     retrieve on redirect and repopulate the credential using for example
  *     {@link firebase.auth.GoogleAuthProvider.credential} depending on the
  *     credential provider id and complete the link.</dd>
  * <dt>auth/credential-already-in-use</dt>
  * <dd>Thrown if the account corresponding to the credential already exists
  *     among your users, or is already linked to a Firebase User.
  *     For example, this error could be thrown if you are upgrading an anonymous
  *     user to a Google user by linking a Google credential to it and the Google
  *     credential used is already associated with an existing Firebase Google
  *     user.
  *     The fields <code>error.email</code>, <code>error.phoneNumber</code>, and
  *     <code>error.credential</code> ({@link firebase.auth.AuthCredential})
  *     may be provided, depending on the type of credential. You can recover
  *     from this error by signing in with <code>error.credential</code> directly
  *     via {@link firebase.auth.Auth.signInWithCredential}.</dd>
  * <dt>auth/email-already-in-use</dt>
  * <dd>Thrown if the email corresponding to the credential already exists
  *     among your users. When thrown while linking a credential to an existing
  *     user, an <code>error.email</code> and <code>error.credential</code>
  *     ({@link firebase.auth.AuthCredential}) fields are also provided.
  *     You have to link the credential to the existing user with that email if
  *     you wish to continue signing in with that credential. To do so, call
  *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail}, sign in to
  *     <code>error.email</code> via one of the providers returned and then
  *     {@link firebase.User.linkWithCredential} the original credential to that
  *     newly signed in user.</dd>
  * </dl>
  */
trait AuthError
  extends StObject
     with Error {
  
  /**
    * The {@link firebase.auth.AuthCredential} that can be used to resolve the
    * error.
    */
  var credential: js.UndefOr[AuthCredential] = js.undefined
  
  /**
    * The email of the user's account used for sign-in/linking.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number of the user's account used for sign-in/linking.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The tenant ID being used for sign-in/linking. If you use
    * {@link firebase.auth.signInWithRedirect} to sign in, you have to
    * set the tenant ID on Auth instanace again as the tenant ID is not
    * persisted after redirection.
    */
  var tenantId: js.UndefOr[String] = js.undefined
}
object AuthError {
  
  inline def apply(code: String, message: String): AuthError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthError]
  }
  
  extension [Self <: AuthError](x: Self) {
    
    inline def setCredential(value: AuthCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
