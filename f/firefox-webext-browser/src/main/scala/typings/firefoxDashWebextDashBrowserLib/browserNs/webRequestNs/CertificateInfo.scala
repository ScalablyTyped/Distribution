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
  var validity: firefoxDashWebextDashBrowserLib.Anon_Start
}

