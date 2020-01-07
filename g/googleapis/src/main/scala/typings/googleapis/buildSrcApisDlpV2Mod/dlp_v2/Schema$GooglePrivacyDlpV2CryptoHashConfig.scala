package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pseudonymization method that generates surrogates via cryptographic
  * hashing. Uses SHA-256. The key size must be either 32 or 64 bytes. Outputs
  * a base64 encoded representation of the hashed output (for example,
  * L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=). Currently, only string and
  * integer values can be hashed. See
  * https://cloud.google.com/dlp/docs/pseudonymization to learn more.
  */
@js.native
trait Schema$GooglePrivacyDlpV2CryptoHashConfig extends js.Object {
  /**
    * The key used by the hash function.
    */
  var cryptoKey: js.UndefOr[Schema$GooglePrivacyDlpV2CryptoKey] = js.native
}

object Schema$GooglePrivacyDlpV2CryptoHashConfig {
  @scala.inline
  def apply(cryptoKey: Schema$GooglePrivacyDlpV2CryptoKey = null): Schema$GooglePrivacyDlpV2CryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    if (cryptoKey != null) __obj.updateDynamic("cryptoKey")(cryptoKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2CryptoHashConfig]
  }
}

