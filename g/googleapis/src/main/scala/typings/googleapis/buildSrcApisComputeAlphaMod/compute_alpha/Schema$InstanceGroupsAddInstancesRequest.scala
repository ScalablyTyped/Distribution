package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupsAddInstancesRequest extends js.Object {
  /**
    * The list of instances to add to the instance group.
    */
  var instances: js.UndefOr[js.Array[Schema$InstanceReference]] = js.native
}

object Schema$InstanceGroupsAddInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[Schema$InstanceReference] = null): Schema$InstanceGroupsAddInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupsAddInstancesRequest]
  }
}

