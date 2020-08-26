package typings.ethereumCryptography.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recovery extends js.Object {
  var recovery: Double = js.native
  var signature: Buffer = js.native
}

object Recovery {
  @scala.inline
  def apply(recovery: Double, signature: Buffer): Recovery = {
    val __obj = js.Dynamic.literal(recovery = recovery.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recovery]
  }
  @scala.inline
  implicit class RecoveryOps[Self <: Recovery] (val x: Self) extends AnyVal {
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
    def setRecovery(value: Double): Self = this.set("recovery", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: Buffer): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

