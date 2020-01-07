package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupsRemoveInstancesRequest extends js.Object {
  /**
    * The list of instances to remove from the instance group.
    */
  var instances: js.UndefOr[js.Array[Schema$InstanceReference]] = js.native
}

object Schema$InstanceGroupsRemoveInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[Schema$InstanceReference] = null): Schema$InstanceGroupsRemoveInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupsRemoveInstancesRequest]
  }
}

