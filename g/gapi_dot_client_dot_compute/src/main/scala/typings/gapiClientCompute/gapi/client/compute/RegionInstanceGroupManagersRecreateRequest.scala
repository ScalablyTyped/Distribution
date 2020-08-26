package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionInstanceGroupManagersRecreateRequest extends js.Object {
  /** The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME]. */
  var instances: js.UndefOr[js.Array[String]] = js.native
}

object RegionInstanceGroupManagersRecreateRequest {
  @scala.inline
  def apply(): RegionInstanceGroupManagersRecreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersRecreateRequest]
  }
  @scala.inline
  implicit class RegionInstanceGroupManagersRecreateRequestOps[Self <: RegionInstanceGroupManagersRecreateRequest] (val x: Self) extends AnyVal {
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
    def setInstancesVarargs(value: String*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[String]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
  }
  
}

