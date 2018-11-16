package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SmimeInfo extends js.Object {
  /** Encrypted key password, when key is encrypted. */
  var encryptedKeyPassword: js.UndefOr[java.lang.String] = js.undefined
  /** When the certificate expires (in milliseconds since epoch). */
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  /** The immutable ID for the SmimeInfo. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this SmimeInfo is the default one for this user's send-as address. */
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** The S/MIME certificate issuer's common name. */
  var issuerCn: js.UndefOr[java.lang.String] = js.undefined
  /**
               * PEM formatted X509 concatenated certificate string (standard base64 encoding). Format used for returning key, which includes public key as well as
               * certificate chain (not private key).
               */
  var pem: js.UndefOr[java.lang.String] = js.undefined
  /**
               * PKCS#12 format containing a single private/public key pair and certificate chain. This format is only accepted from client for creating a new SmimeInfo
               * and is never returned, because the private key is not intended to be exported. PKCS#12 may be encrypted, in which case encryptedKeyPassword should be
               * set appropriately.
               */
  var pkcs12: js.UndefOr[java.lang.String] = js.undefined
}

