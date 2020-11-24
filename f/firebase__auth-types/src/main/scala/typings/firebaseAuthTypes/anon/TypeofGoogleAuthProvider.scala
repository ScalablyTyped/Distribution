package typings.firebaseAuthTypes.anon

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseAuthTypes.mod.AuthCredential
import typings.firebaseAuthTypes.mod.GoogleAuthProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGoogleAuthProvider extends Instantiable0[GoogleAuthProvider] {
  
  var GOOGLE_SIGN_IN_METHOD: String = js.native
  
  var PROVIDER_ID: String = js.native
  
  def credential(): AuthCredential = js.native
  def credential(idToken: js.UndefOr[scala.Nothing], accessToken: String): AuthCredential = js.native
  def credential(idToken: String): AuthCredential = js.native
  def credential(idToken: String, accessToken: String): AuthCredential = js.native
  def credential(idToken: Null, accessToken: String): AuthCredential = js.native
}
