package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportSecondaryReason extends js.Object {
  /** The ID of this abuse report secondary reason. */
  var id: js.UndefOr[String] = js.undefined
  /** The localized label for this abuse report secondary reason. */
  var label: js.UndefOr[String] = js.undefined
}

object VideoAbuseReportSecondaryReason {
  @scala.inline
  def apply(id: String = null, label: String = null): VideoAbuseReportSecondaryReason = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoAbuseReportSecondaryReason]
  }
}

