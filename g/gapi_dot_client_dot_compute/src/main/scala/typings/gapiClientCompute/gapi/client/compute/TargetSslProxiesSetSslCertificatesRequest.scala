package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetSslProxiesSetSslCertificatesRequest extends js.Object {
  /** New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently exactly one ssl certificate must be specified. */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.native
}

object TargetSslProxiesSetSslCertificatesRequest {
  @scala.inline
  def apply(): TargetSslProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSslProxiesSetSslCertificatesRequest]
  }
  @scala.inline
  implicit class TargetSslProxiesSetSslCertificatesRequestOps[Self <: TargetSslProxiesSetSslCertificatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSslCertificatesVarargs(value: String*): Self = this.set("sslCertificates", js.Array(value :_*))
    @scala.inline
    def setSslCertificates(value: js.Array[String]): Self = this.set("sslCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslCertificates: Self = this.set("sslCertificates", js.undefined)
  }
  
}

