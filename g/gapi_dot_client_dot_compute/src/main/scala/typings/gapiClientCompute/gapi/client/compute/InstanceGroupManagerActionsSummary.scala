package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupManagerActionsSummary extends js.Object {
  /**
    * [Output Only] The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from
    * the managed instance group without deleting it.
    */
  var abandoning: js.UndefOr[Double] = js.undefined
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails
    * to create any of these instances, it tries again until it creates the instance successfully.
    *
    * If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
    */
  var creating: js.UndefOr[Double] = js.undefined
  /**
    * [Output Only] The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If
    * the group fails to create any of these instances, it decreases the group's targetSize value accordingly.
    */
  var creatingWithoutRetries: js.UndefOr[Double] = js.undefined
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted. */
  var deleting: js.UndefOr[Double] = js.undefined
  /** [Output Only] The number of instances in the managed instance group that are running and have no scheduled actions. */
  var none: js.UndefOr[Double] = js.undefined
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated.
    * Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
    */
  var recreating: js.UndefOr[Double] = js.undefined
  /**
    * [Output Only] The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a
    * recreate action. For example, setting or removing target pools for the instance.
    */
  var refreshing: js.UndefOr[Double] = js.undefined
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted. */
  var restarting: js.UndefOr[Double] = js.undefined
}

object InstanceGroupManagerActionsSummary {
  @scala.inline
  def apply(
    abandoning: js.UndefOr[Double] = js.undefined,
    creating: js.UndefOr[Double] = js.undefined,
    creatingWithoutRetries: js.UndefOr[Double] = js.undefined,
    deleting: js.UndefOr[Double] = js.undefined,
    none: js.UndefOr[Double] = js.undefined,
    recreating: js.UndefOr[Double] = js.undefined,
    refreshing: js.UndefOr[Double] = js.undefined,
    restarting: js.UndefOr[Double] = js.undefined
  ): InstanceGroupManagerActionsSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abandoning)) __obj.updateDynamic("abandoning")(abandoning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(creating)) __obj.updateDynamic("creating")(creating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(creatingWithoutRetries)) __obj.updateDynamic("creatingWithoutRetries")(creatingWithoutRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleting)) __obj.updateDynamic("deleting")(deleting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(none)) __obj.updateDynamic("none")(none.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recreating)) __obj.updateDynamic("recreating")(recreating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restarting)) __obj.updateDynamic("restarting")(restarting.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupManagerActionsSummary]
  }
}

