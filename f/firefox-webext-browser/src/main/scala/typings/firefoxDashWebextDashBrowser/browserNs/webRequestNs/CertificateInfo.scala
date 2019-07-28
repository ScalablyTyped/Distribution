package typings.firefoxDashWebextDashBrowser.browserNs.webRequestNs

import typings.firefoxDashWebextDashBrowser.Anon_End
import typings.firefoxDashWebextDashBrowser.Anon_Sha1
import typings.firefoxDashWebextDashBrowser.Anon_Sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the certificate properties of the request if it is a secure request. */
trait CertificateInfo extends js.Object {
  var fingerprint: Anon_Sha1
  var isBuiltInRoot: Boolean
  var issuer: String
  var rawDER: js.UndefOr[js.Array[Double]] = js.undefined
  var serialNumber: String
  var subject: String
  var subjectPublicKeyInfoDigest: Anon_Sha256
  /** Contains start and end timestamps. */
  var validity: Anon_End
}

object CertificateInfo {
  @scala.inline
  def apply(
    fingerprint: Anon_Sha1,
    isBuiltInRoot: Boolean,
    issuer: String,
    serialNumber: String,
    subject: String,
    subjectPublicKeyInfoDigest: Anon_Sha256,
    validity: Anon_End,
    rawDER: js.Array[Double] = null
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint, isBuiltInRoot = isBuiltInRoot, issuer = issuer, serialNumber = serialNumber, subject = subject, subjectPublicKeyInfoDigest = subjectPublicKeyInfoDigest, validity = validity)
    if (rawDER != null) __obj.updateDynamic("rawDER")(rawDER)
    __obj.asInstanceOf[CertificateInfo]
  }
}

