package typings.devexpressDashWeb

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
  var Agenda: String
  /**
    * Gets a string representation equivalent of Day enumeration for use in client scripts.
    * Value: A string "Day", indicating the DayView.
    */
  var Day: String
  /**
    * Gets a string representation equivalent of FullWeek enumeration for use in client scripts.
    * Value: A string "FullWeek", indicating the FullWeekView.
    */
  var FullWeek: String
  /**
    * Gets a string representation equivalent of Month enumeration for use in client scripts.
    * Value: A string "Month", indicating the MonthView.
    */
  var Month: String
  /**
    * Gets a string representation equivalent of Timeline enumeration for use in client scripts.
    * Value: A string "Timeline", indicating the TimelineView.
    */
  var Timeline: String
  /**
    * Gets a string representation equivalent of Week enumeration for use in client scripts.
    * Value: A string "Week", indicating the WeekView.
    */
  var Week: String
  /**
    * Gets a string representation equivalent of WorkWeek enumeration for use in client scripts.
    * Value: A string "WorkWeek", indicating the WorkWeekView.
    */
  var WorkWeek: String
}

object ASPxSchedulerViewType {
  @scala.inline
  def apply(
    Agenda: String,
    Day: String,
    FullWeek: String,
    Month: String,
    Timeline: String,
    Week: String,
    WorkWeek: String
  ): ASPxSchedulerViewType = {
    val __obj = js.Dynamic.literal(Agenda = Agenda, Day = Day, FullWeek = FullWeek, Month = Month, Timeline = Timeline, Week = Week, WorkWeek = WorkWeek)
  
    __obj.asInstanceOf[ASPxSchedulerViewType]
  }
}

