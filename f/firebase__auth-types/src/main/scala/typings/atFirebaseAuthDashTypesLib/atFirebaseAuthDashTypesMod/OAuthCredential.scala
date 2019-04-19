package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "OAuthCredential")
@js.native
class OAuthCredential protected () extends AuthCredential {
  var accessToken: js.UndefOr[java.lang.String] = js.native
  var idToken: js.UndefOr[java.lang.String] = js.native
  var secret: js.UndefOr[java.lang.String] = js.native
}

