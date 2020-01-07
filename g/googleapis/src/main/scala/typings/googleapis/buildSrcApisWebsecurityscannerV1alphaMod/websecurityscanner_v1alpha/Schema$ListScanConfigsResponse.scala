package typings.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListScanConfigs` method.
  */
@js.native
trait Schema$ListScanConfigsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of ScanConfigs returned.
    */
  var scanConfigs: js.UndefOr[js.Array[Schema$ScanConfig]] = js.native
}

object Schema$ListScanConfigsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, scanConfigs: js.Array[Schema$ScanConfig] = null): Schema$ListScanConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (scanConfigs != null) __obj.updateDynamic("scanConfigs")(scanConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListScanConfigsResponse]
  }
}

