package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerPendingActionsSummary extends js.Object {
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

object SchemaInstanceGroupManagerPendingActionsSummary {
  @scala.inline
  def apply(
    creating: js.UndefOr[Double] = js.undefined,
    deleting: js.UndefOr[Double] = js.undefined,
    recreating: js.UndefOr[Double] = js.undefined,
    restarting: js.UndefOr[Double] = js.undefined
  ): SchemaInstanceGroupManagerPendingActionsSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(creating)) __obj.updateDynamic("creating")(creating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleting)) __obj.updateDynamic("deleting")(deleting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recreating)) __obj.updateDynamic("recreating")(recreating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restarting)) __obj.updateDynamic("restarting")(restarting.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagerPendingActionsSummary]
  }
}

