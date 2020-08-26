package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A schedule for disks where the schedueled operations are performed.
  */
@js.native
trait SchemaResourcePolicySnapshotSchedulePolicySchedule extends js.Object {
  var dailySchedule: js.UndefOr[SchemaResourcePolicyDailyCycle] = js.native
  var hourlySchedule: js.UndefOr[SchemaResourcePolicyHourlyCycle] = js.native
  var weeklySchedule: js.UndefOr[SchemaResourcePolicyWeeklyCycle] = js.native
}

object SchemaResourcePolicySnapshotSchedulePolicySchedule {
  @scala.inline
  def apply(): SchemaResourcePolicySnapshotSchedulePolicySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicySchedule]
  }
  @scala.inline
  implicit class SchemaResourcePolicySnapshotSchedulePolicyScheduleOps[Self <: SchemaResourcePolicySnapshotSchedulePolicySchedule] (val x: Self) extends AnyVal {
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
    def setDailySchedule(value: SchemaResourcePolicyDailyCycle): Self = this.set("dailySchedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDailySchedule: Self = this.set("dailySchedule", js.undefined)
    @scala.inline
    def setHourlySchedule(value: SchemaResourcePolicyHourlyCycle): Self = this.set("hourlySchedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourlySchedule: Self = this.set("hourlySchedule", js.undefined)
    @scala.inline
    def setWeeklySchedule(value: SchemaResourcePolicyWeeklyCycle): Self = this.set("weeklySchedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeklySchedule: Self = this.set("weeklySchedule", js.undefined)
  }
  
}

