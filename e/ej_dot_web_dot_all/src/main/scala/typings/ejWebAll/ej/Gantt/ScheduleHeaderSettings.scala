package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleHeaderSettings extends js.Object {
  
  /** Specified the format for day view in schedule header
    */
  var dayHeaderFormat: js.UndefOr[String] = js.native
  
  /** Specified the format for Hour view in schedule header
    * @Default {HH}
    */
  var hourHeaderFormat: js.UndefOr[String] = js.native
  
  /** Specifies the number of minutes per interval
    * @Default {ej.Gantt.minutesPerInterval.Auto}
    */
  var minutesPerInterval: js.UndefOr[typings.ejWebAll.ej.Gantt.minutesPerInterval | String] = js.native
  
  /** Specified the format for month view in schedule header
    * @Default {MMM}
    */
  var monthHeaderFormat: js.UndefOr[String] = js.native
  
  /** Specifies the schedule mode
    * @Default {ej.Gantt.ScheduleHeaderType.Week}
    */
  var scheduleHeaderType: js.UndefOr[ScheduleHeaderType | String] = js.native
  
  /** Specifies the round-off mode for the start date in schedule header.
    * @Default {ej.Gantt.TimescaleRoundMode.Auto}
    */
  var timescaleStartDateMode: js.UndefOr[TimescaleRoundMode | String] = js.native
  
  /** Specifies the size of the lowest time unit along the timescale, with minimum value as &quot;50%&quot; and maximum value as &quot;500%&quot;. It is also possible to set the value
    * in pixels.
    * @Default {100%}
    */
  var timescaleUnitSize: js.UndefOr[String] = js.native
  
  /** Enable or disable the automatic timescale update on cell editing, dialog editing and taskbar editing.
    * @Default {true}
    */
  var updateTimescaleView: js.UndefOr[Boolean] = js.native
  
  /** Specified the format for week view in schedule header
    * @Default {MMM dd , yyyy}
    */
  var weekHeaderFormat: js.UndefOr[String] = js.native
  
  /** Specifies the start day of the week in week timescale mode
    * @Default {0}
    */
  var weekStartDay: js.UndefOr[Double] = js.native
  
  /** Specified the background for weekends in Gantt
    * @Default {#F2F2F2}
    */
  var weekendBackground: js.UndefOr[String] = js.native
  
  /** Specified the format for year view in schedule header
    * @Default {yyyy}
    */
  var yearHeaderFormat: js.UndefOr[String] = js.native
}
object ScheduleHeaderSettings {
  
  @scala.inline
  def apply(): ScheduleHeaderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleHeaderSettings]
  }
  
  @scala.inline
  implicit class ScheduleHeaderSettingsOps[Self <: ScheduleHeaderSettings] (val x: Self) extends AnyVal {
    
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
    def setDayHeaderFormat(value: String): Self = this.set("dayHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayHeaderFormat: Self = this.set("dayHeaderFormat", js.undefined)
    
    @scala.inline
    def setHourHeaderFormat(value: String): Self = this.set("hourHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourHeaderFormat: Self = this.set("hourHeaderFormat", js.undefined)
    
    @scala.inline
    def setMinutesPerInterval(value: minutesPerInterval | String): Self = this.set("minutesPerInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutesPerInterval: Self = this.set("minutesPerInterval", js.undefined)
    
    @scala.inline
    def setMonthHeaderFormat(value: String): Self = this.set("monthHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthHeaderFormat: Self = this.set("monthHeaderFormat", js.undefined)
    
    @scala.inline
    def setScheduleHeaderType(value: ScheduleHeaderType | String): Self = this.set("scheduleHeaderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleHeaderType: Self = this.set("scheduleHeaderType", js.undefined)
    
    @scala.inline
    def setTimescaleStartDateMode(value: TimescaleRoundMode | String): Self = this.set("timescaleStartDateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimescaleStartDateMode: Self = this.set("timescaleStartDateMode", js.undefined)
    
    @scala.inline
    def setTimescaleUnitSize(value: String): Self = this.set("timescaleUnitSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimescaleUnitSize: Self = this.set("timescaleUnitSize", js.undefined)
    
    @scala.inline
    def setUpdateTimescaleView(value: Boolean): Self = this.set("updateTimescaleView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTimescaleView: Self = this.set("updateTimescaleView", js.undefined)
    
    @scala.inline
    def setWeekHeaderFormat(value: String): Self = this.set("weekHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekHeaderFormat: Self = this.set("weekHeaderFormat", js.undefined)
    
    @scala.inline
    def setWeekStartDay(value: Double): Self = this.set("weekStartDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStartDay: Self = this.set("weekStartDay", js.undefined)
    
    @scala.inline
    def setWeekendBackground(value: String): Self = this.set("weekendBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekendBackground: Self = this.set("weekendBackground", js.undefined)
    
    @scala.inline
    def setYearHeaderFormat(value: String): Self = this.set("yearHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearHeaderFormat: Self = this.set("yearHeaderFormat", js.undefined)
  }
}
