package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportReasonsResource extends js.Object {
  /** Returns a list of abuse reasons that can be used for reporting abusive videos. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlKey): gapiDotClientLib.gapiNs.clientNs.Request[VideoAbuseReportReasonListResponse]
}

object VideoAbuseReportReasonsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlKey => gapiDotClientLib.gapiNs.clientNs.Request[VideoAbuseReportReasonListResponse]
  ): VideoAbuseReportReasonsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VideoAbuseReportReasonsResource]
  }
}

