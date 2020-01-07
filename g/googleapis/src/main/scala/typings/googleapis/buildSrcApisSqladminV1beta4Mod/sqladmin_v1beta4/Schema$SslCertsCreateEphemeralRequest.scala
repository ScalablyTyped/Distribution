package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCerts create ephemeral certificate request.
  */
@js.native
trait Schema$SslCertsCreateEphemeralRequest extends js.Object {
  /**
    * PEM encoded public key to include in the signed certificate.
    */
  var public_key: js.UndefOr[String] = js.native
}

object Schema$SslCertsCreateEphemeralRequest {
  @scala.inline
  def apply(public_key: String = null): Schema$SslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    if (public_key != null) __obj.updateDynamic("public_key")(public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SslCertsCreateEphemeralRequest]
  }
}

