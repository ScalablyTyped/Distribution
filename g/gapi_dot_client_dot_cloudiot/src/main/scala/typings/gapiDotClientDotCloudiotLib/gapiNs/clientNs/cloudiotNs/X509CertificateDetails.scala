package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait X509CertificateDetails extends js.Object {
  /** The time the certificate becomes invalid. */
  var expiryTime: js.UndefOr[java.lang.String] = js.undefined
  /** The entity that signed the certificate. */
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  /** The type of public key in the certificate. */
  var publicKeyType: js.UndefOr[java.lang.String] = js.undefined
  /** The algorithm used to sign the certificate. */
  var signatureAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /** The time the certificate becomes valid. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The entity the certificate and public key belong to. */
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

