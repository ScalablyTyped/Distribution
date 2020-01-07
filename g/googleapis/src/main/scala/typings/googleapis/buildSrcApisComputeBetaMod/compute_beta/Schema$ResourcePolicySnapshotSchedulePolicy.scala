package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A snapshot schedule policy specifies when and how frequently snapshots are
  * to be created for the target disk. Also specifies how many and how long
  * these scheduled snapshots should be retained.
  */
@js.native
trait Schema$ResourcePolicySnapshotSchedulePolicy extends js.Object {
  /**
    * Retention policy applied to snapshots created by this resource policy.
    */
  var retentionPolicy: js.UndefOr[Schema$ResourcePolicySnapshotSchedulePolicyRetentionPolicy] = js.native
  /**
    * A Vm Maintenance Policy specifies what kind of infrastructure maintenance
    * we are allowed to perform on this VM and when. Schedule that is applied
    * to disks covered by this policy.
    */
  var schedule: js.UndefOr[Schema$ResourcePolicySnapshotSchedulePolicySchedule] = js.native
  /**
    * Properties with which snapshots are created such as labels, encryption
    * keys.
    */
  var snapshotProperties: js.UndefOr[Schema$ResourcePolicySnapshotSchedulePolicySnapshotProperties] = js.native
}

object Schema$ResourcePolicySnapshotSchedulePolicy {
  @scala.inline
  def apply(
    retentionPolicy: Schema$ResourcePolicySnapshotSchedulePolicyRetentionPolicy = null,
    schedule: Schema$ResourcePolicySnapshotSchedulePolicySchedule = null,
    snapshotProperties: Schema$ResourcePolicySnapshotSchedulePolicySnapshotProperties = null
  ): Schema$ResourcePolicySnapshotSchedulePolicy = {
    val __obj = js.Dynamic.literal()
    if (retentionPolicy != null) __obj.updateDynamic("retentionPolicy")(retentionPolicy.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (snapshotProperties != null) __obj.updateDynamic("snapshotProperties")(snapshotProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePolicySnapshotSchedulePolicy]
  }
}

