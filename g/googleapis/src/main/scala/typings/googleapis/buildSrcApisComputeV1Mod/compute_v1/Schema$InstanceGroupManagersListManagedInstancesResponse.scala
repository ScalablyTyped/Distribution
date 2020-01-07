package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupManagersListManagedInstancesResponse extends js.Object {
  /**
    * [Output Only] The list of instances in the managed instance group.
    */
  var managedInstances: js.UndefOr[js.Array[Schema$ManagedInstance]] = js.native
}

object Schema$InstanceGroupManagersListManagedInstancesResponse {
  @scala.inline
  def apply(managedInstances: js.Array[Schema$ManagedInstance] = null): Schema$InstanceGroupManagersListManagedInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (managedInstances != null) __obj.updateDynamic("managedInstances")(managedInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagersListManagedInstancesResponse]
  }
}

