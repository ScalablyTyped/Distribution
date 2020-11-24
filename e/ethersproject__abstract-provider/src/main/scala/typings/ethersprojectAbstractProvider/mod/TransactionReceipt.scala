package typings.ethersprojectAbstractProvider.mod

import typings.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionReceipt extends js.Object {
  
  var blockHash: String = js.native
  
  var blockNumber: Double = js.native
  
  var byzantium: Boolean = js.native
  
  var confirmations: Double = js.native
  
  var contractAddress: String = js.native
  
  var cumulativeGasUsed: BigNumber = js.native
  
  var from: String = js.native
  
  var gasUsed: BigNumber = js.native
  
  var logs: js.Array[Log] = js.native
  
  var logsBloom: String = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[Double] = js.native
  
  var to: String = js.native
  
  var transactionHash: String = js.native
  
  var transactionIndex: Double = js.native
}
object TransactionReceipt {
  
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
  ): TransactionReceipt = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], byzantium = byzantium.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], contractAddress = contractAddress.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceipt]
  }
  
  @scala.inline
  implicit class TransactionReceiptOps[Self <: TransactionReceipt] (val x: Self) extends AnyVal {
    
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
    def setBlockHash(value: String): Self = this.set("blockHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNumber(value: Double): Self = this.set("blockNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByzantium(value: Boolean): Self = this.set("byzantium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmations(value: Double): Self = this.set("confirmations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContractAddress(value: String): Self = this.set("contractAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeGasUsed(value: BigNumber): Self = this.set("cumulativeGasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUsed(value: BigNumber): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsVarargs(value: Log*): Self = this.set("logs", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[Log]): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsBloom(value: String): Self = this.set("logsBloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionHash(value: String): Self = this.set("transactionHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIndex(value: Double): Self = this.set("transactionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
