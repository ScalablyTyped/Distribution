package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends js.Object {
  /** When set to true, displays the time slots on the Scheduler.
    * @Default {true}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Accepts the value in minutes. When provided with specific value, displays the appropriate time interval on the Scheduler
    * @Default {60}
    */
  var majorSlot: js.UndefOr[Double] = js.undefined
  /** Template design that customizes the timecells (major slots). Accepts id value of the template defined for major time slots.
    * @Default {null}
    */
  var majorSlotTemplateId: js.UndefOr[String] = js.undefined
  /** When set with some specific value, defines the number of time divisions split per hour(as per value given for the majorTimeSlot). Those time divisions are meant to be the minor
    * slots.
    * @Default {2}
    */
  var minorSlotCount: js.UndefOr[Double] = js.undefined
  /** Template design that customizes the timecells (minor slots) that are partitioned based on minorSlotCount. Accepts id value of the template defined for minor time slots.
    * @Default {null}
    */
  var minorSlotTemplateId: js.UndefOr[String] = js.undefined
}

object TimeScale {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    majorSlot: Int | Double = null,
    majorSlotTemplateId: String = null,
    minorSlotCount: Int | Double = null,
    minorSlotTemplateId: String = null
  ): TimeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (majorSlot != null) __obj.updateDynamic("majorSlot")(majorSlot.asInstanceOf[js.Any])
    if (majorSlotTemplateId != null) __obj.updateDynamic("majorSlotTemplateId")(majorSlotTemplateId.asInstanceOf[js.Any])
    if (minorSlotCount != null) __obj.updateDynamic("minorSlotCount")(minorSlotCount.asInstanceOf[js.Any])
    if (minorSlotTemplateId != null) __obj.updateDynamic("minorSlotTemplateId")(minorSlotTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
}

