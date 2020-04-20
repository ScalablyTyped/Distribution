package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportReasonsResource extends js.Object {
  /** Returns a list of abuse reasons that can be used for reporting abusive videos. */
  def list(request: AnonUserIp): Request_[VideoAbuseReportReasonListResponse]
}

object VideoAbuseReportReasonsResource {
  @scala.inline
  def apply(list: AnonUserIp => Request_[VideoAbuseReportReasonListResponse]): VideoAbuseReportReasonsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VideoAbuseReportReasonsResource]
  }
}

