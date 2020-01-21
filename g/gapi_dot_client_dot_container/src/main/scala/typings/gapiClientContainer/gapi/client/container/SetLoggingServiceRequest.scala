package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLoggingServiceRequest extends js.Object {
  /**
    * The logging service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; "logging.googleapis.com" - the Google Cloud Logging service
    * &#42; "none" - no metrics will be exported from the cluster
    */
  var loggingService: js.UndefOr[String] = js.undefined
}

object SetLoggingServiceRequest {
  @scala.inline
  def apply(loggingService: String = null): SetLoggingServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (loggingService != null) __obj.updateDynamic("loggingService")(loggingService.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoggingServiceRequest]
  }
}

