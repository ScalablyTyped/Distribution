package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pseudonymization method that generates surrogates via cryptographic
  * hashing. Uses SHA-256. Outputs a base64-encoded representation of the
  * hashed output (for example,
  * `L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=`).
  */
@js.native
trait Schema$CryptoHashConfig extends js.Object {
  /**
    * An AES 128/192/256 bit key. Causes the hash to be computed based on this
    * key. A default key is generated for each DeidentifyDataset operation and
    * is used wherever crypto_key is not specified.
    */
  var cryptoKey: js.UndefOr[String] = js.native
}

object Schema$CryptoHashConfig {
  @scala.inline
  def apply(cryptoKey: String = null): Schema$CryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    if (cryptoKey != null) __obj.updateDynamic("cryptoKey")(cryptoKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CryptoHashConfig]
  }
}

