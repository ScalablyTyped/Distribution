package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RegionInstanceGroupManagers.createInstances
  */
@js.native
trait SchemaRegionInstanceGroupManagersCreateInstancesRequest extends js.Object {
  /**
    * [Required] List of specifications of per-instance configs.
    */
  var instances: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
}

object SchemaRegionInstanceGroupManagersCreateInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[SchemaPerInstanceConfig] = null): SchemaRegionInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersCreateInstancesRequest]
  }
}

