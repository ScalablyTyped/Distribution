package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxiesSetSslCertificatesRequest extends js.Object {
  /** New set of SslCertificate resources to associate with this TargetHttpsProxy resource. Currently exactly one SslCertificate resource must be specified. */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.undefined
}

object TargetHttpsProxiesSetSslCertificatesRequest {
  @scala.inline
  def apply(sslCertificates: js.Array[String] = null): TargetHttpsProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates)
    __obj.asInstanceOf[TargetHttpsProxiesSetSslCertificatesRequest]
  }
}

