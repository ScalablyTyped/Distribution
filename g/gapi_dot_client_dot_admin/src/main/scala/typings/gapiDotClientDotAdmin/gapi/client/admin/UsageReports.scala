package typings.gapiDotClientDotAdmin.gapi.client.admin

import typings.gapiDotClientDotAdmin.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReports extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The kind of object. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token for retrieving the next page */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Various application parameter records. */
  var usageReports: js.UndefOr[js.Array[UsageReport]] = js.undefined
  /** Warnings if any. */
  var warnings: js.UndefOr[js.Array[Anon_Code]] = js.undefined
}

object UsageReports {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    usageReports: js.Array[UsageReport] = null,
    warnings: js.Array[Anon_Code] = null
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

