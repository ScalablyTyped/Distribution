package typings.dojo.dojox.date

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/relative.html
  *
  *
  */
trait relative extends js.Object {
  /**
    * Format a Date object as a String, using locale-specific settings,
    * relative to the current date or some other date.
    * Create a string from a Date object using the most significant information
    * and a known localized pattern.  This method formats both the date and
    * time from dateObject.  Formatting patterns are chosen appropriate to
    * the locale.
    *
    * If the day portion of the date falls within the current date (or the
    * relativeDate option, if present), then the time will be all that
    * is displayed
    *
    * If the day portion of the date falls within the past week (or the
    * week preceeding relativeDate, if present), then the display will show
    * day of week and time.  This functionality can be turned off by setting
    * weekCheck to false.
    *
    * If the year portion of the date falls within the current year (or the
    * year portion of relativeDate, if present), then the display will show
    * month and day.
    *
    * Otherwise, this function is equivalent to calling dojo.date.format with
    * formatLength of "medium"
    *
    * @param dateObject the date and time to be formatted.
    * @param options               OptionalAn object with the following properties:locale (String): override the locale used to determine formatting rulesrelativeDate (Date): Date to calculate relation to (defaults to new Date())weekCheck (boolean): Whether or not to display the day of week (defaults true)
    */
  def format(dateObject: Date, options: js.Object): Unit
}

object relative {
  @scala.inline
  def apply(format: (Date, js.Object) => Unit): relative = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format))
    __obj.asInstanceOf[relative]
  }
}

