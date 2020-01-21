package typings.firefoxWebextBrowser.browser.webRequest

import typings.firefoxWebextBrowser.AnonEnd
import typings.firefoxWebextBrowser.AnonSha1
import typings.firefoxWebextBrowser.AnonSha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the certificate properties of the request if it is a secure request. */
trait CertificateInfo extends js.Object {
  var fingerprint: AnonSha1
  var isBuiltInRoot: Boolean
  var issuer: String
  var rawDER: js.UndefOr[js.Array[Double]] = js.undefined
  var serialNumber: String
  var subject: String
  var subjectPublicKeyInfoDigest: AnonSha256
  /** Contains start and end timestamps. */
  var validity: AnonEnd
}

object CertificateInfo {
  @scala.inline
  def apply(
    fingerprint: AnonSha1,
    isBuiltInRoot: Boolean,
    issuer: String,
    serialNumber: String,
    subject: String,
    subjectPublicKeyInfoDigest: AnonSha256,
    validity: AnonEnd,
    rawDER: js.Array[Double] = null
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], isBuiltInRoot = isBuiltInRoot.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfoDigest = subjectPublicKeyInfoDigest.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any])
    if (rawDER != null) __obj.updateDynamic("rawDER")(rawDER.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
}

