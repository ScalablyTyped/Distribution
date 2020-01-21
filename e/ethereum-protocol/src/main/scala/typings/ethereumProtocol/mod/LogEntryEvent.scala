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
    blockNumber: Int | Double = null,
    logIndex: Int | Double = null,
    transactionIndex: Int | Double = null
  ): LogEntryEvent = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash.asInstanceOf[js.Any])
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (logIndex != null) __obj.updateDynamic("logIndex")(logIndex.asInstanceOf[js.Any])
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntryEvent]
  }
}

