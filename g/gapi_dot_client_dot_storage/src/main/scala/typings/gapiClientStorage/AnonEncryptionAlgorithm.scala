package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncryptionAlgorithm extends js.Object {
  /** The encryption algorithm. */
  var encryptionAlgorithm: js.UndefOr[String] = js.undefined
  /** SHA256 hash value of the encryption key. */
  var keySha256: js.UndefOr[String] = js.undefined
}

object AnonEncryptionAlgorithm {
  @scala.inline
  def apply(encryptionAlgorithm: String = null, keySha256: String = null): AnonEncryptionAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (encryptionAlgorithm != null) __obj.updateDynamic("encryptionAlgorithm")(encryptionAlgorithm.asInstanceOf[js.Any])
    if (keySha256 != null) __obj.updateDynamic("keySha256")(keySha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncryptionAlgorithm]
  }
}

