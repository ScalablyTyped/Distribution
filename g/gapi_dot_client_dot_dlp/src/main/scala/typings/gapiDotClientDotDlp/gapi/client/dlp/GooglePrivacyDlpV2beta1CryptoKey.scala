package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CryptoKey extends js.Object {
  var kmsWrapped: js.UndefOr[GooglePrivacyDlpV2beta1KmsWrappedCryptoKey] = js.undefined
  var transient: js.UndefOr[GooglePrivacyDlpV2beta1TransientCryptoKey] = js.undefined
  var unwrapped: js.UndefOr[GooglePrivacyDlpV2beta1UnwrappedCryptoKey] = js.undefined
}

object GooglePrivacyDlpV2beta1CryptoKey {
  @scala.inline
  def apply(
    kmsWrapped: GooglePrivacyDlpV2beta1KmsWrappedCryptoKey = null,
    transient: GooglePrivacyDlpV2beta1TransientCryptoKey = null,
    unwrapped: GooglePrivacyDlpV2beta1UnwrappedCryptoKey = null
  ): GooglePrivacyDlpV2beta1CryptoKey = {
    val __obj = js.Dynamic.literal()
    if (kmsWrapped != null) __obj.updateDynamic("kmsWrapped")(kmsWrapped.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    if (unwrapped != null) __obj.updateDynamic("unwrapped")(unwrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CryptoKey]
  }
}

