package typings.atFirebaseAuthDashTypes

import org.scalablytyped.runtime.Instantiable0
import typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod.AuthCredential
import typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod.GoogleAuthProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassGoogleAuthProvider extends Instantiable0[GoogleAuthProvider] {
  var GOOGLE_SIGN_IN_METHOD: String = js.native
  var PROVIDER_ID: String = js.native
  def credential(): AuthCredential = js.native
  def credential(idToken: String): AuthCredential = js.native
  def credential(idToken: String, accessToken: String): AuthCredential = js.native
  def credential(idToken: Null, accessToken: String): AuthCredential = js.native
}

