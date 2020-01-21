package typings.googleapis.betaMod.computeBeta

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
  def apply(
    dailySchedule: SchemaResourcePolicyDailyCycle = null,
    hourlySchedule: SchemaResourcePolicyHourlyCycle = null,
    weeklySchedule: SchemaResourcePolicyWeeklyCycle = null
  ): SchemaResourcePolicySnapshotSchedulePolicySchedule = {
    val __obj = js.Dynamic.literal()
    if (dailySchedule != null) __obj.updateDynamic("dailySchedule")(dailySchedule.asInstanceOf[js.Any])
    if (hourlySchedule != null) __obj.updateDynamic("hourlySchedule")(hourlySchedule.asInstanceOf[js.Any])
    if (weeklySchedule != null) __obj.updateDynamic("weeklySchedule")(weeklySchedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicySchedule]
  }
}

