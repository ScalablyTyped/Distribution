package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClientAdmin.anon.Code
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
  var warnings: js.UndefOr[js.Array[Code]] = js.undefined
}

object UsageReports {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    usageReports: js.Array[UsageReport] = null,
    warnings: js.Array[Code] = null
  ): UsageReports = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (usageReports != null) __obj.updateDynamic("usageReports")(usageReports.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageReports]
  }
}

