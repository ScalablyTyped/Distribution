package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupsRemoveInstancesRequest extends js.Object {
  /** The list of instances to remove from the instance group. */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.undefined
}

object InstanceGroupsRemoveInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[InstanceReference] = null): InstanceGroupsRemoveInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances)
    __obj.asInstanceOf[InstanceGroupsRemoveInstancesRequest]
  }
}

