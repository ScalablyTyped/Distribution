package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupsListInstancesRequest extends js.Object {
  /**
    * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes
    * all instances regardless of their state.
    */
  var instanceState: js.UndefOr[java.lang.String] = js.undefined
}

object InstanceGroupsListInstancesRequest {
  @scala.inline
  def apply(instanceState: java.lang.String = null): InstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceState != null) __obj.updateDynamic("instanceState")(instanceState)
    __obj.asInstanceOf[InstanceGroupsListInstancesRequest]
  }
}

