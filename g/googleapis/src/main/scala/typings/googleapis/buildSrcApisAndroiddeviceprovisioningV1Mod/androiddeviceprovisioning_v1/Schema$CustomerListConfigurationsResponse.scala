package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message of customer&#39;s listing configuration.
  */
@js.native
trait Schema$CustomerListConfigurationsResponse extends js.Object {
  /**
    * The configurations.
    */
  var configurations: js.UndefOr[js.Array[Schema$Configuration]] = js.native
}

object Schema$CustomerListConfigurationsResponse {
  @scala.inline
  def apply(configurations: js.Array[Schema$Configuration] = null): Schema$CustomerListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (configurations != null) __obj.updateDynamic("configurations")(configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerListConfigurationsResponse]
  }
}

