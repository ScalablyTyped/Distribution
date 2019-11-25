package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

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
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsampledReportCloudStorageDownloadDetails]
  }
}

