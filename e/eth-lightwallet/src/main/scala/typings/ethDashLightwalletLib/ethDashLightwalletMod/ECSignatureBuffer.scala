package typings
package ethDashLightwalletLib.ethDashLightwalletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECSignatureBuffer extends js.Object {
  var r: nodeLib.Buffer
  var s: nodeLib.Buffer
  var v: scala.Double
}

object ECSignatureBuffer {
  @scala.inline
  def apply(r: nodeLib.Buffer, s: nodeLib.Buffer, v: scala.Double): ECSignatureBuffer = {
    val __obj = js.Dynamic.literal(r = r, s = s, v = v)
  
    __obj.asInstanceOf[ECSignatureBuffer]
  }
}

