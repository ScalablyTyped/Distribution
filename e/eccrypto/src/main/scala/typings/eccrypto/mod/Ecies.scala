package typings.eccrypto.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ecies extends js.Object {
  var ciphertext: Buffer = js.native
  var ephemPublicKey: Buffer = js.native
  var iv: Buffer = js.native
  var mac: Buffer = js.native
}

object Ecies {
  @scala.inline
  def apply(ciphertext: Buffer, ephemPublicKey: Buffer, iv: Buffer, mac: Buffer): Ecies = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ephemPublicKey = ephemPublicKey.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ecies]
  }
  @scala.inline
  implicit class EciesOps[Self <: Ecies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCiphertext(value: Buffer): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    @scala.inline
    def setEphemPublicKey(value: Buffer): Self = this.set("ephemPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIv(value: Buffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def setMac(value: Buffer): Self = this.set("mac", value.asInstanceOf[js.Any])
  }
  
}

