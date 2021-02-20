package typings.ethereumProtocol.mod

import typings.ethereumProtocol.ethereumProtocolNumbers.`0`
import typings.ethereumProtocol.ethereumProtocolNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionReceipt extends StObject {
  
  var blockHash: String = js.native
  
  var blockNumber: Double = js.native
  
  var contractAddress: String | Null = js.native
  
  var cumulativeGasUsed: Double = js.native
  
  var from: String = js.native
  
  var gasUsed: Double = js.native
  
  var logs: js.Array[LogEntry] = js.native
  
  var status: Null | String | `0` | `1` = js.native
  
  var to: String = js.native
  
  var transactionHash: String = js.native
  
  var transactionIndex: Double = js.native
}
object TransactionReceipt {
  
  @scala.inline
  def apply(
    blockHash: String,
    blockNumber: Double,
    cumulativeGasUsed: Double,
    from: String,
    gasUsed: Double,
    logs: js.Array[LogEntry],
    to: String,
    transactionHash: String,
    transactionIndex: Double
  ): TransactionReceipt = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceipt]
  }
  
  @scala.inline
  implicit class TransactionReceiptMutableBuilder[Self <: TransactionReceipt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContractAddress(value: String): Self = StObject.set(x, "contractAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContractAddressNull: Self = StObject.set(x, "contractAddress", null)
    
    @scala.inline
    def setCumulativeGasUsed(value: Double): Self = StObject.set(x, "cumulativeGasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUsed(value: Double): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogs(value: js.Array[LogEntry]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsVarargs(value: LogEntry*): Self = StObject.set(x, "logs", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String | `0` | `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
  }
}
