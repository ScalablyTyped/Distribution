package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionInstanceGroupsListInstancesRequest extends js.Object {
  /**
    * Instances in which state should be returned. Valid options are:
    * &#39;ALL&#39;, &#39;RUNNING&#39;. By default, it lists all instances.
    */
  var instanceState: js.UndefOr[String] = js.native
  /**
    * Name of port user is interested in. It is optional. If it is set, only
    * information about this ports will be returned. If it is not set, all the
    * named ports will be returned. Always lists all instances.
    */
  var portName: js.UndefOr[String] = js.native
}

object Schema$RegionInstanceGroupsListInstancesRequest {
  @scala.inline
  def apply(instanceState: String = null, portName: String = null): Schema$RegionInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceState != null) __obj.updateDynamic("instanceState")(instanceState.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionInstanceGroupsListInstancesRequest]
  }
}

