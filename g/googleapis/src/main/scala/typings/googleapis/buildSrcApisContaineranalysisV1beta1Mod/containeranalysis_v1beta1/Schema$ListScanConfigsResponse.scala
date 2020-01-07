package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing scan configurations.
  */
@js.native
trait Schema$ListScanConfigsResponse extends js.Object {
  /**
    * The next pagination token in the list response. It should be used as
    * `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The scan configurations requested.
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

