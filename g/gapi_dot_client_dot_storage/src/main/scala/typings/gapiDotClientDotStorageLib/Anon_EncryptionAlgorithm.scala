package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionAlgorithm extends js.Object {
  /** The encryption algorithm. */
  var encryptionAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /** SHA256 hash value of the encryption key. */
  var keySha256: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EncryptionAlgorithm {
  @scala.inline
  def apply(encryptionAlgorithm: java.lang.String = null, keySha256: java.lang.String = null): Anon_EncryptionAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (encryptionAlgorithm != null) __obj.updateDynamic("encryptionAlgorithm")(encryptionAlgorithm)
    if (keySha256 != null) __obj.updateDynamic("keySha256")(keySha256)
    __obj.asInstanceOf[Anon_EncryptionAlgorithm]
  }
}

