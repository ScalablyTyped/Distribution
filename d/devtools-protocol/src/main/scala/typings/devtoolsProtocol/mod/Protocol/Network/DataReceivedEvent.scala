package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataReceivedEvent extends js.Object {
  /**
    * Data chunk length.
    */
  var dataLength: integer = js.native
  /**
    * Actual bytes received (might be less than dataLength for compressed encodings).
    */
  var encodedDataLength: integer = js.native
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
}

object DataReceivedEvent {
  @scala.inline
  def apply(dataLength: integer, encodedDataLength: integer, requestId: RequestId, timestamp: MonotonicTime): DataReceivedEvent = {
    val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], encodedDataLength = encodedDataLength.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReceivedEvent]
  }
  @scala.inline
  implicit class DataReceivedEventOps[Self <: DataReceivedEvent] (val x: Self) extends AnyVal {
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
    def setDataLength(value: integer): Self = this.set("dataLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodedDataLength(value: integer): Self = this.set("encodedDataLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

