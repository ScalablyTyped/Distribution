package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.ethereumDashProtocol.ethereumDashProtocolNumbers.`0`
import typings.ethereumDashProtocol.ethereumDashProtocolNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionReceipt extends js.Object {
  var blockHash: String
  var blockNumber: Double
  var contractAddress: String | Null
  var cumulativeGasUsed: Double
  var from: String
  var gasUsed: Double
  var logs: js.Array[LogEntry]
  var status: Null | String | `0` | `1`
  var to: String
  var transactionHash: String
  var transactionIndex: Double
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
    transactionIndex: Double,
    contractAddress: String = null,
    status: String | `0` | `1` = null
  ): TransactionReceipt = {
    val __obj = js.Dynamic.literal(blockHash = blockHash, blockNumber = blockNumber, cumulativeGasUsed = cumulativeGasUsed, from = from, gasUsed = gasUsed, logs = logs, to = to, transactionHash = transactionHash, transactionIndex = transactionIndex)
    if (contractAddress != null) __obj.updateDynamic("contractAddress")(contractAddress)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceipt]
  }
}

