package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A snapshot schedule policy specifies when and how frequently snapshots are
  * to be created for the target disk. Also specifies how many and how long
  * these scheduled snapshots should be retained.
  */
@js.native
trait SchemaResourcePolicySnapshotSchedulePolicy extends js.Object {
  /**
    * Retention policy applied to snapshots created by this resource policy.
    */
  var retentionPolicy: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy] = js.native
  /**
    * A Vm Maintenance Policy specifies what kind of infrastructure maintenance
    * we are allowed to perform on this VM and when. Schedule that is applied
    * to disks covered by this policy.
    */
  var schedule: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicySchedule] = js.native
  /**
    * Properties with which snapshots are created such as labels, encryption
    * keys.
    */
  var snapshotProperties: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties] = js.native
}

object SchemaResourcePolicySnapshotSchedulePolicy {
  @scala.inline
  def apply(): SchemaResourcePolicySnapshotSchedulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicy]
  }
  @scala.inline
  implicit class SchemaResourcePolicySnapshotSchedulePolicyOps[Self <: SchemaResourcePolicySnapshotSchedulePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRetentionPolicy(value: SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy): Self = this.set("retentionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetentionPolicy: Self = this.set("retentionPolicy", js.undefined)
    @scala.inline
    def setSchedule(value: SchemaResourcePolicySnapshotSchedulePolicySchedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setSnapshotProperties(value: SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties): Self = this.set("snapshotProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotProperties: Self = this.set("snapshotProperties", js.undefined)
  }
  
}

