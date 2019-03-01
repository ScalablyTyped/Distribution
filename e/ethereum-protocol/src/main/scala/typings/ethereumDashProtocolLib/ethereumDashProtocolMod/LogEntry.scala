package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  var address: java.lang.String
  var blockHash: java.lang.String | scala.Null
  var blockNumber: scala.Double | scala.Null
  var data: java.lang.String
  var logIndex: scala.Double | scala.Null
  var topics: js.Array[java.lang.String]
  var transactionHash: java.lang.String
  var transactionIndex: scala.Double | scala.Null
}

object LogEntry {
  @scala.inline
  def apply(
    address: java.lang.String,
    data: java.lang.String,
    topics: js.Array[java.lang.String],
    transactionHash: java.lang.String,
    blockHash: java.lang.String = null,
    blockNumber: scala.Int | scala.Double = null,
    logIndex: scala.Int | scala.Double = null,
    transactionIndex: scala.Int | scala.Double = null
  ): LogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("topics")(topics)
    __obj.updateDynamic("transactionHash")(transactionHash)
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash)
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (logIndex != null) __obj.updateDynamic("logIndex")(logIndex.asInstanceOf[js.Any])
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
}

