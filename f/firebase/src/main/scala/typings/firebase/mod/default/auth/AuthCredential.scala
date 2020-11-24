package typings.firebase.mod.default.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface that represents the credentials returned by an auth provider.
  * Implementations specify the details about each auth provider's credential
  * requirements.
  *
  */
@JSImport("firebase", "auth.AuthCredential")
@js.native
abstract class AuthCredential ()
  extends typings.firebase.mod.firebase.auth.AuthCredential
/* static members */
@JSImport("firebase", "auth.AuthCredential")
@js.native
object AuthCredential extends js.Object {
  
  def fromJSON(json: String): typings.firebase.mod.firebase.auth.AuthCredential | Null = js.native
  /**
    * Static method to deserialize a JSON representation of an object into an
    * {@link firebase.auth.AuthCredential}. Input can be either Object or the
    * stringified representation of the object. When string is provided,
    * JSON.parse would be called first. If the JSON input does not represent
    * an`AuthCredential`, null is returned.
    * @param json The plain object representation of an
    *     AuthCredential.
    */
  def fromJSON(json: js.Object): typings.firebase.mod.firebase.auth.AuthCredential | Null = js.native
}
