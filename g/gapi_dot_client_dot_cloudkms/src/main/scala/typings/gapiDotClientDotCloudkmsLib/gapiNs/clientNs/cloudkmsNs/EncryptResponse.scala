package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptResponse extends js.Object {
  /** The encrypted data. */
  var ciphertext: js.UndefOr[java.lang.String] = js.undefined
  /** The resource name of the CryptoKeyVersion used in encryption. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object EncryptResponse {
  @scala.inline
  def apply(ciphertext: java.lang.String = null, name: java.lang.String = null): EncryptResponse = {
    val __obj = js.Dynamic.literal()
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EncryptResponse]
  }
}

