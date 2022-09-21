package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth", "AuthCredential")
@js.native
open class AuthCredential () extends StObject {
  
  /**
    * The authentication provider ID for the credential.
    *
    * @remarks
    * For example, 'facebook.com', or 'google.com'.
    */
  val providerId: String = js.native
  
  /**
    * The authentication sign in method for the credential.
    *
    * @remarks
    * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
    * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
    * identifier as returned in {@link fetchSignInMethodsForEmail}.
    */
  val signInMethod: String = js.native
  
  /* Excluded from this release type: __constructor */
  /**
    * Returns a JSON-serializable representation of this object.
    *
    * @returns a JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}
