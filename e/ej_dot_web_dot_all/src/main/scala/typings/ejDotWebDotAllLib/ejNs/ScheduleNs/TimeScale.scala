package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends js.Object {
  /** When set to true, displays the time slots on the Scheduler.
    * @Default {true}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Accepts the value in minutes. When provided with specific value, displays the appropriate time interval on the Scheduler
    * @Default {60}
    */
  var majorSlot: js.UndefOr[scala.Double] = js.undefined
  /** Template design that customizes the timecells (major slots). Accepts id value of the template defined for major time slots.
    * @Default {null}
    */
  var majorSlotTemplateId: js.UndefOr[java.lang.String] = js.undefined
  /** When set with some specific value, defines the number of time divisions split per hour(as per value given for the majorTimeSlot). Those time divisions are meant to be the minor
    * slots.
    * @Default {2}
    */
  var minorSlotCount: js.UndefOr[scala.Double] = js.undefined
  /** Template design that customizes the timecells (minor slots) that are partitioned based on minorSlotCount. Accepts id value of the template defined for minor time slots.
    * @Default {null}
    */
  var minorSlotTemplateId: js.UndefOr[java.lang.String] = js.undefined
}

