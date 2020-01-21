package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDistributionPolicy extends js.Object {
  /**
    * Zones where the regional managed instance group will create and manage
    * instances.
    */
  var zones: js.UndefOr[js.Array[SchemaDistributionPolicyZoneConfiguration]] = js.native
}

object SchemaDistributionPolicy {
  @scala.inline
  def apply(zones: js.Array[SchemaDistributionPolicyZoneConfiguration] = null): SchemaDistributionPolicy = {
    val __obj = js.Dynamic.literal()
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDistributionPolicy]
  }
}

