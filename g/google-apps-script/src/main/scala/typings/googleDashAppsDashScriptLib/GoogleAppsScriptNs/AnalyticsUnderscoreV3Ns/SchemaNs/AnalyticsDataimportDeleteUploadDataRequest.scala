package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsDataimportDeleteUploadDataRequest extends js.Object {
  var customDataImportUids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AnalyticsDataimportDeleteUploadDataRequest {
  @scala.inline
  def apply(customDataImportUids: js.Array[java.lang.String] = null): AnalyticsDataimportDeleteUploadDataRequest = {
    val __obj = js.Dynamic.literal()
    if (customDataImportUids != null) __obj.updateDynamic("customDataImportUids")(customDataImportUids)
    __obj.asInstanceOf[AnalyticsDataimportDeleteUploadDataRequest]
  }
}

