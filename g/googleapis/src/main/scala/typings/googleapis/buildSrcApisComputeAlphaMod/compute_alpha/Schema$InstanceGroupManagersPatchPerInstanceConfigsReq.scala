package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InstanceGroupManagers.patchPerInstanceConfigs
  */
@js.native
trait Schema$InstanceGroupManagersPatchPerInstanceConfigsReq extends js.Object {
  /**
    * The list of per-instance configs to insert or patch on this managed
    * instance group.
    */
  var perInstanceConfigs: js.UndefOr[js.Array[Schema$PerInstanceConfig]] = js.native
}

object Schema$InstanceGroupManagersPatchPerInstanceConfigsReq {
  @scala.inline
  def apply(perInstanceConfigs: js.Array[Schema$PerInstanceConfig] = null): Schema$InstanceGroupManagersPatchPerInstanceConfigsReq = {
    val __obj = js.Dynamic.literal()
    if (perInstanceConfigs != null) __obj.updateDynamic("perInstanceConfigs")(perInstanceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagersPatchPerInstanceConfigsReq]
  }
}

