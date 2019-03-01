package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

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
    blockHash: java.lang.String,
    blockNumber: scala.Double,
    cumulativeGasUsed: scala.Double,
    from: java.lang.String,
    gasUsed: scala.Double,
    logs: js.Array[LogWithDecodedArgs[DecodedLogArgs] | LogEntry],
    to: java.lang.String,
    transactionHash: java.lang.String,
    transactionIndex: scala.Double,
    contractAddress: java.lang.String = null,
    status: java.lang.String | ethereumDashProtocolLib.ethereumDashProtocolLibNumbers.`0` | ethereumDashProtocolLib.ethereumDashProtocolLibNumbers.`1` = null
  ): TransactionReceiptWithDecodedLogs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockHash")(blockHash)
    __obj.updateDynamic("blockNumber")(blockNumber)
    __obj.updateDynamic("cumulativeGasUsed")(cumulativeGasUsed)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("gasUsed")(gasUsed)
    __obj.updateDynamic("logs")(logs)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("transactionHash")(transactionHash)
    __obj.updateDynamic("transactionIndex")(transactionIndex)
    if (contractAddress != null) __obj.updateDynamic("contractAddress")(contractAddress)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceiptWithDecodedLogs]
  }
}

