package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodedLogEntry[A] extends LogEntry {
  var args: A
  var event: String
}

object DecodedLogEntry {
  @scala.inline
  def apply[A](
    address: String,
    args: A,
    data: String,
    event: String,
    topics: js.Array[String],
    transactionHash: String,
    blockHash: String = null,
    blockNumber: Int | Double = null,
    logIndex: Int | Double = null,
    transactionIndex: Int | Double = null
  ): DecodedLogEntry[A] = {
    val __obj = js.Dynamic.literal(address = address, args = args.asInstanceOf[js.Any], data = data, event = event, topics = topics, transactionHash = transactionHash)
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash)
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (logIndex != null) __obj.updateDynamic("logIndex")(logIndex.asInstanceOf[js.Any])
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedLogEntry[A]]
  }
}

