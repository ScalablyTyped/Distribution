package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An authentication error.
  * For method-specific error codes, refer to the specific methods in the
  * documentation. For common error codes, check the reference below. Use {@link
  * firebase.auth.Error#code} to get the specific error code. For a detailed
  * message, use {@link firebase.auth.Error.message}.
  * Errors with the code <strong>auth/account-exists-with-different-credential
  * </strong> will have the additional fields <strong>email</strong> and <strong>
  * credential</strong> which are needed to provide a way to resolve these
  * specific errors. Refer to {@link firebase.auth.Auth.signInWithPopup} for more
  * information.
  *
  * <h4>Common Error Codes</h4>
  * <dl>
  * <dt>auth/app-deleted</dt>
  * <dd>Thrown if the instance of FirebaseApp has been deleted.</dd>
  * <dt>auth/app-not-authorized</dt>
  * <dd>Thrown if the app identified by the domain where it's hosted, is not
  *     authorized to use Firebase Authentication with the provided API key.
  *     Review your key configuration in the Google API console.</dd>
  * <dt>auth/argument-error</dt>
  * <dd>Thrown if a method is called with incorrect arguments.</dd>
  * <dt>auth/invalid-api-key</dt>
  * <dd>Thrown if the provided API key is invalid. Please check that you have
  *     copied it correctly from the Firebase Console.</dd>
  * <dt>auth/invalid-user-token</dt>
  * <dd>Thrown if the user's credential is no longer valid. The user must sign in
  *     again.</dd>
  * <dt>auth/invalid-tenant-id</dt>
  * <dd>Thrown if the tenant ID provided is invalid.</dd>
  * <dt>auth/network-request-failed</dt>
  * <dd>Thrown if a network error (such as timeout, interrupted connection or
  *     unreachable host) has occurred.</dd>
  * <dt>auth/operation-not-allowed</dt>
  * <dd>Thrown if you have not enabled the provider in the Firebase Console. Go
  *     to the Firebase Console for your project, in the Auth section and the
  *     <strong>Sign in Method</strong> tab and configure the provider.</dd>
  * <dt>auth/requires-recent-login</dt>
  * <dd>Thrown if the user's last sign-in time does not meet the security
  *     threshold. Use {@link firebase.User.reauthenticateWithCredential} to
  *     resolve. This does not apply if the user is anonymous.</dd>
  * <dt>auth/too-many-requests</dt>
  * <dd>Thrown if requests are blocked from a device due to unusual activity.
  *     Trying again after some delay would unblock.</dd>
  * <dt>auth/unauthorized-domain</dt>
  * <dd>Thrown if the app domain is not authorized for OAuth operations for your
  *     Firebase project. Edit the list of authorized domains from the Firebase
  *     console.</dd>
  * <dt>auth/user-disabled</dt>
  * <dd>Thrown if the user account has been disabled by an administrator.
  *     Accounts can be enabled or disabled in the Firebase Console, the Auth
  *     section and Users subsection.</dd>
  * <dt>auth/user-token-expired</dt>
  * <dd>Thrown if the user's credential has expired. This could also be thrown if
  *     a user has been deleted. Prompting the user to sign in again should
  *     resolve this for either case.</dd>
  * <dt>auth/web-storage-unsupported</dt>
  * <dd>Thrown if the browser does not support web storage or if the user
  *     disables them.</dd>
  * </dl>
  */
trait Error extends StObject {
  
  /**
    * Unique error code.
    */
  var code: String
  
  /**
    * Complete error message.
    */
  var message: String
}
object Error {
  
  @scala.inline
  def apply(code: String, message: String): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
