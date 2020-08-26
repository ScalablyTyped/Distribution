package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCert extends js.Object {
  /** PEM representation. */
  var cert: js.UndefOr[String] = js.native
  /** Serial number, as extracted from the certificate. */
  var certSerialNumber: js.UndefOr[String] = js.native
  /** User supplied name. Constrained to [a-zA-Z.-_ ]+. */
  var commonName: js.UndefOr[String] = js.native
  /** The time when the certificate was created in RFC 3339 format, for example 2012-11-15T16:19:00.094Z */
  var createTime: js.UndefOr[String] = js.native
  /** The time when the certificate expires in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var expirationTime: js.UndefOr[String] = js.native
  /** Name of the database instance. */
  var instance: js.UndefOr[String] = js.native
  /** This is always sql#sslCert. */
  var kind: js.UndefOr[String] = js.native
  /** The URI of this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** Sha1 Fingerprint. */
  var sha1Fingerprint: js.UndefOr[String] = js.native
}

object SslCert {
  @scala.inline
  def apply(): SslCert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCert]
  }
  @scala.inline
  implicit class SslCertOps[Self <: SslCert] (val x: Self) extends AnyVal {
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
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setCertSerialNumber(value: String): Self = this.set("certSerialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertSerialNumber: Self = this.set("certSerialNumber", js.undefined)
    @scala.inline
    def setCommonName(value: String): Self = this.set("commonName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonName: Self = this.set("commonName", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSha1Fingerprint(value: String): Self = this.set("sha1Fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha1Fingerprint: Self = this.set("sha1Fingerprint", js.undefined)
  }
  
}

