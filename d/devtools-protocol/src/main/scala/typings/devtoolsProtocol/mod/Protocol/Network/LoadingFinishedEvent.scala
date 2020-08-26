package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingFinishedEvent extends js.Object {
  /**
    * Total number of bytes received for this request.
    */
  var encodedDataLength: Double = js.native
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  /**
    * Set when 1) response was blocked by Cross-Origin Read Blocking and also
    * 2) this needs to be reported to the DevTools console.
    */
  var shouldReportCorbBlocking: js.UndefOr[Boolean] = js.native
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
}

object LoadingFinishedEvent {
  @scala.inline
  def apply(encodedDataLength: Double, requestId: RequestId, timestamp: MonotonicTime): LoadingFinishedEvent = {
    val __obj = js.Dynamic.literal(encodedDataLength = encodedDataLength.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingFinishedEvent]
  }
  @scala.inline
  implicit class LoadingFinishedEventOps[Self <: LoadingFinishedEvent] (val x: Self) extends AnyVal {
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
    def setEncodedDataLength(value: Double): Self = this.set("encodedDataLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldReportCorbBlocking(value: Boolean): Self = this.set("shouldReportCorbBlocking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldReportCorbBlocking: Self = this.set("shouldReportCorbBlocking", js.undefined)
  }
  
}

