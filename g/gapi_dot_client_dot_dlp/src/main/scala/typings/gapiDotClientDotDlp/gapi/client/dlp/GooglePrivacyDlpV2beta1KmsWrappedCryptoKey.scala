package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1KmsWrappedCryptoKey extends js.Object {
  /** The resource name of the KMS CryptoKey to use for unwrapping. [required] */
  var cryptoKeyName: js.UndefOr[String] = js.undefined
  /** The wrapped data crypto key. [required] */
  var wrappedKey: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1KmsWrappedCryptoKey {
  @scala.inline
  def apply(cryptoKeyName: String = null, wrappedKey: String = null): GooglePrivacyDlpV2beta1KmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyName != null) __obj.updateDynamic("cryptoKeyName")(cryptoKeyName.asInstanceOf[js.Any])
    if (wrappedKey != null) __obj.updateDynamic("wrappedKey")(wrappedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KmsWrappedCryptoKey]
  }
}

