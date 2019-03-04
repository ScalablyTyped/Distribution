package typings
package firefoxDashWebextDashBrowserLib.browserNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the certificate properties of the request if it is a secure request. */
trait CertificateInfo extends js.Object {
  var fingerprint: firefoxDashWebextDashBrowserLib.Anon_Sha1
  var isBuiltInRoot: scala.Boolean
  var issuer: java.lang.String
  var rawDER: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var serialNumber: java.lang.String
  var subject: java.lang.String
  var subjectPublicKeyInfoDigest: firefoxDashWebextDashBrowserLib.Anon_Sha256
  /** Contains start and end timestamps. */
  var validity: firefoxDashWebextDashBrowserLib.Anon_End
}

object CertificateInfo {
  @scala.inline
  def apply(
    fingerprint: firefoxDashWebextDashBrowserLib.Anon_Sha1,
    isBuiltInRoot: scala.Boolean,
    issuer: java.lang.String,
    serialNumber: java.lang.String,
    subject: java.lang.String,
    subjectPublicKeyInfoDigest: firefoxDashWebextDashBrowserLib.Anon_Sha256,
    validity: firefoxDashWebextDashBrowserLib.Anon_End,
    rawDER: js.Array[scala.Double] = null
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint, isBuiltInRoot = isBuiltInRoot, issuer = issuer, serialNumber = serialNumber, subject = subject, subjectPublicKeyInfoDigest = subjectPublicKeyInfoDigest, validity = validity)
    if (rawDER != null) __obj.updateDynamic("rawDER")(rawDER)
    __obj.asInstanceOf[CertificateInfo]
  }
}

