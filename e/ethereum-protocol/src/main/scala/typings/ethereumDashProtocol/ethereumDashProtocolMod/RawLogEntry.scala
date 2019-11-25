package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawLogEntry extends js.Object {
  var address: String
  var blockHash: String | Null
  var blockNumber: String | Null
  var data: String
  var logIndex: String | Null
  var topics: js.Array[String]
  var transactionHash: String
  var transactionIndex: String | Null
}

object RawLogEntry {
  @scala.inline
  def apply(
    address: String,
    data: String,
    topics: js.Array[String],
    transactionHash: String,
    blockHash: String = null,
    blockNumber: String = null,
    logIndex: String = null,
    transactionIndex: String = null
  ): RawLogEntry = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash.asInstanceOf[js.Any])
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (logIndex != null) __obj.updateDynamic("logIndex")(logIndex.asInstanceOf[js.Any])
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawLogEntry]
  }
}

