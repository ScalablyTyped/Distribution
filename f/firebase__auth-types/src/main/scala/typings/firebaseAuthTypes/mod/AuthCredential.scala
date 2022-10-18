package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@firebase/auth-types", "AuthCredential")
@js.native
open class AuthCredential () extends StObject {
  
  var providerId: String = js.native
  
  var signInMethod: String = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
object AuthCredential {
  
  @JSImport("@firebase/auth-types", "AuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: String): AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AuthCredential | Null]
  inline def fromJSON(json: js.Object): AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AuthCredential | Null]
}
