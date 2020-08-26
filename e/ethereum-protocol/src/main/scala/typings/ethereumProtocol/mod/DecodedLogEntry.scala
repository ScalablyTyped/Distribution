package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodedLogEntry[A] extends LogEntry {
  var args: A = js.native
  var event: String = js.native
}

object DecodedLogEntry {
  @scala.inline
  def apply[A](
    address: String,
    args: A,
    data: String,
    event: String,
    topics: js.Array[String],
    transactionHash: String
  ): DecodedLogEntry[A] = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedLogEntry[A]]
  }
  @scala.inline
  implicit class DecodedLogEntryOps[Self <: DecodedLogEntry[_], A] (val x: Self with DecodedLogEntry[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgs(value: A): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

