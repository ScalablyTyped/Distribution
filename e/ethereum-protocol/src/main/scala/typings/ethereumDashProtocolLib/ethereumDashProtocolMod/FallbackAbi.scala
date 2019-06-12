package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FallbackAbi extends FunctionAbi {
  var payable: scala.Boolean
  var `type`: ethereumDashProtocolLib.ethereumDashProtocolMod.AbiType.Fallback
}

object FallbackAbi {
  @scala.inline
  def apply(payable: scala.Boolean, `type`: ethereumDashProtocolLib.ethereumDashProtocolMod.AbiType.Fallback): FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FallbackAbi]
  }
}

