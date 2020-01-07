package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request template for the delete upload data request.
  */
@js.native
trait Schema$AnalyticsDataimportDeleteUploadDataRequest extends js.Object {
  /**
    * A list of upload UIDs.
    */
  var customDataImportUids: js.UndefOr[js.Array[String]] = js.native
}

object Schema$AnalyticsDataimportDeleteUploadDataRequest {
  @scala.inline
  def apply(customDataImportUids: js.Array[String] = null): Schema$AnalyticsDataimportDeleteUploadDataRequest = {
    val __obj = js.Dynamic.literal()
    if (customDataImportUids != null) __obj.updateDynamic("customDataImportUids")(customDataImportUids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyticsDataimportDeleteUploadDataRequest]
  }
}

