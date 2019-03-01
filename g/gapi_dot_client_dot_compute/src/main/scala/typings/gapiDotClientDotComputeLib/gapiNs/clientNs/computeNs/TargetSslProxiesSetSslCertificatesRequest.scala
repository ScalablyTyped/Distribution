package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesSetSslCertificatesRequest extends js.Object {
  /** New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently exactly one ssl certificate must be specified. */
  var sslCertificates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TargetSslProxiesSetSslCertificatesRequest {
  @scala.inline
  def apply(sslCertificates: js.Array[java.lang.String] = null): TargetSslProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates)
    __obj.asInstanceOf[TargetSslProxiesSetSslCertificatesRequest]
  }
}

