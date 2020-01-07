package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InstanceGroupManagers.createInstances
  */
@js.native
trait Schema$InstanceGroupManagersCreateInstancesRequest extends js.Object {
  /**
    * [Required] List of specifications of per-instance configs.
    */
  var instances: js.UndefOr[js.Array[Schema$PerInstanceConfig]] = js.native
}

object Schema$InstanceGroupManagersCreateInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[Schema$PerInstanceConfig] = null): Schema$InstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagersCreateInstancesRequest]
  }
}

