package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "AuthCredential")
@js.native
abstract class AuthCredential () extends StObject {
  
  var providerId: String = js.native
  
  var signInMethod: String = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
object AuthCredential {
  
  @JSImport("@firebase/auth-types", "AuthCredential.fromJSON")
  @js.native
  def fromJSON(json: String): AuthCredential | Null = js.native
  @JSImport("@firebase/auth-types", "AuthCredential.fromJSON")
  @js.native
  def fromJSON(json: js.Object): AuthCredential | Null = js.native
}
