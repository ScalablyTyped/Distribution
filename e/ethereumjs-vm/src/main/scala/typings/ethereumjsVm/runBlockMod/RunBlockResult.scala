package typings.ethereumjsVm.runBlockMod

import typings.ethereumjsVm.runTxMod.RunTxResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunBlockResult extends js.Object {
  
  /**
    * Receipts generated for transactions in the block
    */
  var receipts: js.Array[TxReceipt] = js.native
  
  /**
    * Results of executing the transactions in the block
    */
  var results: js.Array[RunTxResult] = js.native
}
object RunBlockResult {
  
  @scala.inline
  def apply(receipts: js.Array[TxReceipt], results: js.Array[RunTxResult]): RunBlockResult = {
    val __obj = js.Dynamic.literal(receipts = receipts.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunBlockResult]
  }
  
  @scala.inline
  implicit class RunBlockResultOps[Self <: RunBlockResult] (val x: Self) extends AnyVal {
    
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
    def setReceiptsVarargs(value: TxReceipt*): Self = this.set("receipts", js.Array(value :_*))
    
    @scala.inline
    def setReceipts(value: js.Array[TxReceipt]): Self = this.set("receipts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: RunTxResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[RunTxResult]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
