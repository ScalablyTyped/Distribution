package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportDriveDownloadDetails extends js.Object {
  var documentId: js.UndefOr[java.lang.String] = js.undefined
}

object UnsampledReportDriveDownloadDetails {
  @scala.inline
  def apply(documentId: java.lang.String = null): UnsampledReportDriveDownloadDetails = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId)
    __obj.asInstanceOf[UnsampledReportDriveDownloadDetails]
  }
}

