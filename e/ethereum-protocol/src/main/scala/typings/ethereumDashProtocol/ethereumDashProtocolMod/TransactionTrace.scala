package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionTrace extends js.Object {
  var gas: Double
  var returnValue: js.Any
  var structLogs: js.Array[StructLog]
}

object TransactionTrace {
  @scala.inline
  def apply(gas: Double, returnValue: js.Any, structLogs: js.Array[StructLog]): TransactionTrace = {
    val __obj = js.Dynamic.literal(gas = gas.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], structLogs = structLogs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionTrace]
  }
}

