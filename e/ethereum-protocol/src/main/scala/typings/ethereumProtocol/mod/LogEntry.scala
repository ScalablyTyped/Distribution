package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  var address: String
  var blockHash: String | Null
  var blockNumber: Double | Null
  var data: String
  var logIndex: Double | Null
  var topics: js.Array[String]
  var transactionHash: String
  var transactionIndex: Double | Null
}

object LogEntry {
  @scala.inline
  def apply(
    address: String,
    data: String,
    topics: js.Array[String],
    transactionHash: String,
    blockHash: String = null,
    blockNumber: Int | Double = null,
    logIndex: Int | Double = null,
    transactionIndex: Int | Double = null
  ): LogEntry = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash.asInstanceOf[js.Any])
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (logIndex != null) __obj.updateDynamic("logIndex")(logIndex.asInstanceOf[js.Any])
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
}

