package typings
package devexpressDashWebLib

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
  var EveryDay: scala.Double
  /**
    * Specifies Friday.
    * Value: The integer 32 value.
    */
  var Friday: scala.Double
  /**
    * Specifies Monday.
    * Value: The integer 2 value.
    */
  var Monday: scala.Double
  /**
    * Specifies Saturday.
    * Value: The integer 64 value.
    */
  var Saturday: scala.Double
  /**
    * Specifies Sunday.
    * Value: The integer 1 value.
    */
  var Sunday: scala.Double
  /**
    * Specifies Thursday.
    * Value: The integer 16 value.
    */
  var Thursday: scala.Double
  /**
    * Specifies Tuesday.
    * Value: The integer 4 value.
    */
  var Tuesday: scala.Double
  /**
    * Specifies Wednesday.
    * Value: The integer 8 value.
    */
  var Wednesday: scala.Double
  /**
    * Specifies Saturday and Sunday.
    * Value: The integer 65 value.
    */
  var WeekendDays: scala.Double
  /**
    * Specifies work days (Monday, Tuesday, Wednesday, Thursday and Friday).
    * Value: The integer 62 value.
    */
  var WorkDays: scala.Double
}

object ASPxClientWeekDays {
  @scala.inline
  def apply(
    EveryDay: scala.Double,
    Friday: scala.Double,
    Monday: scala.Double,
    Saturday: scala.Double,
    Sunday: scala.Double,
    Thursday: scala.Double,
    Tuesday: scala.Double,
    Wednesday: scala.Double,
    WeekendDays: scala.Double,
    WorkDays: scala.Double
  ): ASPxClientWeekDays = {
    val __obj = js.Dynamic.literal(EveryDay = EveryDay, Friday = Friday, Monday = Monday, Saturday = Saturday, Sunday = Sunday, Thursday = Thursday, Tuesday = Tuesday, Wednesday = Wednesday, WeekendDays = WeekendDays, WorkDays = WorkDays)
  
    __obj.asInstanceOf[ASPxClientWeekDays]
  }
}

