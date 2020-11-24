package typings.ethersprojectProviders.formatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formats extends js.Object {
  
  var block: FormatFuncs = js.native
  
  var blockWithTransactions: FormatFuncs = js.native
  
  var filter: FormatFuncs = js.native
  
  var filterLog: FormatFuncs = js.native
  
  var receipt: FormatFuncs = js.native
  
  var receiptLog: FormatFuncs = js.native
  
  var transaction: FormatFuncs = js.native
  
  var transactionRequest: FormatFuncs = js.native
}
object Formats {
  
  @scala.inline
  def apply(
    block: FormatFuncs,
    blockWithTransactions: FormatFuncs,
    filter: FormatFuncs,
    filterLog: FormatFuncs,
    receipt: FormatFuncs,
    receiptLog: FormatFuncs,
    transaction: FormatFuncs,
    transactionRequest: FormatFuncs
  ): Formats = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], blockWithTransactions = blockWithTransactions.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterLog = filterLog.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any], receiptLog = receiptLog.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any], transactionRequest = transactionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  
  @scala.inline
  implicit class FormatsOps[Self <: Formats] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: FormatFuncs): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockWithTransactions(value: FormatFuncs): Self = this.set("blockWithTransactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: FormatFuncs): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterLog(value: FormatFuncs): Self = this.set("filterLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt(value: FormatFuncs): Self = this.set("receipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptLog(value: FormatFuncs): Self = this.set("receiptLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction(value: FormatFuncs): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionRequest(value: FormatFuncs): Self = this.set("transactionRequest", value.asInstanceOf[js.Any])
  }
}
