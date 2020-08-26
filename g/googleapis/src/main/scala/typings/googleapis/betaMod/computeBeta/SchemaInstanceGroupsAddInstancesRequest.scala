package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupsAddInstancesRequest extends js.Object {
  /**
    * The list of instances to add to the instance group.
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.native
}

object SchemaInstanceGroupsAddInstancesRequest {
  @scala.inline
  def apply(): SchemaInstanceGroupsAddInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupsAddInstancesRequest]
  }
  @scala.inline
  implicit class SchemaInstanceGroupsAddInstancesRequestOps[Self <: SchemaInstanceGroupsAddInstancesRequest] (val x: Self) extends AnyVal {
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
    def setInstancesVarargs(value: SchemaInstanceReference*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[SchemaInstanceReference]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
  }
  
}

