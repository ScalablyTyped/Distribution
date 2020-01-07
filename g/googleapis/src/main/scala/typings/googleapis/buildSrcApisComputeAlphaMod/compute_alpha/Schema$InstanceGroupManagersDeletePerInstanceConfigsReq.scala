package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InstanceGroupManagers.deletePerInstanceConfigs
  */
@js.native
trait Schema$InstanceGroupManagersDeletePerInstanceConfigsReq extends js.Object {
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

object Schema$InstanceGroupManagersDeletePerInstanceConfigsReq {
  @scala.inline
  def apply(instances: js.Array[String] = null, names: js.Array[String] = null): Schema$InstanceGroupManagersDeletePerInstanceConfigsReq = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagersDeletePerInstanceConfigsReq]
  }
}

