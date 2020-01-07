package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DistributionPolicy extends js.Object {
  /**
    * Zones where the regional managed instance group will create and manage
    * instances.
    */
  var zones: js.UndefOr[js.Array[Schema$DistributionPolicyZoneConfiguration]] = js.native
}

object Schema$DistributionPolicy {
  @scala.inline
  def apply(zones: js.Array[Schema$DistributionPolicyZoneConfiguration] = null): Schema$DistributionPolicy = {
    val __obj = js.Dynamic.literal()
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DistributionPolicy]
  }
}

