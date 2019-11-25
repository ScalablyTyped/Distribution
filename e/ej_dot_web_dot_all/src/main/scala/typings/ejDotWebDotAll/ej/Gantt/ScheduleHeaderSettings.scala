package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleHeaderSettings extends js.Object {
  /** Specified the format for day view in schedule header
    */
  var dayHeaderFormat: js.UndefOr[String] = js.undefined
  /** Specified the format for Hour view in schedule header
    * @Default {HH}
    */
  var hourHeaderFormat: js.UndefOr[String] = js.undefined
  /** Specifies the number of minutes per interval
    * @Default {ej.Gantt.minutesPerInterval.Auto}
    */
  var minutesPerInterval: js.UndefOr[typings.ejDotWebDotAll.ej.Gantt.minutesPerInterval | String] = js.undefined
  /** Specified the format for month view in schedule header
    * @Default {MMM}
    */
  var monthHeaderFormat: js.UndefOr[String] = js.undefined
  /** Specifies the schedule mode
    * @Default {ej.Gantt.ScheduleHeaderType.Week}
    */
  var scheduleHeaderType: js.UndefOr[ScheduleHeaderType | String] = js.undefined
  /** Specifies the round-off mode for the start date in schedule header.
    * @Default {ej.Gantt.TimescaleRoundMode.Auto}
    */
  var timescaleStartDateMode: js.UndefOr[TimescaleRoundMode | String] = js.undefined
  /** Specifies the size of the lowest time unit along the timescale, with minimum value as &quot;50%&quot; and maximum value as &quot;500%&quot;. It is also possible to set the value
    * in pixels.
    * @Default {100%}
    */
  var timescaleUnitSize: js.UndefOr[String] = js.undefined
  /** Enable or disable the automatic timescale update on cell editing, dialog editing and taskbar editing.
    * @Default {true}
    */
  var updateTimescaleView: js.UndefOr[Boolean] = js.undefined
  /** Specified the format for week view in schedule header
    * @Default {MMM dd , yyyy}
    */
  var weekHeaderFormat: js.UndefOr[String] = js.undefined
  /** Specifies the start day of the week in week timescale mode
    * @Default {0}
    */
  var weekStartDay: js.UndefOr[Double] = js.undefined
  /** Specified the background for weekends in Gantt
    * @Default {#F2F2F2}
    */
  var weekendBackground: js.UndefOr[String] = js.undefined
  /** Specified the format for year view in schedule header
    * @Default {yyyy}
    */
  var yearHeaderFormat: js.UndefOr[String] = js.undefined
}

object ScheduleHeaderSettings {
  @scala.inline
  def apply(
    dayHeaderFormat: String = null,
    hourHeaderFormat: String = null,
    minutesPerInterval: minutesPerInterval | String = null,
    monthHeaderFormat: String = null,
    scheduleHeaderType: ScheduleHeaderType | String = null,
    timescaleStartDateMode: TimescaleRoundMode | String = null,
    timescaleUnitSize: String = null,
    updateTimescaleView: js.UndefOr[Boolean] = js.undefined,
    weekHeaderFormat: String = null,
    weekStartDay: Int | Double = null,
    weekendBackground: String = null,
    yearHeaderFormat: String = null
  ): ScheduleHeaderSettings = {
    val __obj = js.Dynamic.literal()
    if (dayHeaderFormat != null) __obj.updateDynamic("dayHeaderFormat")(dayHeaderFormat.asInstanceOf[js.Any])
    if (hourHeaderFormat != null) __obj.updateDynamic("hourHeaderFormat")(hourHeaderFormat.asInstanceOf[js.Any])
    if (minutesPerInterval != null) __obj.updateDynamic("minutesPerInterval")(minutesPerInterval.asInstanceOf[js.Any])
    if (monthHeaderFormat != null) __obj.updateDynamic("monthHeaderFormat")(monthHeaderFormat.asInstanceOf[js.Any])
    if (scheduleHeaderType != null) __obj.updateDynamic("scheduleHeaderType")(scheduleHeaderType.asInstanceOf[js.Any])
    if (timescaleStartDateMode != null) __obj.updateDynamic("timescaleStartDateMode")(timescaleStartDateMode.asInstanceOf[js.Any])
    if (timescaleUnitSize != null) __obj.updateDynamic("timescaleUnitSize")(timescaleUnitSize.asInstanceOf[js.Any])
    if (!js.isUndefined(updateTimescaleView)) __obj.updateDynamic("updateTimescaleView")(updateTimescaleView.asInstanceOf[js.Any])
    if (weekHeaderFormat != null) __obj.updateDynamic("weekHeaderFormat")(weekHeaderFormat.asInstanceOf[js.Any])
    if (weekStartDay != null) __obj.updateDynamic("weekStartDay")(weekStartDay.asInstanceOf[js.Any])
    if (weekendBackground != null) __obj.updateDynamic("weekendBackground")(weekendBackground.asInstanceOf[js.Any])
    if (yearHeaderFormat != null) __obj.updateDynamic("yearHeaderFormat")(yearHeaderFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleHeaderSettings]
  }
}

