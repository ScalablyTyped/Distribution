package typings.firefoxWebextBrowser.browser.webRequest

import typings.firefoxWebextBrowser.anon.End
import typings.firefoxWebextBrowser.anon.Sha1
import typings.firefoxWebextBrowser.anon.Sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the certificate properties of the request if it is a secure request. */
@js.native
trait CertificateInfo extends js.Object {
  var fingerprint: Sha1 = js.native
  var isBuiltInRoot: Boolean = js.native
  var issuer: String = js.native
  var rawDER: js.UndefOr[js.Array[Double]] = js.native
  var serialNumber: String = js.native
  var subject: String = js.native
  var subjectPublicKeyInfoDigest: Sha256 = js.native
  /** Contains start and end timestamps. */
  var validity: End = js.native
}

object CertificateInfo {
  @scala.inline
  def apply(
    fingerprint: Sha1,
    isBuiltInRoot: Boolean,
    issuer: String,
    serialNumber: String,
    subject: String,
    subjectPublicKeyInfoDigest: Sha256,
    validity: End
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], isBuiltInRoot = isBuiltInRoot.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfoDigest = subjectPublicKeyInfoDigest.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
  @scala.inline
  implicit class CertificateInfoOps[Self <: CertificateInfo] (val x: Self) extends AnyVal {
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
    def setFingerprint(value: Sha1): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBuiltInRoot(value: Boolean): Self = this.set("isBuiltInRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubjectPublicKeyInfoDigest(value: Sha256): Self = this.set("subjectPublicKeyInfoDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidity(value: End): Self = this.set("validity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawDERVarargs(value: Double*): Self = this.set("rawDER", js.Array(value :_*))
    @scala.inline
    def setRawDER(value: js.Array[Double]): Self = this.set("rawDER", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawDER: Self = this.set("rawDER", js.undefined)
  }
  
}

