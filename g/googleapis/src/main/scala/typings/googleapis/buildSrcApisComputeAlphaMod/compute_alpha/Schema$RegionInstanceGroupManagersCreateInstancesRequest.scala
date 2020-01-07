package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RegionInstanceGroupManagers.createInstances
  */
@js.native
trait Schema$RegionInstanceGroupManagersCreateInstancesRequest extends js.Object {
  /**
    * [Required] List of specifications of per-instance configs.
    */
  var instances: js.UndefOr[js.Array[Schema$PerInstanceConfig]] = js.native
}

object Schema$RegionInstanceGroupManagersCreateInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[Schema$PerInstanceConfig] = null): Schema$RegionInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionInstanceGroupManagersCreateInstancesRequest]
  }
}

