package typings.ethereumProtocol.mod

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
    blockNumber: Double = null.asInstanceOf[Double],
    logIndex: Double = null.asInstanceOf[Double],
    transactionIndex: Double = null.asInstanceOf[Double]
  ): DecodedLogEntry[A] = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedLogEntry[A]]
  }
}

