package typings.ethereumjsVm.runBlockMod

import typings.ethereumjsVm.ethereumjsVmNumbers.`0`
import typings.ethereumjsVm.ethereumjsVmNumbers.`1`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TxReceipt extends js.Object {
  
  /**
    * Bloom bitvector
    */
  var bitvector: Buffer = js.native
  
  /**
    * Gas used
    */
  var gasUsed: Buffer = js.native
  
  /**
    * Logs emitted
    */
  var logs: js.Array[_] = js.native
  
  /**
    * Status of transaction, `1` if successful, `0` if an exception occured
    */
  var status: `0` | `1` = js.native
}
object TxReceipt {
  
  @scala.inline
  def apply(bitvector: Buffer, gasUsed: Buffer, logs: js.Array[_], status: `0` | `1`): TxReceipt = {
    val __obj = js.Dynamic.literal(bitvector = bitvector.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxReceipt]
  }
  
  @scala.inline
  implicit class TxReceiptOps[Self <: TxReceipt] (val x: Self) extends AnyVal {
    
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
    def setBitvector(value: Buffer): Self = this.set("bitvector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUsed(value: Buffer): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsVarargs(value: js.Any*): Self = this.set("logs", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[_]): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `0` | `1`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
