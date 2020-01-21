package typings.ethereumjsUtil.signatureMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECDSASignature extends js.Object {
  var r: Buffer
  var s: Buffer
  var v: Double
}

object ECDSASignature {
  @scala.inline
  def apply(r: Buffer, s: Buffer, v: Double): ECDSASignature = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ECDSASignature]
  }
}

