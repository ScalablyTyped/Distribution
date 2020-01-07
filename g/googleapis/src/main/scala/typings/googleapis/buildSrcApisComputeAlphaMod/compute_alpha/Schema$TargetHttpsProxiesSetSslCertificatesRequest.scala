package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetHttpsProxiesSetSslCertificatesRequest extends js.Object {
  /**
    * New set of SslCertificate resources to associate with this
    * TargetHttpsProxy resource. Currently exactly one SslCertificate resource
    * must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TargetHttpsProxiesSetSslCertificatesRequest {
  @scala.inline
  def apply(sslCertificates: js.Array[String] = null): Schema$TargetHttpsProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetHttpsProxiesSetSslCertificatesRequest]
  }
}

