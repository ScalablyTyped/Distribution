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

