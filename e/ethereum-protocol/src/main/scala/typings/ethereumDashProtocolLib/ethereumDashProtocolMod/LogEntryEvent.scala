package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntryEvent extends LogEntry {
  var removed: scala.Boolean
}

object LogEntryEvent {
  @scala.inline
  def apply(
    address: java.lang.String,
    data: java.lang.String,
    removed: scala.Boolean,
    topics: js.Array[java.lang.String],
    transactionHash: java.lang.String,
    blockHash: java.lang.String = null,
    blockNumber: scala.Int | scala.Double = null,
    logIndex: scala.Int | scala.Double = null,
    transactionIndex: scala.Int | scala.Double = null
  ): LogEntryEvent = {
    val __obj = js.Dynamic.literal(address = address, data = data, removed = removed, topics = topics, transactionHash = transactionHash)
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash)
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (logIndex != null) __obj.updateDynamic("logIndex")(logIndex.asInstanceOf[js.Any])
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntryEvent]
  }
}

