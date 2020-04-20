package typings.ethLightwallet.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECSignatureBuffer extends js.Object {
  var r: Buffer
  var s: Buffer
  var v: Double
}

object ECSignatureBuffer {
  @scala.inline
  def apply(r: Buffer, s: Buffer, v: Double): ECSignatureBuffer = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECSignatureBuffer]
  }
}

