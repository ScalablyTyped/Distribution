package typings.ethDashSigDashUtil.ethDashSigDashUtilMod

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
    val __obj = js.Dynamic.literal(ciphertext = ciphertext, ephemPublicKey = ephemPublicKey, nonce = nonce, version = version)
  
    __obj.asInstanceOf[EncryptedData]
  }
}

