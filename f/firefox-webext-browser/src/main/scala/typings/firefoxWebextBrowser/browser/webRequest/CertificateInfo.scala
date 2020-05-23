package typings.firefoxWebextBrowser.browser.webRequest

import typings.firefoxWebextBrowser.anon.End
import typings.firefoxWebextBrowser.anon.Sha1
import typings.firefoxWebextBrowser.anon.Sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the certificate properties of the request if it is a secure request. */
trait CertificateInfo extends js.Object {
  var fingerprint: Sha1
  var isBuiltInRoot: Boolean
  var issuer: String
  var rawDER: js.UndefOr[js.Array[Double]] = js.undefined
  var serialNumber: String
  var subject: String
  var subjectPublicKeyInfoDigest: Sha256
  /** Contains start and end timestamps. */
  var validity: End
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
    validity: End,
    rawDER: js.Array[Double] = null
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], isBuiltInRoot = isBuiltInRoot.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfoDigest = subjectPublicKeyInfoDigest.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any])
    if (rawDER != null) __obj.updateDynamic("rawDER")(rawDER.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
}

