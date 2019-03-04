package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FallbackAbi extends FunctionAbi {
  var payable: scala.Boolean
  var `type`: AbiType
}

object FallbackAbi {
  @scala.inline
  def apply(payable: scala.Boolean, `type`: AbiType): FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FallbackAbi]
  }
}

