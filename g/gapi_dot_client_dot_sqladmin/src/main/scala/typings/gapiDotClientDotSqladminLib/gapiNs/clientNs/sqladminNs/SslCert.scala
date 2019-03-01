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

object SslCert {
  @scala.inline
  def apply(
    cert: java.lang.String = null,
    certSerialNumber: java.lang.String = null,
    commonName: java.lang.String = null,
    createTime: java.lang.String = null,
    expirationTime: java.lang.String = null,
    instance: java.lang.String = null,
    kind: java.lang.String = null,
    selfLink: java.lang.String = null,
    sha1Fingerprint: java.lang.String = null
  ): SslCert = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (certSerialNumber != null) __obj.updateDynamic("certSerialNumber")(certSerialNumber)
    if (commonName != null) __obj.updateDynamic("commonName")(commonName)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (sha1Fingerprint != null) __obj.updateDynamic("sha1Fingerprint")(sha1Fingerprint)
    __obj.asInstanceOf[SslCert]
  }
}

