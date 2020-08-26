package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductSigningCertificate extends js.Object {
  /**
    * The base64 urlsafe encoded SHA1 hash of the certificate. (This field is deprecated in favor of SHA2-256. It should not be used and may be removed at
    * any time.)
    */
  var certificateHashSha1: js.UndefOr[String] = js.native
  /** The base64 urlsafe encoded SHA2-256 hash of the certificate. */
  var certificateHashSha256: js.UndefOr[String] = js.native
}

object ProductSigningCertificate {
  @scala.inline
  def apply(): ProductSigningCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSigningCertificate]
  }
  @scala.inline
  implicit class ProductSigningCertificateOps[Self <: ProductSigningCertificate] (val x: Self) extends AnyVal {
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
    def setCertificateHashSha1(value: String): Self = this.set("certificateHashSha1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateHashSha1: Self = this.set("certificateHashSha1", js.undefined)
    @scala.inline
    def setCertificateHashSha256(value: String): Self = this.set("certificateHashSha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateHashSha256: Self = this.set("certificateHashSha256", js.undefined)
  }
  
}

