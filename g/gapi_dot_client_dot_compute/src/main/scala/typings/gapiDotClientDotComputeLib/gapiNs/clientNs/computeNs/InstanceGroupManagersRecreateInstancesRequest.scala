package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupManagersRecreateInstancesRequest extends js.Object {
  /** The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME]. */
  var instances: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object InstanceGroupManagersRecreateInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[java.lang.String] = null): InstanceGroupManagersRecreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances)
    __obj.asInstanceOf[InstanceGroupManagersRecreateInstancesRequest]
  }
}

