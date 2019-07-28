package typings.gapiDotClientDotGmail.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfo extends js.Object {
  /** Encrypted key password, when key is encrypted. */
  var encryptedKeyPassword: js.UndefOr[String] = js.undefined
  /** When the certificate expires (in milliseconds since epoch). */
  var expiration: js.UndefOr[String] = js.undefined
  /** The immutable ID for the SmimeInfo. */
  var id: js.UndefOr[String] = js.undefined
  /** Whether this SmimeInfo is the default one for this user's send-as address. */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  /** The S/MIME certificate issuer's common name. */
  var issuerCn: js.UndefOr[String] = js.undefined
  /**
    * PEM formatted X509 concatenated certificate string (standard base64 encoding). Format used for returning key, which includes public key as well as
    * certificate chain (not private key).
    */
  var pem: js.UndefOr[String] = js.undefined
  /**
    * PKCS#12 format containing a single private/public key pair and certificate chain. This format is only accepted from client for creating a new SmimeInfo
    * and is never returned, because the private key is not intended to be exported. PKCS#12 may be encrypted, in which case encryptedKeyPassword should be
    * set appropriately.
    */
  var pkcs12: js.UndefOr[String] = js.undefined
}

object SmimeInfo {
  @scala.inline
  def apply(
    encryptedKeyPassword: String = null,
    expiration: String = null,
    id: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    issuerCn: String = null,
    pem: String = null,
    pkcs12: String = null
  ): SmimeInfo = {
    val __obj = js.Dynamic.literal()
    if (encryptedKeyPassword != null) __obj.updateDynamic("encryptedKeyPassword")(encryptedKeyPassword)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (issuerCn != null) __obj.updateDynamic("issuerCn")(issuerCn)
    if (pem != null) __obj.updateDynamic("pem")(pem)
    if (pkcs12 != null) __obj.updateDynamic("pkcs12")(pkcs12)
    __obj.asInstanceOf[SmimeInfo]
  }
}

