package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupManagersAbandonInstancesRequest extends js.Object {
  /**
    * The URLs of one or more instances to abandon. This can be a full URL or a
    * partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
}

object Schema$InstanceGroupManagersAbandonInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[String] = null): Schema$InstanceGroupManagersAbandonInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagersAbandonInstancesRequest]
  }
}

