package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetHttpsProxiesSetSslCertificatesRequest extends js.Object {
  /**
    * New set of SslCertificate resources to associate with this
    * TargetHttpsProxy resource. Currently exactly one SslCertificate resource
    * must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTargetHttpsProxiesSetSslCertificatesRequest {
  @scala.inline
  def apply(): SchemaTargetHttpsProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpsProxiesSetSslCertificatesRequest]
  }
  @scala.inline
  implicit class SchemaTargetHttpsProxiesSetSslCertificatesRequestOps[Self <: SchemaTargetHttpsProxiesSetSslCertificatesRequest] (val x: Self) extends AnyVal {
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

