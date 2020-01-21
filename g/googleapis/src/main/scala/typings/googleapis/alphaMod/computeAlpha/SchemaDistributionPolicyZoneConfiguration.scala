package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDistributionPolicyZoneConfiguration extends js.Object {
  /**
    * The URL of the zone. The zone must exist in the region where the managed
    * instance group is located.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaDistributionPolicyZoneConfiguration {
  @scala.inline
  def apply(zone: String = null): SchemaDistributionPolicyZoneConfiguration = {
    val __obj = js.Dynamic.literal()
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDistributionPolicyZoneConfiguration]
  }
}

