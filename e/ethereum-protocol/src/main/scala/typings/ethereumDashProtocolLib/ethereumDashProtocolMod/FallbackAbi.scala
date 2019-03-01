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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payable")(payable)
    __obj.asInstanceOf[FallbackAbi]
  }
}

