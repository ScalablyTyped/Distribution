package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A schedule for disks where the schedueled operations are performed.
  */
@js.native
trait Schema$ResourcePolicySnapshotSchedulePolicySchedule extends js.Object {
  var dailySchedule: js.UndefOr[Schema$ResourcePolicyDailyCycle] = js.native
  var hourlySchedule: js.UndefOr[Schema$ResourcePolicyHourlyCycle] = js.native
  var weeklySchedule: js.UndefOr[Schema$ResourcePolicyWeeklyCycle] = js.native
}

object Schema$ResourcePolicySnapshotSchedulePolicySchedule {
  @scala.inline
  def apply(
    dailySchedule: Schema$ResourcePolicyDailyCycle = null,
    hourlySchedule: Schema$ResourcePolicyHourlyCycle = null,
    weeklySchedule: Schema$ResourcePolicyWeeklyCycle = null
  ): Schema$ResourcePolicySnapshotSchedulePolicySchedule = {
    val __obj = js.Dynamic.literal()
    if (dailySchedule != null) __obj.updateDynamic("dailySchedule")(dailySchedule.asInstanceOf[js.Any])
    if (hourlySchedule != null) __obj.updateDynamic("hourlySchedule")(hourlySchedule.asInstanceOf[js.Any])
    if (weeklySchedule != null) __obj.updateDynamic("weeklySchedule")(weeklySchedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePolicySnapshotSchedulePolicySchedule]
  }
}

