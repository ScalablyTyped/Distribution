package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InstanceGroupManagers.createInstances
  */
@js.native
trait SchemaInstanceGroupManagersCreateInstancesRequest extends js.Object {
  /**
    * [Required] List of specifications of per-instance configs.
    */
  var instances: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
}

object SchemaInstanceGroupManagersCreateInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[SchemaPerInstanceConfig] = null): SchemaInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagersCreateInstancesRequest]
  }
}

