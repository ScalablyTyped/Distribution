package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.ethereumDashProtocol.ethereumDashProtocolNumbers.`0`
import typings.ethereumDashProtocol.ethereumDashProtocolNumbers.`1`
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
    val __obj = js.Dynamic.literal(blockHash = blockHash, blockNumber = blockNumber, cumulativeGasUsed = cumulativeGasUsed, from = from, gasUsed = gasUsed, logs = logs, to = to, transactionHash = transactionHash, transactionIndex = transactionIndex)
    if (contractAddress != null) __obj.updateDynamic("contractAddress")(contractAddress)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceiptWithDecodedLogs]
  }
}

