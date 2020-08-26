package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionInstanceGroupManagersListInstancesResponse extends js.Object {
  /** List of managed instances. */
  var managedInstances: js.UndefOr[js.Array[ManagedInstance]] = js.native
}

object RegionInstanceGroupManagersListInstancesResponse {
  @scala.inline
  def apply(): RegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersListInstancesResponse]
  }
  @scala.inline
  implicit class RegionInstanceGroupManagersListInstancesResponseOps[Self <: RegionInstanceGroupManagersListInstancesResponse] (val x: Self) extends AnyVal {
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
    def setManagedInstancesVarargs(value: ManagedInstance*): Self = this.set("managedInstances", js.Array(value :_*))
    @scala.inline
    def setManagedInstances(value: js.Array[ManagedInstance]): Self = this.set("managedInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedInstances: Self = this.set("managedInstances", js.undefined)
  }
  
}

