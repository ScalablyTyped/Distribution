package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InstanceGroupManagerActionsSummary extends js.Object {
  /**
               * [Output Only] The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from
               * the managed instance group without deleting it.
               */
  var abandoning: js.UndefOr[scala.Double] = js.undefined
  /**
               * [Output Only] The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails
               * to create any of these instances, it tries again until it creates the instance successfully.
               *
               * If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
               */
  var creating: js.UndefOr[scala.Double] = js.undefined
  /**
               * [Output Only] The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If
               * the group fails to create any of these instances, it decreases the group's targetSize value accordingly.
               */
  var creatingWithoutRetries: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted. */
  var deleting: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] The number of instances in the managed instance group that are running and have no scheduled actions. */
  var none: js.UndefOr[scala.Double] = js.undefined
  /**
               * [Output Only] The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated.
               * Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
               */
  var recreating: js.UndefOr[scala.Double] = js.undefined
  /**
               * [Output Only] The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a
               * recreate action. For example, setting or removing target pools for the instance.
               */
  var refreshing: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted. */
  var restarting: js.UndefOr[scala.Double] = js.undefined
}

