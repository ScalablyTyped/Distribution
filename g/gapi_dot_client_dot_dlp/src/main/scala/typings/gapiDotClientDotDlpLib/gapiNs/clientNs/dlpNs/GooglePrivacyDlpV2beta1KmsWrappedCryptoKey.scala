package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1KmsWrappedCryptoKey extends js.Object {
  /** The resource name of the KMS CryptoKey to use for unwrapping. [required] */
  var cryptoKeyName: js.UndefOr[java.lang.String] = js.undefined
  /** The wrapped data crypto key. [required] */
  var wrappedKey: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1KmsWrappedCryptoKey {
  @scala.inline
  def apply(cryptoKeyName: java.lang.String = null, wrappedKey: java.lang.String = null): GooglePrivacyDlpV2beta1KmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyName != null) __obj.updateDynamic("cryptoKeyName")(cryptoKeyName)
    if (wrappedKey != null) __obj.updateDynamic("wrappedKey")(wrappedKey)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KmsWrappedCryptoKey]
  }
}

