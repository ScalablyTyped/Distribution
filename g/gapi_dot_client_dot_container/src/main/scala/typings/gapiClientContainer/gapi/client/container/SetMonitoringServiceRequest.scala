package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetMonitoringServiceRequest extends js.Object {
  /**
    * The monitoring service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; "monitoring.googleapis.com" - the Google Cloud Monitoring service
    * &#42; "none" - no metrics will be exported from the cluster
    */
  var monitoringService: js.UndefOr[String] = js.native
}

object SetMonitoringServiceRequest {
  @scala.inline
  def apply(): SetMonitoringServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetMonitoringServiceRequest]
  }
  @scala.inline
  implicit class SetMonitoringServiceRequestOps[Self <: SetMonitoringServiceRequest] (val x: Self) extends AnyVal {
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
    def setMonitoringService(value: String): Self = this.set("monitoringService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringService: Self = this.set("monitoringService", js.undefined)
  }
  
}

