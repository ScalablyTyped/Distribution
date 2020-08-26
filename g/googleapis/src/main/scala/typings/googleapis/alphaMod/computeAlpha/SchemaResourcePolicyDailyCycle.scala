package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Time window specified for daily operations.
  */
@js.native
trait SchemaResourcePolicyDailyCycle extends js.Object {
  /**
    * Defines a schedule that runs every nth day of the month.
    */
  var daysInCycle: js.UndefOr[Double] = js.native
  /**
    * [Output only] A predetermined duration for the window, automatically
    * chosen to be the smallest possible in the given scenario.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Start time of the window. This must be in UTC format that resolves to one
    * of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5
    * and 08:00 are valid.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaResourcePolicyDailyCycle {
  @scala.inline
  def apply(): SchemaResourcePolicyDailyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyDailyCycle]
  }
  @scala.inline
  implicit class SchemaResourcePolicyDailyCycleOps[Self <: SchemaResourcePolicyDailyCycle] (val x: Self) extends AnyVal {
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
    def setDaysInCycle(value: Double): Self = this.set("daysInCycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaysInCycle: Self = this.set("daysInCycle", js.undefined)
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

