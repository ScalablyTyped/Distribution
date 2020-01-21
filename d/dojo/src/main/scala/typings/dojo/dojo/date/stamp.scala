package typings.dojo.dojo.date

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/date/stamp.html
  *
  * TODOC
  *
  */
@js.native
trait stamp extends js.Object {
  /**
    * Returns a Date object given a string formatted according to a subset of the ISO-8601 standard.
    * Accepts a string formatted according to a profile of ISO8601 as defined by
    * RFC3339, except that partial input is allowed.
    * Can also process dates as specified by the W3C
    * The following combinations are valid:
    *
    * dates only
    * yyyy
    * yyyy-MM
    * yyyy-MM-dd
    *
    * times only, with an optional time zone appended
    * THH:mm
    * THH:mm:ss
    * THH:mm:ss.SSS
    *
    * and "datetimes" which could be any combination of the above
    * timezones may be specified as Z (for UTC) or +/- followed by a time expression HH:mm
    * Assumes the local time zone if not specified.  Does not validate.  Improperly formatted
    * input may return null.  Arguments which are out of bounds will be handled
    * by the Date constructor (e.g. January 32nd typically gets resolved to February 1st)
    * Only years between 100 and 9999 are supported.
    *
    * @param formattedString A string such as 2005-06-30T08:05:00-07:00 or 2005-06-30 or T08:05:00
    * @param defaultTime               OptionalUsed for defaults for fields omitted in the formattedString.Uses 1970-01-01T00:00:00.0Z by default.
    */
  def fromISOString(formattedString: String): js.Any = js.native
  def fromISOString(formattedString: String, defaultTime: Double): js.Any = js.native
  /**
    * Format a Date object as a string according a subset of the ISO-8601 standard
    * When options.selector is omitted, output follows RFC3339
    * The local time zone is included as an offset from GMT, except when selector=='time' (time without a date)
    * Does not check bounds.  Only years between 100 and 9999 are supported.
    *
    * @param dateObject A Date object
    * @param options               OptionalAn object with the following properties:selector (String): "date" or "time" for partial formatting of the Date object.Both date and time will be formatted by default.zulu (Boolean): if true, UTC/GMT is used for a timezonemilliseconds (Boolean): if true, output milliseconds
    */
  def toISOString(dateObject: Date): js.Any = js.native
  def toISOString(dateObject: Date, options: js.Object): js.Any = js.native
}

