package typings.gapiDotClientDotContainer.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMonitoringServiceRequest extends js.Object {
  /**
    * The monitoring service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; "monitoring.googleapis.com" - the Google Cloud Monitoring service
    * &#42; "none" - no metrics will be exported from the cluster
    */
  var monitoringService: js.UndefOr[String] = js.undefined
}

object SetMonitoringServiceRequest {
  @scala.inline
  def apply(monitoringService: String = null): SetMonitoringServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (monitoringService != null) __obj.updateDynamic("monitoringService")(monitoringService)
    __obj.asInstanceOf[SetMonitoringServiceRequest]
  }
}

