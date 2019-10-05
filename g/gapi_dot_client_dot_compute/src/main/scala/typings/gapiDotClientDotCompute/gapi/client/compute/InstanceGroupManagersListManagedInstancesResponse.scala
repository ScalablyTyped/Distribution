package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupManagersListManagedInstancesResponse extends js.Object {
  /** [Output Only] The list of instances in the managed instance group. */
  var managedInstances: js.UndefOr[js.Array[ManagedInstance]] = js.undefined
}

object InstanceGroupManagersListManagedInstancesResponse {
  @scala.inline
  def apply(managedInstances: js.Array[ManagedInstance] = null): InstanceGroupManagersListManagedInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (managedInstances != null) __obj.updateDynamic("managedInstances")(managedInstances)
    __obj.asInstanceOf[InstanceGroupManagersListManagedInstancesResponse]
  }
}

