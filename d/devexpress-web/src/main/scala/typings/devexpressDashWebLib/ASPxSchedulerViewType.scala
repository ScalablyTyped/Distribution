package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the SchedulerViewType object.
  */
trait ASPxSchedulerViewType extends js.Object {
  /**
    * Gets a string representation equivalent to the Agenda enumeration for use in client scripts.
    * Value: A string "Agenda", indicating the AgendaView.
    */
  var Agenda: java.lang.String
  /**
    * Gets a string representation equivalent of Day enumeration for use in client scripts.
    * Value: A string "Day", indicating the DayView.
    */
  var Day: java.lang.String
  /**
    * Gets a string representation equivalent of FullWeek enumeration for use in client scripts.
    * Value: A string "FullWeek", indicating the FullWeekView.
    */
  var FullWeek: java.lang.String
  /**
    * Gets a string representation equivalent of Month enumeration for use in client scripts.
    * Value: A string "Month", indicating the MonthView.
    */
  var Month: java.lang.String
  /**
    * Gets a string representation equivalent of Timeline enumeration for use in client scripts.
    * Value: A string "Timeline", indicating the TimelineView.
    */
  var Timeline: java.lang.String
  /**
    * Gets a string representation equivalent of Week enumeration for use in client scripts.
    * Value: A string "Week", indicating the WeekView.
    */
  var Week: java.lang.String
  /**
    * Gets a string representation equivalent of WorkWeek enumeration for use in client scripts.
    * Value: A string "WorkWeek", indicating the WorkWeekView.
    */
  var WorkWeek: java.lang.String
}

object ASPxSchedulerViewType {
  @scala.inline
  def apply(
    Agenda: java.lang.String,
    Day: java.lang.String,
    FullWeek: java.lang.String,
    Month: java.lang.String,
    Timeline: java.lang.String,
    Week: java.lang.String,
    WorkWeek: java.lang.String
  ): ASPxSchedulerViewType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Agenda")(Agenda)
    __obj.updateDynamic("Day")(Day)
    __obj.updateDynamic("FullWeek")(FullWeek)
    __obj.updateDynamic("Month")(Month)
    __obj.updateDynamic("Timeline")(Timeline)
    __obj.updateDynamic("Week")(Week)
    __obj.updateDynamic("WorkWeek")(WorkWeek)
    __obj.asInstanceOf[ASPxSchedulerViewType]
  }
}

