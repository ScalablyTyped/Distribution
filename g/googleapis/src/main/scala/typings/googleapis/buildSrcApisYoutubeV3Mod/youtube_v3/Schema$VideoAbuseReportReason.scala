package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A videoAbuseReportReason resource identifies a reason that a video could be
  * reported as abusive. Video abuse report reasons are used with
  * video.ReportAbuse.
  */
@js.native
trait Schema$VideoAbuseReportReason extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID of this abuse report reason.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#videoAbuseReportReason&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the abuse report reason.
    */
  var snippet: js.UndefOr[Schema$VideoAbuseReportReasonSnippet] = js.native
}

object Schema$VideoAbuseReportReason {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Schema$VideoAbuseReportReasonSnippet = null
  ): Schema$VideoAbuseReportReason = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoAbuseReportReason]
  }
}

