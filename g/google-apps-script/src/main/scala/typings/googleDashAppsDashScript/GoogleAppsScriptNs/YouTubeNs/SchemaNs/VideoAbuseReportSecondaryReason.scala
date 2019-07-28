package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportSecondaryReason extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object VideoAbuseReportSecondaryReason {
  @scala.inline
  def apply(id: String = null, label: String = null): VideoAbuseReportSecondaryReason = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[VideoAbuseReportSecondaryReason]
  }
}

