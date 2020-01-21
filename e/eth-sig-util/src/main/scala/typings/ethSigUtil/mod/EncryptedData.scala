package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedData extends js.Object {
  var ciphertext: String
  var ephemPublicKey: String
  var nonce: String
  var version: EncryptionType
}

object EncryptedData {
  @scala.inline
  def apply(ciphertext: String, ephemPublicKey: String, nonce: String, version: EncryptionType): EncryptedData = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ephemPublicKey = ephemPublicKey.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptedData]
  }
}

