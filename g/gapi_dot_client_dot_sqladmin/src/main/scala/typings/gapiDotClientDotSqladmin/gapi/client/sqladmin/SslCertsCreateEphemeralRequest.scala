package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsCreateEphemeralRequest extends js.Object {
  /** PEM encoded public key to include in the signed certificate. */
  var public_key: js.UndefOr[String] = js.undefined
}

object SslCertsCreateEphemeralRequest {
  @scala.inline
  def apply(public_key: String = null): SslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    if (public_key != null) __obj.updateDynamic("public_key")(public_key)
    __obj.asInstanceOf[SslCertsCreateEphemeralRequest]
  }
}

