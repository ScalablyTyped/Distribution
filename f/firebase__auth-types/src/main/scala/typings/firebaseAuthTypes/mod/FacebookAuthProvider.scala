package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "FacebookAuthProvider")
@js.native
class FacebookAuthProvider () extends FacebookAuthProviderInstance
/* static members */
@JSImport("@firebase/auth-types", "FacebookAuthProvider")
@js.native
object FacebookAuthProvider extends js.Object {
  
  var FACEBOOK_SIGN_IN_METHOD: String = js.native
  
  var PROVIDER_ID: String = js.native
  
  def credential(token: String): AuthCredential = js.native
}
