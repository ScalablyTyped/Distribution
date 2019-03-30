package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportCloudStorageDownloadDetails extends js.Object {
  var bucketId: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object UnsampledReportCloudStorageDownloadDetails {
  @scala.inline
  def apply(bucketId: java.lang.String = null, objectId: java.lang.String = null): UnsampledReportCloudStorageDownloadDetails = {
    val __obj = js.Dynamic.literal()
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[UnsampledReportCloudStorageDownloadDetails]
  }
}

