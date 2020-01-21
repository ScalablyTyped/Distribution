package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RegionInstanceGroupManagers.updatePerInstanceConfigs
  */
@js.native
trait SchemaRegionInstanceGroupManagerUpdateInstanceConfigReq extends js.Object {
  /**
    * The list of per-instance configs to insert or patch on this managed
    * instance group.
    */
  var perInstanceConfigs: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
}

object SchemaRegionInstanceGroupManagerUpdateInstanceConfigReq {
  @scala.inline
  def apply(perInstanceConfigs: js.Array[SchemaPerInstanceConfig] = null): SchemaRegionInstanceGroupManagerUpdateInstanceConfigReq = {
    val __obj = js.Dynamic.literal()
    if (perInstanceConfigs != null) __obj.updateDynamic("perInstanceConfigs")(perInstanceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagerUpdateInstanceConfigReq]
  }
}

