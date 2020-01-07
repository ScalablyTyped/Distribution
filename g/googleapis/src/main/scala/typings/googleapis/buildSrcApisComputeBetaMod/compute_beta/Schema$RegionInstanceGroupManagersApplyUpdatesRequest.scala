package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InstanceGroupManagers.applyUpdatesToInstances
  */
@js.native
trait Schema$RegionInstanceGroupManagersApplyUpdatesRequest extends js.Object {
  /**
    * The list of instances for which we want to apply changes on this managed
    * instance group.
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
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

object Schema$RegionInstanceGroupManagersApplyUpdatesRequest {
  @scala.inline
  def apply(
    instances: js.Array[String] = null,
    minimalAction: String = null,
    mostDisruptiveAllowedAction: String = null
  ): Schema$RegionInstanceGroupManagersApplyUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (minimalAction != null) __obj.updateDynamic("minimalAction")(minimalAction.asInstanceOf[js.Any])
    if (mostDisruptiveAllowedAction != null) __obj.updateDynamic("mostDisruptiveAllowedAction")(mostDisruptiveAllowedAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionInstanceGroupManagersApplyUpdatesRequest]
  }
}

