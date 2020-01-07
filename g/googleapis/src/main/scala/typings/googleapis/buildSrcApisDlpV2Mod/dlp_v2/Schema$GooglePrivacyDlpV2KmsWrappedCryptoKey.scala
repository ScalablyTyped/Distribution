package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Include to use an existing data crypto key wrapped by KMS. The wrapped key
  * must be a 128/192/256 bit key. Authorization requires the following IAM
  * permissions when sending a request to perform a crypto transformation using
  * a kms-wrapped crypto key: dlp.kms.encrypt
  */
@js.native
trait Schema$GooglePrivacyDlpV2KmsWrappedCryptoKey extends js.Object {
  /**
    * The resource name of the KMS CryptoKey to use for unwrapping. [required]
    */
  var cryptoKeyName: js.UndefOr[String] = js.native
  /**
    * The wrapped data crypto key. [required]
    */
  var wrappedKey: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2KmsWrappedCryptoKey {
  @scala.inline
  def apply(cryptoKeyName: String = null, wrappedKey: String = null): Schema$GooglePrivacyDlpV2KmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyName != null) __obj.updateDynamic("cryptoKeyName")(cryptoKeyName.asInstanceOf[js.Any])
    if (wrappedKey != null) __obj.updateDynamic("wrappedKey")(wrappedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2KmsWrappedCryptoKey]
  }
}

