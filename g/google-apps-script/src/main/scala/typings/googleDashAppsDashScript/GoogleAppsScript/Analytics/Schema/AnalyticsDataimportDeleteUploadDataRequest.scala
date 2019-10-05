package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsDataimportDeleteUploadDataRequest extends js.Object {
  var customDataImportUids: js.UndefOr[js.Array[String]] = js.undefined
}

object AnalyticsDataimportDeleteUploadDataRequest {
  @scala.inline
  def apply(customDataImportUids: js.Array[String] = null): AnalyticsDataimportDeleteUploadDataRequest = {
    val __obj = js.Dynamic.literal()
    if (customDataImportUids != null) __obj.updateDynamic("customDataImportUids")(customDataImportUids)
    __obj.asInstanceOf[AnalyticsDataimportDeleteUploadDataRequest]
  }
}

