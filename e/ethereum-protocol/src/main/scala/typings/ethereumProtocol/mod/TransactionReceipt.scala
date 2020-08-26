package typings.ethereumProtocol.mod

import typings.ethereumProtocol.ethereumProtocolNumbers.`0`
import typings.ethereumProtocol.ethereumProtocolNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionReceipt extends js.Object {
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
    def setCumulativeGasUsed(value: Double): Self = this.set("cumulativeGasUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasUsed(value: Double): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogsVarargs(value: LogEntry*): Self = this.set("logs", js.Array(value :_*))
    @scala.inline
    def setLogs(value: js.Array[LogEntry]): Self = this.set("logs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionHash(value: String): Self = this.set("transactionHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionIndex(value: Double): Self = this.set("transactionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setContractAddress(value: String): Self = this.set("contractAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setContractAddressNull: Self = this.set("contractAddress", null)
    @scala.inline
    def setStatus(value: String | `0` | `1`): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

