package typings.eccrypto.eccryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ecies extends js.Object {
  var ciphertext: Buffer
  var ephemPublicKey: Buffer
  var iv: Buffer
  var mac: Buffer
}

object Ecies {
  @scala.inline
  def apply(ciphertext: Buffer, ephemPublicKey: Buffer, iv: Buffer, mac: Buffer): Ecies = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ephemPublicKey = ephemPublicKey.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ecies]
  }
}

