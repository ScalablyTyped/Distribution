package typings.dojo.dojo.date

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/date/locale.html
  *
  * This modules defines dojo/date/locale, localization methods for Date.
  *
  */
@js.native
trait locale_ extends js.Object {
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

