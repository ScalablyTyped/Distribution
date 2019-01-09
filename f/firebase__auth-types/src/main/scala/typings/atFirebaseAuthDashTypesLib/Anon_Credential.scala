package typings
package atFirebaseAuthDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Credential
  extends org.scalablytyped.runtime.Instantiable0[atFirebaseAuthDashTypesLib.authDashTypesMod.EmailAuthProvider] {
  var EMAIL_LINK_SIGN_IN_METHOD: java.lang.String = js.native
  var EMAIL_PASSWORD_SIGN_IN_METHOD: java.lang.String = js.native
  var PROVIDER_ID: java.lang.String = js.native
  def credential(email: java.lang.String, password: java.lang.String): atFirebaseAuthDashTypesLib.authDashTypesMod.AuthCredential = js.native
  def credentialWithLink(email: java.lang.String, emailLink: java.lang.String): atFirebaseAuthDashTypesLib.authDashTypesMod.AuthCredential = js.native
}

