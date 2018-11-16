package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SslCert extends js.Object {
  /** PEM representation. */
  var cert: js.UndefOr[java.lang.String] = js.undefined
  /** Serial number, as extracted from the certificate. */
  var certSerialNumber: js.UndefOr[java.lang.String] = js.undefined
  /** User supplied name. Constrained to [a-zA-Z.-_ ]+. */
  var commonName: js.UndefOr[java.lang.String] = js.undefined
  /** The time when the certificate was created in RFC 3339 format, for example 2012-11-15T16:19:00.094Z */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** The time when the certificate expires in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var expirationTime: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the database instance. */
  var instance: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#sslCert. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The URI of this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Sha1 Fingerprint. */
  var sha1Fingerprint: js.UndefOr[java.lang.String] = js.undefined
}

