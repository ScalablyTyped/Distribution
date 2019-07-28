package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportReasonListResponse extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.undefined
  /** A list of valid abuse reasons that are used with video.ReportAbuse. */
  var items: js.UndefOr[js.Array[VideoAbuseReportReason]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#videoAbuseReportReasonListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.undefined
}

object VideoAbuseReportReasonListResponse {
  @scala.inline
  def apply(
    etag: String = null,
    eventId: String = null,
    items: js.Array[VideoAbuseReportReason] = null,
    kind: String = null,
    visitorId: String = null
  ): VideoAbuseReportReasonListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId)
    __obj.asInstanceOf[VideoAbuseReportReasonListResponse]
  }
}

