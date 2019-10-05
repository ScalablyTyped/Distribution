package typings.dojo.dojo

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/date.html
  *
  * Date manipulation utilities
  *
  */
@js.native
trait date extends js.Object {
  /**
    * Add to a Date in intervals of different size, from milliseconds to years
    *
    * @param date Date object to start with
    * @param interval A string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond", "quarter", "week", "weekday"
    * @param amount How much to add to the date.
    */
  def add(date: Date, interval: String, amount: Double): js.Any = js.native
  /**
    * Compare two date objects by date, time, or both.
    * Returns 0 if equal, positive if a > b, else negative.
    *
    * @param date1 Date object
    * @param date2               OptionalDate object.  If not specified, the current Date is used.
    * @param portion               OptionalA string indicating the "date" or "time" portion of a Date object.Compares both "date" and "time" by default.  One of the following:"date", "time", "datetime"
    */
  def compare(date1: Date): Double = js.native
  def compare(date1: Date, date2: Date): Double = js.native
  def compare(date1: Date, date2: Date, portion: String): Double = js.native
  /**
    * Get the difference in a specific unit of time (e.g., number of
    * months, weeks, days, etc.) between two dates, rounded to the
    * nearest integer.
    *
    * @param date1 Date object
    * @param date2               OptionalDate object.  If not specified, the current Date is used.
    * @param interval               OptionalA string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond", "quarter", "week", "weekday"Defaults to "day".
    */
  def difference(date1: Date): js.Any = js.native
  def difference(date1: Date, date2: Date): js.Any = js.native
  def difference(date1: Date, date2: Date, interval: String): js.Any = js.native
  /**
    * Returns the number of days in the month used by dateObject
    *
    * @param dateObject
    */
  def getDaysInMonth(dateObject: Date): Double = js.native
  /**
    * Get the user's time zone as provided by the browser
    * Try to get time zone info from toString or toLocaleString method of
    * the Date object -- UTC offset is not a time zone.  See
    * http://www.twinsun.com/tz/tz-link.htm Note: results may be
    * inconsistent across browsers.
    *
    * @param dateObject Needed because the timezone may vary with time (daylight savings)
    */
  def getTimezoneName(dateObject: Date): js.Any = js.native
  /**
    * Determines if the year of the dateObject is a leap year
    * Leap years are years with an additional day YYYY-02-29, where the
    * year number is a multiple of four with the following exception: If
    * a year is a multiple of 100, then it is only a leap year if it is
    * also a multiple of 400. For example, 1900 was not a leap year, but
    * 2000 is one.
    *
    * @param dateObject
    */
  def isLeapYear(dateObject: Date): Boolean = js.native
}

