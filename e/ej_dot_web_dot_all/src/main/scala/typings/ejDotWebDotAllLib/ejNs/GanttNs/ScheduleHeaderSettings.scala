package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleHeaderSettings extends js.Object {
  /** Specified the format for day view in schedule header
    */
  var dayHeaderFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specified the format for Hour view in schedule header
    * @Default {HH}
    */
  var hourHeaderFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the number of minutes per interval
    * @Default {ej.Gantt.minutesPerInterval.Auto}
    */
  var minutesPerInterval: js.UndefOr[minutesPerInterval | java.lang.String] = js.undefined
  /** Specified the format for month view in schedule header
    * @Default {MMM}
    */
  var monthHeaderFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the schedule mode
    * @Default {ej.Gantt.ScheduleHeaderType.Week}
    */
  var scheduleHeaderType: js.UndefOr[ScheduleHeaderType | java.lang.String] = js.undefined
  /** Specifies the round-off mode for the start date in schedule header.
    * @Default {ej.Gantt.TimescaleRoundMode.Auto}
    */
  var timescaleStartDateMode: js.UndefOr[TimescaleRoundMode | java.lang.String] = js.undefined
  /** Specifies the size of the lowest time unit along the timescale, with minimum value as &quot;50%&quot; and maximum value as &quot;500%&quot;. It is also possible to set the value
    * in pixels.
    * @Default {100%}
    */
  var timescaleUnitSize: js.UndefOr[java.lang.String] = js.undefined
  /** Enable or disable the automatic timescale update on cell editing, dialog editing and taskbar editing.
    * @Default {true}
    */
  var updateTimescaleView: js.UndefOr[scala.Boolean] = js.undefined
  /** Specified the format for week view in schedule header
    * @Default {MMM dd , yyyy}
    */
  var weekHeaderFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the start day of the week in week timescale mode
    * @Default {0}
    */
  var weekStartDay: js.UndefOr[scala.Double] = js.undefined
  /** Specified the background for weekends in Gantt
    * @Default {#F2F2F2}
    */
  var weekendBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Specified the format for year view in schedule header
    * @Default {yyyy}
    */
  var yearHeaderFormat: js.UndefOr[java.lang.String] = js.undefined
}

object ScheduleHeaderSettings {
  @scala.inline
  def apply(
    dayHeaderFormat: java.lang.String = null,
    hourHeaderFormat: java.lang.String = null,
    minutesPerInterval: minutesPerInterval | java.lang.String = null,
    monthHeaderFormat: java.lang.String = null,
    scheduleHeaderType: ScheduleHeaderType | java.lang.String = null,
    timescaleStartDateMode: TimescaleRoundMode | java.lang.String = null,
    timescaleUnitSize: java.lang.String = null,
    updateTimescaleView: js.UndefOr[scala.Boolean] = js.undefined,
    weekHeaderFormat: java.lang.String = null,
    weekStartDay: scala.Int | scala.Double = null,
    weekendBackground: java.lang.String = null,
    yearHeaderFormat: java.lang.String = null
  ): ScheduleHeaderSettings = {
    val __obj = js.Dynamic.literal()
    if (dayHeaderFormat != null) __obj.updateDynamic("dayHeaderFormat")(dayHeaderFormat)
    if (hourHeaderFormat != null) __obj.updateDynamic("hourHeaderFormat")(hourHeaderFormat)
    if (minutesPerInterval != null) __obj.updateDynamic("minutesPerInterval")(minutesPerInterval.asInstanceOf[js.Any])
    if (monthHeaderFormat != null) __obj.updateDynamic("monthHeaderFormat")(monthHeaderFormat)
    if (scheduleHeaderType != null) __obj.updateDynamic("scheduleHeaderType")(scheduleHeaderType.asInstanceOf[js.Any])
    if (timescaleStartDateMode != null) __obj.updateDynamic("timescaleStartDateMode")(timescaleStartDateMode.asInstanceOf[js.Any])
    if (timescaleUnitSize != null) __obj.updateDynamic("timescaleUnitSize")(timescaleUnitSize)
    if (!js.isUndefined(updateTimescaleView)) __obj.updateDynamic("updateTimescaleView")(updateTimescaleView)
    if (weekHeaderFormat != null) __obj.updateDynamic("weekHeaderFormat")(weekHeaderFormat)
    if (weekStartDay != null) __obj.updateDynamic("weekStartDay")(weekStartDay.asInstanceOf[js.Any])
    if (weekendBackground != null) __obj.updateDynamic("weekendBackground")(weekendBackground)
    if (yearHeaderFormat != null) __obj.updateDynamic("yearHeaderFormat")(yearHeaderFormat)
    __obj.asInstanceOf[ScheduleHeaderSettings]
  }
}

