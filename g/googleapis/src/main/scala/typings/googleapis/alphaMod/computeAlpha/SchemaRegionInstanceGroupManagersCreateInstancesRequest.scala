package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RegionInstanceGroupManagers.createInstances
  */
@js.native
trait SchemaRegionInstanceGroupManagersCreateInstancesRequest extends js.Object {
  /**
    * [Required] List of specifications of per-instance configs.
    */
  var instances: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
}

object SchemaRegionInstanceGroupManagersCreateInstancesRequest {
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersCreateInstancesRequest]
  }
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersCreateInstancesRequestOps[Self <: SchemaRegionInstanceGroupManagersCreateInstancesRequest] (val x: Self) extends AnyVal {
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
    def setInstancesVarargs(value: SchemaPerInstanceConfig*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[SchemaPerInstanceConfig]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
  }
  
}

