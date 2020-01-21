package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message of customer&#39;s listing configuration.
  */
@js.native
trait SchemaCustomerListConfigurationsResponse extends js.Object {
  /**
    * The configurations.
    */
  var configurations: js.UndefOr[js.Array[SchemaConfiguration]] = js.native
}

object SchemaCustomerListConfigurationsResponse {
  @scala.inline
  def apply(configurations: js.Array[SchemaConfiguration] = null): SchemaCustomerListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (configurations != null) __obj.updateDynamic("configurations")(configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomerListConfigurationsResponse]
  }
}

