package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InstanceGroupManagers.applyUpdatesToInstances
  */
@js.native
trait SchemaInstanceGroupManagersApplyUpdatesRequest extends js.Object {
  /**
    * The list of URLs of one or more instances for which we want to apply
    * updates on this managed instance group. This can be a full URL or a
    * partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
  /**
    * The maximal action that should be performed on the instances. By default
    * REPLACE. This field is deprecated, please use
    * most_disruptive_allowed_action.
    */
  var maximalAction: js.UndefOr[String] = js.native
  /**
    * The minimal action that should be perfomed on the instances. By default
    * NONE.
    */
  var minimalAction: js.UndefOr[String] = js.native
  /**
    * The most disruptive action that allowed to be performed on the instances.
    * By default REPLACE.
    */
  var mostDisruptiveAllowedAction: js.UndefOr[String] = js.native
}

object SchemaInstanceGroupManagersApplyUpdatesRequest {
  @scala.inline
  def apply(): SchemaInstanceGroupManagersApplyUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersApplyUpdatesRequest]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagersApplyUpdatesRequestOps[Self <: SchemaInstanceGroupManagersApplyUpdatesRequest] (val x: Self) extends AnyVal {
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
    def setMaximalAction(value: String): Self = this.set("maximalAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximalAction: Self = this.set("maximalAction", js.undefined)
    @scala.inline
    def setMinimalAction(value: String): Self = this.set("minimalAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimalAction: Self = this.set("minimalAction", js.undefined)
    @scala.inline
    def setMostDisruptiveAllowedAction(value: String): Self = this.set("mostDisruptiveAllowedAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMostDisruptiveAllowedAction: Self = this.set("mostDisruptiveAllowedAction", js.undefined)
  }
  
}

