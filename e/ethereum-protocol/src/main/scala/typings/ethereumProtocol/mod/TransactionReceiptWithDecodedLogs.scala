package typings.ethereumProtocol.mod

import typings.ethereumProtocol.ethereumProtocolNumbers.`0`
import typings.ethereumProtocol.ethereumProtocolNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionReceiptWithDecodedLogs extends TransactionReceipt {
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
    transactionIndex: Double,
    contractAddress: String = null,
    status: String | `0` | `1` = null
  ): TransactionReceiptWithDecodedLogs = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any], contractAddress = contractAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceiptWithDecodedLogs]
  }
}

