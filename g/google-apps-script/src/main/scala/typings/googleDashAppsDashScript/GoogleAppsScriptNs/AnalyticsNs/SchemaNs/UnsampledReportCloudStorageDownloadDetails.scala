package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportCloudStorageDownloadDetails extends js.Object {
  var bucketId: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
}

object UnsampledReportCloudStorageDownloadDetails {
  @scala.inline
  def apply(bucketId: String = null, objectId: String = null): UnsampledReportCloudStorageDownloadDetails = {
    val __obj = js.Dynamic.literal()
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[UnsampledReportCloudStorageDownloadDetails]
  }
}

