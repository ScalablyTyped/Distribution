package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "OAuthProvider")
@js.native
class OAuthProvider () extends AuthProvider {
  /* CompleteClass */
  override var providerId: java.lang.String = js.native
  def addScope(scope: java.lang.String): AuthProvider = js.native
  def credential(): OAuthCredential = js.native
  def credential(idToken: java.lang.String): OAuthCredential = js.native
  def credential(idToken: java.lang.String, accessToken: java.lang.String): OAuthCredential = js.native
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}

