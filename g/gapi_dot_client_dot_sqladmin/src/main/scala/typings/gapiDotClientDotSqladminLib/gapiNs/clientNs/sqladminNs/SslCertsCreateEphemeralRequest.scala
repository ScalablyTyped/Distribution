package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsCreateEphemeralRequest extends js.Object {
  /** PEM encoded public key to include in the signed certificate. */
  var public_key: js.UndefOr[java.lang.String] = js.undefined
}

object SslCertsCreateEphemeralRequest {
  @scala.inline
  def apply(public_key: java.lang.String = null): SslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    if (public_key != null) __obj.updateDynamic("public_key")(public_key)
    __obj.asInstanceOf[SslCertsCreateEphemeralRequest]
  }
}

