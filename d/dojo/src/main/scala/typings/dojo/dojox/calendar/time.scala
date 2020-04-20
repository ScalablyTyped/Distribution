package typings.dojo.dojox.calendar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/time.html
  *
  *
  */
trait time extends js.Object {
  /**
    * floors the date to the unit.
    *
    * @param date The date/time to floor.
    * @param unit The unit. Valid values are "minute", "hour", "day".
    * @param steps Valid for "minute" or "hour" units.
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def floor(date: Date, unit: String, steps: Double, reuse: Boolean, dateClassObj: js.Object): Date
  /**
    * Floors the specified date to the start of day.
    *
    * @param d
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def floorToDay(d: js.Any, reuse: Boolean, dateClassObj: js.Object): Date
  /**
    * Floors the specified date to the start of the date's month.
    *
    * @param d
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def floorToMonth(d: js.Any, reuse: Boolean, dateClassObj: js.Object): Date
  /**
    * Floors the specified date to the beginning of week.
    *
    * @param d Date to floor.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    * @param dateModule               OptionalObject that contains the "add" method. By default dojo.date is used.
    * @param firstDayOfWeek               OptionalOptional day of week that overrides the one provided by the CLDR.
    * @param locale               OptionalOptional locale used to determine first day of week.
    */
  def floorToWeek(d: Date, dateClassObj: js.Object, dateModule: js.Object, firstDayOfWeek: Double, locale: String): js.Any
  /**
    * Tests if the specified date represents the starts of day.
    *
    * @param d The date to test.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    * @param dateModule               OptionalObject that contains the "add" method. By default dojo.date is used.
    */
  def isStartOfDay(d: Date, dateClassObj: js.Object, dateModule: js.Object): Boolean
  /**
    * Returns whether the specified date is in the current day.
    *
    * @param d The date to test.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def isToday(d: Date, dateClassObj: js.Object): Boolean
  /**
    * Creates a new Date object.
    *
    * @param obj This object can have several values:- the time in milliseconds since gregorian epoch.- a Date instance- a String instance that can be decoded by the dojo/date/stamp class.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def newDate(obj: js.Object, dateClassObj: js.Object): js.Any
}

object time {
  @scala.inline
  def apply(
    floor: (Date, String, Double, Boolean, js.Object) => Date,
    floorToDay: (js.Any, Boolean, js.Object) => Date,
    floorToMonth: (js.Any, Boolean, js.Object) => Date,
    floorToWeek: (Date, js.Object, js.Object, Double, String) => js.Any,
    isStartOfDay: (Date, js.Object, js.Object) => Boolean,
    isToday: (Date, js.Object) => Boolean,
    newDate: (js.Object, js.Object) => js.Any
  ): time = {
    val __obj = js.Dynamic.literal(floor = js.Any.fromFunction5(floor), floorToDay = js.Any.fromFunction3(floorToDay), floorToMonth = js.Any.fromFunction3(floorToMonth), floorToWeek = js.Any.fromFunction5(floorToWeek), isStartOfDay = js.Any.fromFunction3(isStartOfDay), isToday = js.Any.fromFunction2(isToday), newDate = js.Any.fromFunction2(newDate))
    __obj.asInstanceOf[time]
  }
}

