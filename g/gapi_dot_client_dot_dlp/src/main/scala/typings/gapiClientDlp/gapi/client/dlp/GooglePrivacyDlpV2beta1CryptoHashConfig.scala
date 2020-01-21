package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CryptoHashConfig extends js.Object {
  /** The key used by the hash function. */
  var cryptoKey: js.UndefOr[GooglePrivacyDlpV2beta1CryptoKey] = js.undefined
}

object GooglePrivacyDlpV2beta1CryptoHashConfig {
  @scala.inline
  def apply(cryptoKey: GooglePrivacyDlpV2beta1CryptoKey = null): GooglePrivacyDlpV2beta1CryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    if (cryptoKey != null) __obj.updateDynamic("cryptoKey")(cryptoKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CryptoHashConfig]
  }
}

