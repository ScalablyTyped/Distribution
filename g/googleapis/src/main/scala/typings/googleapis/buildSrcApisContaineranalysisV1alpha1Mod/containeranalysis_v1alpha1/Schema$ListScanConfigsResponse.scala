package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of scan configs for the project.
  */
@js.native
trait Schema$ListScanConfigsResponse extends js.Object {
  /**
    * A page token to pass in order to get more scan configs.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The set of scan configs.
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

