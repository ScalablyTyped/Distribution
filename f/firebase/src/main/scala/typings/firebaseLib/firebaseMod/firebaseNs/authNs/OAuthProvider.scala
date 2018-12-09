package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthProvider extends AuthProvider {
  def addScope(scope: java.lang.String): AuthProvider = js.native
  def credential(): AuthCredential = js.native
  def credential(idToken: java.lang.String): AuthCredential = js.native
  def credential(idToken: java.lang.String, accessToken: java.lang.String): AuthCredential = js.native
  def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): AuthProvider = js.native
}

