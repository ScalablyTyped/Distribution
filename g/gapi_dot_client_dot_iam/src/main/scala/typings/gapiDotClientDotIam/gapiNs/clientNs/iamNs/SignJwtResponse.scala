package typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignJwtResponse extends js.Object {
  /** The id of the key used to sign the JWT. */
  var keyId: js.UndefOr[String] = js.undefined
  /** The signed JWT. */
  var signedJwt: js.UndefOr[String] = js.undefined
}

object SignJwtResponse {
  @scala.inline
  def apply(keyId: String = null, signedJwt: String = null): SignJwtResponse = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId)
    if (signedJwt != null) __obj.updateDynamic("signedJwt")(signedJwt)
    __obj.asInstanceOf[SignJwtResponse]
  }
}

