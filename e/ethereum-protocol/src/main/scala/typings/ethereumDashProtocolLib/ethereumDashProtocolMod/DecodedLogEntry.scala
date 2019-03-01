package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodedLogEntry[A] extends LogEntry {
  var args: A
  var event: java.lang.String
}

object DecodedLogEntry {
  @scala.inline
  def apply[A](
    address: java.lang.String,
    args: A,
    data: java.lang.String,
    event: java.lang.String,
    topics: js.Array[java.lang.String],
    transactionHash: java.lang.String,
    blockHash: java.lang.String = null,
    blockNumber: scala.Int | scala.Double = null,
    logIndex: scala.Int | scala.Double = null,
    transactionIndex: scala.Int | scala.Double = null
  ): DecodedLogEntry[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("topics")(topics)
    __obj.updateDynamic("transactionHash")(transactionHash)
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash)
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (logIndex != null) __obj.updateDynamic("logIndex")(logIndex.asInstanceOf[js.Any])
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedLogEntry[A]]
  }
}

