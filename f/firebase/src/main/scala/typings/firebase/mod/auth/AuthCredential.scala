package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that represents the credentials returned by an auth provider.
  * Implementations specify the details about each auth provider's credential
  * requirements.
  *
  */
@JSImport("firebase", "auth.AuthCredential")
@js.native
abstract class AuthCredential () extends js.Object {
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

/* static members */
@JSImport("firebase", "auth.AuthCredential")
@js.native
object AuthCredential extends js.Object {
  def fromJSON(json: String): AuthCredential | Null = js.native
  /**
    * Static method to deserialize a JSON representation of an object into an
    * {@link firebase.auth.AuthCredential}. Input can be either Object or the
    * stringified representation of the object. When string is provided,
    * JSON.parse would be called first. If the JSON input does not represent
    * an`AuthCredential`, null is returned.
    * @param json The plain object representation of an
    *     AuthCredential.
    */
  def fromJSON(json: js.Object): AuthCredential | Null = js.native
}

