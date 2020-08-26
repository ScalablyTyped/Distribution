package typings.ed25519.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurveKeyPair extends js.Object {
  /**
    * A Buffer containing the private, secret portion of the Curve25519 key.
    */
  var privateKey: Buffer = js.native
  /**
    * A Buffer containing the public portion of the Curve25519 key.
    */
  var publicKey: Buffer = js.native
}

object CurveKeyPair {
  @scala.inline
  def apply(privateKey: Buffer, publicKey: Buffer): CurveKeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveKeyPair]
  }
  @scala.inline
  implicit class CurveKeyPairOps[Self <: CurveKeyPair] (val x: Self) extends AnyVal {
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
    def setPrivateKey(value: Buffer): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: Buffer): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

