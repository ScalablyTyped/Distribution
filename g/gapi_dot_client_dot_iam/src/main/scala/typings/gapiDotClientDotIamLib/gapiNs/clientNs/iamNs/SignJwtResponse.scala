package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignJwtResponse extends js.Object {
  /** The id of the key used to sign the JWT. */
  var keyId: js.UndefOr[java.lang.String] = js.undefined
  /** The signed JWT. */
  var signedJwt: js.UndefOr[java.lang.String] = js.undefined
}

object SignJwtResponse {
  @scala.inline
  def apply(keyId: java.lang.String = null, signedJwt: java.lang.String = null): SignJwtResponse = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId)
    if (signedJwt != null) __obj.updateDynamic("signedJwt")(signedJwt)
    __obj.asInstanceOf[SignJwtResponse]
  }
}

