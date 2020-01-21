package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FederatedSignonCertsResponse extends js.Object {
  var certs: Certificates
  var format: CertificateFormat
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.undefined
}

object FederatedSignonCertsResponse {
  @scala.inline
  def apply(certs: Certificates, format: CertificateFormat, res: GaxiosResponse[Unit] = null): FederatedSignonCertsResponse = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedSignonCertsResponse]
  }
}

