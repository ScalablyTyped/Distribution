package typings.ethereumProtocol.mod

import typings.ethereumProtocol.ethereumProtocolNumbers.`0`
import typings.ethereumProtocol.ethereumProtocolNumbers.`1`
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
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    if (contractAddress != null) __obj.updateDynamic("contractAddress")(contractAddress.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceipt]
  }
}

