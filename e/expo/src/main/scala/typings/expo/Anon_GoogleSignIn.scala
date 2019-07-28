package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GoogleSignIn extends js.Object {
  var googleSignIn: js.UndefOr[Anon_ReservedClientId] = js.undefined
  var usesNonExemptEncryption: js.UndefOr[Boolean] = js.undefined
}

object Anon_GoogleSignIn {
  @scala.inline
  def apply(
    googleSignIn: Anon_ReservedClientId = null,
    usesNonExemptEncryption: js.UndefOr[Boolean] = js.undefined
  ): Anon_GoogleSignIn = {
    val __obj = js.Dynamic.literal()
    if (googleSignIn != null) __obj.updateDynamic("googleSignIn")(googleSignIn)
    if (!js.isUndefined(usesNonExemptEncryption)) __obj.updateDynamic("usesNonExemptEncryption")(usesNonExemptEncryption)
    __obj.asInstanceOf[Anon_GoogleSignIn]
  }
}

