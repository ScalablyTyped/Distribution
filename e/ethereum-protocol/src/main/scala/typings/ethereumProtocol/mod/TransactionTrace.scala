package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionTrace extends js.Object {
  var gas: Double = js.native
  var returnValue: js.Any = js.native
  var structLogs: js.Array[StructLog] = js.native
}

object TransactionTrace {
  @scala.inline
  def apply(gas: Double, returnValue: js.Any, structLogs: js.Array[StructLog]): TransactionTrace = {
    val __obj = js.Dynamic.literal(gas = gas.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], structLogs = structLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionTrace]
  }
  @scala.inline
  implicit class TransactionTraceOps[Self <: TransactionTrace] (val x: Self) extends AnyVal {
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
    def setGas(value: Double): Self = this.set("gas", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: js.Any): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStructLogsVarargs(value: StructLog*): Self = this.set("structLogs", js.Array(value :_*))
    @scala.inline
    def setStructLogs(value: js.Array[StructLog]): Self = this.set("structLogs", value.asInstanceOf[js.Any])
  }
  
}