@JSGlobal("dojo.date")
@js.native
object date extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/date/locale.html
    *
    * This modules defines dojo/date/locale, localization methods for Date.
    *
    */
  @js.native
  trait locale extends js.Object {
    /**
      * Add a reference to a bundle containing localized custom formats to be
      * used by date/time formatting and parsing routines.
      * The user may add custom localized formats where the bundle has properties following the
      * same naming convention used by dojo.cldr: dateFormat-xxxx / timeFormat-xxxx
      * The pattern string should match the format used by the CLDR.
      * See dojo/date/locale.format() for details.
      * The resources must be loaded by dojo.requireLocalization() prior to use
      *
      * @param packageName
      * @param bundleName
      */
    def addCustomFormats(packageName: String, bundleName: String): Unit = js.native
    /**
      * Format a Date object as a String, using locale-specific settings.
      * Create a string from a Date object using a known localized pattern.
      * By default, this method formats both date and time from dateObject.
      * Formatting patterns are chosen appropriate to the locale.  Different
      * formatting lengths may be chosen, with "full" used by default.
      * Custom patterns may be used or registered with translations using
      * the dojo/date/locale.addCustomFormats() method.
      * Formatting patterns are implemented using the syntax described at
      * unicode.org
      *
      * @param dateObject the date and/or time to be formatted.  If a time only is formatted,the values in the year, month, and day fields are irrelevant.  Theopposite is true when formatting only dates.
      * @param options               OptionalAn object with the following properties:selector (String): choice of 'time','date' (default: date and time)formatLength (String): choice of long, short, medium or full (plus any custom additions).  Defaults to 'short'datePattern (String): override pattern with this stringtimePattern (String): override pattern with this stringam (String): override strings for am in timespm (String): override strings for pm in timeslocale (String): override the locale used to determine formatting rulesfullYear (Boolean): (format only) use 4 digit years whenever 2 digit years are called forstrict (Boolean): (parse only) strict parsing, off by default
      */
    def format(dateObject: Date): js.Any = js.native
    def format(dateObject: Date, options: js.Object): js.Any = js.native
    /**
      * Used to get localized strings from dojo.cldr for day or month names.
      *
      * @param item 'months' || 'days'
      * @param type 'wide' || 'abbr' || 'narrow' (e.g. "Monday", "Mon", or "M" respectively, in English)
      * @param context               Optional'standAlone' || 'format' (default)
      * @param locale               Optionaloverride locale used to find the names
      */
    def getNames(item: String, `type`: String): js.Any = js.native
    def getNames(item: String, `type`: String, context: String): js.Any = js.native
    def getNames(item: String, `type`: String, context: String, locale: String): js.Any = js.native
    /**
      * Determines if the date falls on a weekend, according to local custom.
      *
      * @param dateObject               Optional
      * @param locale               Optional
      */
    def isWeekend(): Boolean = js.native
    def isWeekend(dateObject: Date): Boolean = js.native
    def isWeekend(dateObject: Date, locale: String): Boolean = js.native
    /**
      * Convert a properly formatted string to a primitive Date object,
      * using locale-specific settings.
      * Create a Date object from a string using a known localized pattern.
      * By default, this method parses looking for both date and time in the string.
      * Formatting patterns are chosen appropriate to the locale.  Different
      * formatting lengths may be chosen, with "full" used by default.
      * Custom patterns may be used or registered with translations using
      * the dojo/date/locale.addCustomFormats() method.
      *
      * Formatting patterns are implemented using the syntax described at
      * unicode.org
      * When two digit years are used, a century is chosen according to a sliding
      * window of 80 years before and 20 years after present year, for both yy and yyyy patterns.
      * year < 100CE requires strict mode.
      *
      * @param value A string representation of a date
      * @param options               OptionalAn object with the following properties:selector (String): choice of 'time','date' (default: date and time)formatLength (String): choice of long, short, medium or full (plus any custom additions).  Defaults to 'short'datePattern (String): override pattern with this stringtimePattern (String): override pattern with this stringam (String): override strings for am in timespm (String): override strings for pm in timeslocale (String): override the locale used to determine formatting rulesfullYear (Boolean): (format only) use 4 digit years whenever 2 digit years are called forstrict (Boolean): (parse only) strict parsing, off by default
      */
    def parse(value: String): js.Any = js.native
    def parse(value: String, options: js.Object): js.Any = js.native
    /**
      * Builds the regular needed to parse a localized date
      *
      * @param options               OptionalAn object with the following properties:selector (String): choice of 'time','date' (default: date and time)formatLength (String): choice of long, short, medium or full (plus any custom additions).  Defaults to 'short'datePattern (String): override pattern with this stringtimePattern (String): override pattern with this stringam (String): override strings for am in timespm (String): override strings for pm in timeslocale (String): override the locale used to determine formatting rulesfullYear (Boolean): (format only) use 4 digit years whenever 2 digit years are called forstrict (Boolean): (parse only) strict parsing, off by default
      */
    def regexp(): js.Any = js.native
    def regexp(options: js.Object): js.Any = js.native
  }
  
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
  
  @js.native
  object locale extends js.Object {
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojo/date/locale.__FormatOptions.html
      *
      *
      */
    @js.native
    class __FormatOptions () extends js.Object {
      /**
        * override strings for am in times
        *
        */
      var am: String = js.native
      /**
        * override pattern with this string
        *
        */
      var datePattern: String = js.native
      /**
        * choice of long, short, medium or full (plus any custom additions).  Defaults to 'short'
        *
        */
      var formatLength: String = js.native
      /**
        * (format only) use 4 digit years whenever 2 digit years are called for
        *
        */
      var fullYear: Boolean = js.native
      /**
        * override the locale used to determine formatting rules
        *
        */
      var locale: String = js.native
      /**
        * override strings for pm in times
        *
        */
      var pm: String = js.native
      /**
        * choice of 'time','date' (default: date and time)
        *
        */
      var selector: String = js.native
      /**
        * (parse only) strict parsing, off by default
        *
        */
      var strict: Boolean = js.native
      /**
        * override pattern with this string
        *
        */
      var timePattern: String = js.native
    }
    
  }
  
}

