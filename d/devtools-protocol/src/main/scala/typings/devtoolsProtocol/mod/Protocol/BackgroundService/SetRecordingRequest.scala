package typings.devtoolsProtocol.mod.Protocol.BackgroundService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRecordingRequest extends js.Object {
  var service: ServiceName = js.native
  var shouldRecord: Boolean = js.native
}

object SetRecordingRequest {
  @scala.inline
  def apply(service: ServiceName, shouldRecord: Boolean): SetRecordingRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], shouldRecord = shouldRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRecordingRequest]
  }
  @scala.inline
  implicit class SetRecordingRequestOps[Self <: SetRecordingRequest] (val x: Self) extends AnyVal {
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
    def setService(value: ServiceName): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldRecord(value: Boolean): Self = this.set("shouldRecord", value.asInstanceOf[js.Any])
  }
  
}

