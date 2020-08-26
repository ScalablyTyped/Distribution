package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeScale extends js.Object {
  /** When set to true, displays the time slots on the Scheduler.
    * @Default {true}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Accepts the value in minutes. When provided with specific value, displays the appropriate time interval on the Scheduler
    * @Default {60}
    */
  var majorSlot: js.UndefOr[Double] = js.native
  /** Template design that customizes the timecells (major slots). Accepts id value of the template defined for major time slots.
    * @Default {null}
    */
  var majorSlotTemplateId: js.UndefOr[String] = js.native
  /** When set with some specific value, defines the number of time divisions split per hour(as per value given for the majorTimeSlot). Those time divisions are meant to be the minor
    * slots.
    * @Default {2}
    */
  var minorSlotCount: js.UndefOr[Double] = js.native
  /** Template design that customizes the timecells (minor slots) that are partitioned based on minorSlotCount. Accepts id value of the template defined for minor time slots.
    * @Default {null}
    */
  var minorSlotTemplateId: js.UndefOr[String] = js.native
}

object TimeScale {
  @scala.inline
  def apply(): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeScale]
  }
  @scala.inline
  implicit class TimeScaleOps[Self <: TimeScale] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setMajorSlot(value: Double): Self = this.set("majorSlot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorSlot: Self = this.set("majorSlot", js.undefined)
    @scala.inline
    def setMajorSlotTemplateId(value: String): Self = this.set("majorSlotTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorSlotTemplateId: Self = this.set("majorSlotTemplateId", js.undefined)
    @scala.inline
    def setMinorSlotCount(value: Double): Self = this.set("minorSlotCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorSlotCount: Self = this.set("minorSlotCount", js.undefined)
    @scala.inline
    def setMinorSlotTemplateId(value: String): Self = this.set("minorSlotTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorSlotTemplateId: Self = this.set("minorSlotTemplateId", js.undefined)
  }
  
}

