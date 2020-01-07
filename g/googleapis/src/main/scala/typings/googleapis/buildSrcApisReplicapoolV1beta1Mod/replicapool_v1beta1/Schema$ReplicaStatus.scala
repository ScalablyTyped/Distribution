package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The current status of a Replica.
  */
@js.native
trait Schema$ReplicaStatus extends js.Object {
  /**
    * [Output Only] Human-readable details about the current state of the
    * replica
    */
  var details: js.UndefOr[String] = js.native
  /**
    * [Output Only] The state of the Replica.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * [Output Only] The template used to build the replica.
    */
  var templateVersion: js.UndefOr[String] = js.native
  /**
    * [Output Only] Link to the virtual machine that this Replica represents.
    */
  var vmLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The time that this Replica got to the RUNNING state, in RFC
    * 3339 format. If the start time is unknown, UNKNOWN is returned.
    */
  var vmStartTime: js.UndefOr[String] = js.native
}

object Schema$ReplicaStatus {
  @scala.inline
  def apply(
    details: String = null,
    state: String = null,
    templateVersion: String = null,
    vmLink: String = null,
    vmStartTime: String = null
  ): Schema$ReplicaStatus = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (templateVersion != null) __obj.updateDynamic("templateVersion")(templateVersion.asInstanceOf[js.Any])
    if (vmLink != null) __obj.updateDynamic("vmLink")(vmLink.asInstanceOf[js.Any])
    if (vmStartTime != null) __obj.updateDynamic("vmStartTime")(vmStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReplicaStatus]
  }
}

