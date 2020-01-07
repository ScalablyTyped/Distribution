package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An internal checker allows uptime checks to run on private/internal GCP
  * resources.
  */
@js.native
trait Schema$InternalChecker extends js.Object {
  /**
    * The checker&#39;s human-readable name. The display name should be unique
    * within a Stackdriver Workspace in order to make it easier to identify;
    * however, uniqueness is not enforced.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The GCP zone the uptime check should egress from. Only respected for
    * internal uptime checks, where internal_network is specified.
    */
  var gcpZone: js.UndefOr[String] = js.native
  /**
    * A unique resource name for this InternalChecker. The format
    * is:projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID].PROJECT_ID
    * is the stackdriver workspace project for the uptime check config
    * associated with the internal checker.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the
    * internal resource lives (ex: &quot;default&quot;).
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The GCP project_id where the internal checker lives. Not necessary the
    * same as the workspace project.
    */
  var peerProjectId: js.UndefOr[String] = js.native
  /**
    * The current operational state of the internal checker.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$InternalChecker {
  @scala.inline
  def apply(
    displayName: String = null,
    gcpZone: String = null,
    name: String = null,
    network: String = null,
    peerProjectId: String = null,
    state: String = null
  ): Schema$InternalChecker = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (gcpZone != null) __obj.updateDynamic("gcpZone")(gcpZone.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (peerProjectId != null) __obj.updateDynamic("peerProjectId")(peerProjectId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InternalChecker]
  }
}

