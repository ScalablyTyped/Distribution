package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxiesSetSslCertificatesRequest extends js.Object {
  /** New set of SslCertificate resources to associate with this TargetHttpsProxy resource. Currently exactly one SslCertificate resource must be specified. */
  var sslCertificates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TargetHttpsProxiesSetSslCertificatesRequest {
  @scala.inline
  def apply(sslCertificates: js.Array[java.lang.String] = null): TargetHttpsProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates)
    __obj.asInstanceOf[TargetHttpsProxiesSetSslCertificatesRequest]
  }
}

