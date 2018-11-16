package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SslCertDetail extends js.Object {
  /** The public information about the cert. */
  var certInfo: js.UndefOr[SslCert] = js.undefined
  /** The private key for the client cert, in pem format. Keep private in order to protect your security. */
  var certPrivateKey: js.UndefOr[java.lang.String] = js.undefined
}

