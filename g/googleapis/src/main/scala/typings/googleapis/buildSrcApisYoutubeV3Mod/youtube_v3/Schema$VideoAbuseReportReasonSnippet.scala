package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a video category, such as its localized title.
  */
@js.native
trait Schema$VideoAbuseReportReasonSnippet extends js.Object {
  /**
    * The localized label belonging to this abuse report reason.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The secondary reasons associated with this reason, if any are available.
    * (There might be 0 or more.)
    */
  var secondaryReasons: js.UndefOr[js.Array[Schema$VideoAbuseReportSecondaryReason]] = js.native
}

object Schema$VideoAbuseReportReasonSnippet {
  @scala.inline
  def apply(label: String = null, secondaryReasons: js.Array[Schema$VideoAbuseReportSecondaryReason] = null): Schema$VideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (secondaryReasons != null) __obj.updateDynamic("secondaryReasons")(secondaryReasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoAbuseReportReasonSnippet]
  }
}

