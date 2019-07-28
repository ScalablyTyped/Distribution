package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.ethereumDashProtocol.ethereumDashProtocolMod.AbiType.Fallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FallbackAbi extends FunctionAbi {
  var payable: Boolean
  var `type`: Fallback
}

object FallbackAbi {
  @scala.inline
  def apply(payable: Boolean, `type`: Fallback): FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FallbackAbi]
  }
}

