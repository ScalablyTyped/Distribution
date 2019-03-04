package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawLogEntry extends js.Object {
  var address: java.lang.String
  var blockHash: java.lang.String | scala.Null
  var blockNumber: java.lang.String | scala.Null
  var data: java.lang.String
  var logIndex: java.lang.String | scala.Null
  var topics: js.Array[java.lang.String]
  var transactionHash: java.lang.String
  var transactionIndex: java.lang.String | scala.Null
}

object RawLogEntry {
  @scala.inline
  def apply(
    address: java.lang.String,
    data: java.lang.String,
    topics: js.Array[java.lang.String],
    transactionHash: java.lang.String,
    blockHash: java.lang.String = null,
    blockNumber: java.lang.String = null,
    logIndex: java.lang.String = null,
    transactionIndex: java.lang.String = null
  ): RawLogEntry = {
    val __obj = js.Dynamic.literal(address = address, data = data, topics = topics, transactionHash = transactionHash)
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash)
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber)
    if (logIndex != null) __obj.updateDynamic("logIndex")(logIndex)
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex)
    __obj.asInstanceOf[RawLogEntry]
  }
}

