package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReportsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReports extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var usageReports: js.UndefOr[js.Array[UsageReport]] = js.undefined
  var warnings: js.UndefOr[js.Array[UsageReportsWarnings]] = js.undefined
}

object UsageReports {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    usageReports: js.Array[UsageReport] = null,
    warnings: js.Array[UsageReportsWarnings] = null
  ): UsageReports = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (usageReports != null) __obj.updateDynamic("usageReports")(usageReports)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[UsageReports]
  }
}

