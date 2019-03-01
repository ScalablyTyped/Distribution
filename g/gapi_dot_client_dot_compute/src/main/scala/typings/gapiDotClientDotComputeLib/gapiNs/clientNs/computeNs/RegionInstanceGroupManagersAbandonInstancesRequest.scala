package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupManagersAbandonInstancesRequest extends js.Object {
  /** The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME]. */
  var instances: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RegionInstanceGroupManagersAbandonInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[java.lang.String] = null): RegionInstanceGroupManagersAbandonInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances)
    __obj.asInstanceOf[RegionInstanceGroupManagersAbandonInstancesRequest]
  }
}

