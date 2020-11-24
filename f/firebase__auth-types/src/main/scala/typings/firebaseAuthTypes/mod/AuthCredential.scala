package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "AuthCredential")
@js.native
abstract class AuthCredential () extends js.Object {
  
  var providerId: String = js.native
  
  var signInMethod: String = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
@JSImport("@firebase/auth-types", "AuthCredential")
@js.native
object AuthCredential extends js.Object {
  
  def fromJSON(json: String): AuthCredential | Null = js.native
  def fromJSON(json: js.Object): AuthCredential | Null = js.native
}
