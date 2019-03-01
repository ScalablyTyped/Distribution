package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FederatedSignonCertsResponse extends js.Object {
  var certs: Certificates
  var format: CertificateFormat
  var res: js.UndefOr[gaxiosLib.buildSrcCommonMod.GaxiosResponse[scala.Unit] | scala.Null] = js.undefined
}

object FederatedSignonCertsResponse {
  @scala.inline
  def apply(
    certs: Certificates,
    format: CertificateFormat,
    res: gaxiosLib.buildSrcCommonMod.GaxiosResponse[scala.Unit] = null
  ): FederatedSignonCertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("certs")(certs)
    __obj.updateDynamic("format")(format)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[FederatedSignonCertsResponse]
  }
}

