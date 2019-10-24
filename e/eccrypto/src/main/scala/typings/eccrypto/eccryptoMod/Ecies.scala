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
    val __obj = js.Dynamic.literal(ciphertext = ciphertext, ephemPublicKey = ephemPublicKey, iv = iv, mac = mac)
  
    __obj.asInstanceOf[Ecies]
  }
}

