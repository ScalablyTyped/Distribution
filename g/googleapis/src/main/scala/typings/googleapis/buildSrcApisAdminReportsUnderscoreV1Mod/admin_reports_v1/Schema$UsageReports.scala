package typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a collection of usage reports.
  */
@js.native
trait Schema$UsageReports extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The kind of object.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token for retrieving the next page
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Various application parameter records.
    */
  var usageReports: js.UndefOr[js.Array[Schema$UsageReport]] = js.native
  /**
    * Warnings if any.
    */
  var warnings: js.UndefOr[js.Array[Anon_Code]] = js.native
}

object Schema$UsageReports {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    usageReports: js.Array[Schema$UsageReport] = null,
    warnings: js.Array[Anon_Code] = null
  ): Schema$UsageReports = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (usageReports != null) __obj.updateDynamic("usageReports")(usageReports.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UsageReports]
  }
}

