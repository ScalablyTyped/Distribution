package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptResponse extends js.Object {
  /** The encrypted data. */
  var ciphertext: js.UndefOr[String] = js.undefined
  /** The resource name of the CryptoKeyVersion used in encryption. */
  var name: js.UndefOr[String] = js.undefined
}

object EncryptResponse {
  @scala.inline
  def apply(ciphertext: String = null, name: String = null): EncryptResponse = {
    val __obj = js.Dynamic.literal()
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResponse]
  }
}

