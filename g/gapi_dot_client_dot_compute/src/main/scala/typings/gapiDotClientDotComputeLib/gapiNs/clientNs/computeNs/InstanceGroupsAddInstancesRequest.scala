package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

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
    if (instances != null) __obj.updateDynamic("instances")(instances)
    __obj.asInstanceOf[InstanceGroupsAddInstancesRequest]
  }
}

