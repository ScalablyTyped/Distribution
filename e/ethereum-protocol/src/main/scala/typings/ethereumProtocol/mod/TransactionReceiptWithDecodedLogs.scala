package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionReceiptWithDecodedLogs
  extends StObject
     with TransactionReceipt {
  
  @JSName("logs")
  var logs_TransactionReceiptWithDecodedLogs: js.Array[LogWithDecodedArgs[DecodedLogArgs] | LogEntry]
}
object TransactionReceiptWithDecodedLogs {
  
  @scala.inline
  def apply(
    blockHash: String,
    blockNumber: Double,
    cumulativeGasUsed: Double,
    from: String,
    gasUsed: Double,
    logs: js.Array[LogWithDecodedArgs[DecodedLogArgs] | LogEntry],
    to: String,
    transactionHash: String,
    transactionIndex: Double
  ): TransactionReceiptWithDecodedLogs = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any], contractAddress = null, status = null)
    __obj.asInstanceOf[TransactionReceiptWithDecodedLogs]
  }
  
  @scala.inline
  implicit class TransactionReceiptWithDecodedLogsMutableBuilder[Self <: TransactionReceiptWithDecodedLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogs(value: js.Array[LogWithDecodedArgs[DecodedLogArgs] | LogEntry]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsVarargs(value: (LogWithDecodedArgs[DecodedLogArgs] | LogEntry)*): Self = StObject.set(x, "logs", js.Array(value :_*))
  }
}
