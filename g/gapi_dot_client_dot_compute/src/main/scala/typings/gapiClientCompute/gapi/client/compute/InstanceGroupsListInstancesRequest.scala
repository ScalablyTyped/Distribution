package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupsListInstancesRequest extends js.Object {
  /**
    * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes
    * all instances regardless of their state.
    */
  var instanceState: js.UndefOr[String] = js.native
}

object InstanceGroupsListInstancesRequest {
  @scala.inline
  def apply(): InstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsListInstancesRequest]
  }
  @scala.inline
  implicit class InstanceGroupsListInstancesRequestOps[Self <: InstanceGroupsListInstancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceState(value: String): Self = this.set("instanceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceState: Self = this.set("instanceState", js.undefined)
  }
  
}

