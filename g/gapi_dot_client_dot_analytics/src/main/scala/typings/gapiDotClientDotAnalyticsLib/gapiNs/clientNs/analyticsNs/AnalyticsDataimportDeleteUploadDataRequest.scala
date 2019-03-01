package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsDataimportDeleteUploadDataRequest extends js.Object {
  /** A list of upload UIDs. */
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

