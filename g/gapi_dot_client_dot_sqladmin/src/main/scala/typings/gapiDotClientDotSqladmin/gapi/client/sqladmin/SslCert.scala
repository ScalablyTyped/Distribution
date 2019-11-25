package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCert extends js.Object {
  /** PEM representation. */
  var cert: js.UndefOr[String] = js.undefined
  /** Serial number, as extracted from the certificate. */
  var certSerialNumber: js.UndefOr[String] = js.undefined
  /** User supplied name. Constrained to [a-zA-Z.-_ ]+. */
  var commonName: js.UndefOr[String] = js.undefined
  /** The time when the certificate was created in RFC 3339 format, for example 2012-11-15T16:19:00.094Z */
  var createTime: js.UndefOr[String] = js.undefined
  /** The time when the certificate expires in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var expirationTime: js.UndefOr[String] = js.undefined
  /** Name of the database instance. */
  var instance: js.UndefOr[String] = js.undefined
  /** This is always sql#sslCert. */
  var kind: js.UndefOr[String] = js.undefined
  /** The URI of this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Sha1 Fingerprint. */
  var sha1Fingerprint: js.UndefOr[String] = js.undefined
}

object SslCert {
  @scala.inline
  def apply(
    cert: String = null,
    certSerialNumber: String = null,
    commonName: String = null,
    createTime: String = null,
    expirationTime: String = null,
    instance: String = null,
    kind: String = null,
    selfLink: String = null,
    sha1Fingerprint: String = null
  ): SslCert = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (certSerialNumber != null) __obj.updateDynamic("certSerialNumber")(certSerialNumber.asInstanceOf[js.Any])
    if (commonName != null) __obj.updateDynamic("commonName")(commonName.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (sha1Fingerprint != null) __obj.updateDynamic("sha1Fingerprint")(sha1Fingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslCert]
  }
}

