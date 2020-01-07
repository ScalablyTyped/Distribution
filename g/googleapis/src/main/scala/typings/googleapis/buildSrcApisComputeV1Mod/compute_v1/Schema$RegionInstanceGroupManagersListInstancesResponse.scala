package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionInstanceGroupManagersListInstancesResponse extends js.Object {
  /**
    * A list of managed instances.
    */
  var managedInstances: js.UndefOr[js.Array[Schema$ManagedInstance]] = js.native
}

object Schema$RegionInstanceGroupManagersListInstancesResponse {
  @scala.inline
  def apply(managedInstances: js.Array[Schema$ManagedInstance] = null): Schema$RegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (managedInstances != null) __obj.updateDynamic("managedInstances")(managedInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionInstanceGroupManagersListInstancesResponse]
  }
}

