package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoggingServiceRequest extends js.Object {
  /**
    * The logging service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; "logging.googleapis.com" - the Google Cloud Logging service
    * &#42; "none" - no metrics will be exported from the cluster
    */
  var loggingService: js.UndefOr[String] = js.native
}

object SetLoggingServiceRequest {
  @scala.inline
  def apply(): SetLoggingServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetLoggingServiceRequest]
  }
  @scala.inline
  implicit class SetLoggingServiceRequestOps[Self <: SetLoggingServiceRequest] (val x: Self) extends AnyVal {
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
    def setLoggingService(value: String): Self = this.set("loggingService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingService: Self = this.set("loggingService", js.undefined)
  }
  
}

