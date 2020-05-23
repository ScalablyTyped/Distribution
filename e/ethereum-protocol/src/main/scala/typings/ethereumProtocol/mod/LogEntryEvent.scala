package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntryEvent extends LogEntry {
  var removed: Boolean
}

object LogEntryEvent {
  @scala.inline
  def apply(
    address: String,
    data: String,
    removed: Boolean,
    topics: js.Array[String],
    transactionHash: String,
    blockHash: String = null,
    blockNumber: Double = null.asInstanceOf[Double],
    logIndex: Double = null.asInstanceOf[Double],
    transactionIndex: Double = null.asInstanceOf[Double]
  ): LogEntryEvent = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntryEvent]
  }
}

