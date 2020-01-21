package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "OAuthCredential")
@js.native
class OAuthCredential protected () extends AuthCredential {
  var accessToken: js.UndefOr[String] = js.native
  var idToken: js.UndefOr[String] = js.native
  var secret: js.UndefOr[String] = js.native
}

