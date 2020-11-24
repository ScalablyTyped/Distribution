package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "EmailAuthProvider")
@js.native
class EmailAuthProvider () extends EmailAuthProviderInstance
/* static members */
@JSImport("@firebase/auth-types", "EmailAuthProvider")
@js.native
object EmailAuthProvider extends js.Object {
  
  var EMAIL_LINK_SIGN_IN_METHOD: String = js.native
  
  var EMAIL_PASSWORD_SIGN_IN_METHOD: String = js.native
  
  var PROVIDER_ID: String = js.native
  
  def credential(email: String, password: String): AuthCredential = js.native
  
  def credentialWithLink(email: String, emailLink: String): AuthCredential = js.native
}
