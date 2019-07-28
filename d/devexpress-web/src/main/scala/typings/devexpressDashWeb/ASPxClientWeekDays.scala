package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains days and groups of days for use in recurrence patterns.
  */
trait ASPxClientWeekDays extends js.Object {
  /**
    * Specifies every day of the week.
    * Value: The integer 127 value.
    */
  var EveryDay: Double
  /**
    * Specifies Friday.
    * Value: The integer 32 value.
    */
  var Friday: Double
  /**
    * Specifies Monday.
    * Value: The integer 2 value.
    */
  var Monday: Double
  /**
    * Specifies Saturday.
    * Value: The integer 64 value.
    */
  var Saturday: Double
  /**
    * Specifies Sunday.
    * Value: The integer 1 value.
    */
  var Sunday: Double
  /**
    * Specifies Thursday.
    * Value: The integer 16 value.
    */
  var Thursday: Double
  /**
    * Specifies Tuesday.
    * Value: The integer 4 value.
    */
  var Tuesday: Double
  /**
    * Specifies Wednesday.
    * Value: The integer 8 value.
    */
  var Wednesday: Double
  /**
    * Specifies Saturday and Sunday.
    * Value: The integer 65 value.
    */
  var WeekendDays: Double
  /**
    * Specifies work days (Monday, Tuesday, Wednesday, Thursday and Friday).
    * Value: The integer 62 value.
    */
  var WorkDays: Double
}

object ASPxClientWeekDays {
  @scala.inline
  def apply(
    EveryDay: Double,
    Friday: Double,
    Monday: Double,
    Saturday: Double,
    Sunday: Double,
    Thursday: Double,
    Tuesday: Double,
    Wednesday: Double,
    WeekendDays: Double,
    WorkDays: Double
  ): ASPxClientWeekDays = {
    val __obj = js.Dynamic.literal(EveryDay = EveryDay, Friday = Friday, Monday = Monday, Saturday = Saturday, Sunday = Sunday, Thursday = Thursday, Tuesday = Tuesday, Wednesday = Wednesday, WeekendDays = WeekendDays, WorkDays = WorkDays)
  
    __obj.asInstanceOf[ASPxClientWeekDays]
  }
}

