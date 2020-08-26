package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InstanceGroupManagers.deletePerInstanceConfigs
  */
@js.native
trait SchemaInstanceGroupManagersDeletePerInstanceConfigsReq extends js.Object {
  /**
    * The list of instances for which we want to delete per-instance configs on
    * this managed instance group.
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of instance names for which we want to delete per-instance
    * configs on this managed instance group.
    */
  var names: js.UndefOr[js.Array[String]] = js.native
}

object SchemaInstanceGroupManagersDeletePerInstanceConfigsReq {
  @scala.inline
  def apply(): SchemaInstanceGroupManagersDeletePerInstanceConfigsReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersDeletePerInstanceConfigsReq]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagersDeletePerInstanceConfigsReqOps[Self <: SchemaInstanceGroupManagersDeletePerInstanceConfigsReq] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
  }
  
}

