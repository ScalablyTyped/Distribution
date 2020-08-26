package typings.ethereumjsUtil.signatureMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECDSASignature extends js.Object {
  var r: Buffer = js.native
  var s: Buffer = js.native
  var v: Double = js.native
}

object ECDSASignature {
  @scala.inline
  def apply(r: Buffer, s: Buffer, v: Double): ECDSASignature = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECDSASignature]
  }
  @scala.inline
  implicit class ECDSASignatureOps[Self <: ECDSASignature] (val x: Self) extends AnyVal {
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
    def setR(value: Buffer): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: Buffer): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

