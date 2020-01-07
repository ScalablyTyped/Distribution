package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupManagerPendingActionsSummary extends js.Object {
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be created.
    */
  var creating: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be deleted.
    */
  var deleting: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be recreated.
    */
  var recreating: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be restarted.
    */
  var restarting: js.UndefOr[Double] = js.native
}

object Schema$InstanceGroupManagerPendingActionsSummary {
  @scala.inline
  def apply(
    creating: Int | Double = null,
    deleting: Int | Double = null,
    recreating: Int | Double = null,
    restarting: Int | Double = null
  ): Schema$InstanceGroupManagerPendingActionsSummary = {
    val __obj = js.Dynamic.literal()
    if (creating != null) __obj.updateDynamic("creating")(creating.asInstanceOf[js.Any])
    if (deleting != null) __obj.updateDynamic("deleting")(deleting.asInstanceOf[js.Any])
    if (recreating != null) __obj.updateDynamic("recreating")(recreating.asInstanceOf[js.Any])
    if (restarting != null) __obj.updateDynamic("restarting")(restarting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagerPendingActionsSummary]
  }
}

