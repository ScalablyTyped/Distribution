package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetSslProxiesSetSslCertificatesRequest extends js.Object {
  /**
    * New set of URLs to SslCertificate resources to associate with this
    * TargetSslProxy. Currently exactly one ssl certificate must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TargetSslProxiesSetSslCertificatesRequest {
  @scala.inline
  def apply(sslCertificates: js.Array[String] = null): Schema$TargetSslProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetSslProxiesSetSslCertificatesRequest]
  }
}

