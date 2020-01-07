package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a data encryption key (DEK) (as opposed to a key encryption key
  * (KEK) stored by KMS). When using KMS to wrap/unwrap DEKs, be sure to set an
  * appropriate IAM policy on the KMS CryptoKey (KEK) to ensure an attacker
  * cannot unwrap the data crypto key.
  */
@js.native
trait Schema$GooglePrivacyDlpV2CryptoKey extends js.Object {
  var kmsWrapped: js.UndefOr[Schema$GooglePrivacyDlpV2KmsWrappedCryptoKey] = js.native
  var transient: js.UndefOr[Schema$GooglePrivacyDlpV2TransientCryptoKey] = js.native
  var unwrapped: js.UndefOr[Schema$GooglePrivacyDlpV2UnwrappedCryptoKey] = js.native
}

object Schema$GooglePrivacyDlpV2CryptoKey {
  @scala.inline
  def apply(
    kmsWrapped: Schema$GooglePrivacyDlpV2KmsWrappedCryptoKey = null,
    transient: Schema$GooglePrivacyDlpV2TransientCryptoKey = null,
    unwrapped: Schema$GooglePrivacyDlpV2UnwrappedCryptoKey = null
  ): Schema$GooglePrivacyDlpV2CryptoKey = {
    val __obj = js.Dynamic.literal()
    if (kmsWrapped != null) __obj.updateDynamic("kmsWrapped")(kmsWrapped.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    if (unwrapped != null) __obj.updateDynamic("unwrapped")(unwrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2CryptoKey]
  }
}

