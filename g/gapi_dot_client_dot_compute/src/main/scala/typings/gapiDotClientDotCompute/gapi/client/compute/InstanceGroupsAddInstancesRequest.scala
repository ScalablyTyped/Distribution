package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupsAddInstancesRequest extends js.Object {
  /** The list of instances to add to the instance group. */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.undefined
}

object InstanceGroupsAddInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[InstanceReference] = null): InstanceGroupsAddInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupsAddInstancesRequest]
  }
}

