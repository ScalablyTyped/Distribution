package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsHlKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportReasonsResource extends js.Object {
  /** Returns a list of abuse reasons that can be used for reporting abusive videos. */
  def list(request: Anon_AltFieldsHlKey): Request[VideoAbuseReportReasonListResponse]
}

object VideoAbuseReportReasonsResource {
  @scala.inline
  def apply(list: Anon_AltFieldsHlKey => Request[VideoAbuseReportReasonListResponse]): VideoAbuseReportReasonsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VideoAbuseReportReasonsResource]
  }
}

