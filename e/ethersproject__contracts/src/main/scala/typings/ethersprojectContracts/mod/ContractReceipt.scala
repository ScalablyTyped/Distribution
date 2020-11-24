package typings.ethersprojectContracts.mod

import typings.ethersprojectAbstractProvider.mod.Log
import typings.ethersprojectAbstractProvider.mod.TransactionReceipt
import typings.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContractReceipt extends TransactionReceipt {
  
  var events: js.UndefOr[js.Array[Event]] = js.native
}
object ContractReceipt {
  
  @scala.inline
  def apply(
    blockHash: String,
    blockNumber: Double,
    byzantium: Boolean,
    confirmations: Double,
    contractAddress: String,
    cumulativeGasUsed: BigNumber,
    from: String,
    gasUsed: BigNumber,
    logs: js.Array[Log],
    logsBloom: String,
    to: String,
    transactionHash: String,
    transactionIndex: Double
  ): ContractReceipt = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], byzantium = byzantium.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], contractAddress = contractAddress.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractReceipt]
  }
  
  @scala.inline
  implicit class ContractReceiptOps[Self <: ContractReceipt] (val x: Self) extends AnyVal {
    
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
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
  }
}
