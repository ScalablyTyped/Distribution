package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VideoAbuseReportSecondaryReason extends js.Object {
  /**
    * The ID of this abuse report secondary reason.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The localized label for this abuse report secondary reason.
    */
  var label: js.UndefOr[String] = js.native
}

object Schema$VideoAbuseReportSecondaryReason {
  @scala.inline
  def apply(id: String = null, label: String = null): Schema$VideoAbuseReportSecondaryReason = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoAbuseReportSecondaryReason]
  }
}

