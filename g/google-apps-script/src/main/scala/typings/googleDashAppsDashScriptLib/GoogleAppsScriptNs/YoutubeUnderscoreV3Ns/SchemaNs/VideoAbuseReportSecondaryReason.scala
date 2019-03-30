package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportSecondaryReason extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object VideoAbuseReportSecondaryReason {
  @scala.inline
  def apply(id: java.lang.String = null, label: java.lang.String = null): VideoAbuseReportSecondaryReason = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[VideoAbuseReportSecondaryReason]
  }
}

