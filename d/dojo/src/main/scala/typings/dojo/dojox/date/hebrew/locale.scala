package typings.dojo.dojox.date.hebrew

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/hebrew/locale.html
  *
  *
  */
trait locale extends js.Object {
  /**
    * Add a reference to a bundle containing localized custom formats to be
    * used by date/time formatting and parsing routines.
    * The user may add custom localized formats where the bundle has properties following the
    * same naming convention used by dojo.cldr: dateFormat-xxxx / timeFormat-xxxx
    * The pattern string should match the format used by the CLDR.
    * See dojo.date.locale.format() for details.
    * The resources must be loaded by dojo.requireLocalization() prior to use
    *
    * @param packageName
    * @param bundleName
    */
  def addCustomFormats(packageName: String, bundleName: String): Unit
  /**
    * Format a Date object as a String, using  settings.
    * Create a string from a hebrew.Date object using a known pattern.
    * By default, this method formats both date and time from dateObject.
    * Default formatting lengths is 'short'
    *
    * @param dateObject the date and/or time to be formatted.  If a time only is formatted,the values in the year, month, and day fields are irrelevant.  Theopposite is true when formatting only dates.
    * @param options               Optional
    */
  def format(dateObject: typings.dojo.dojox.date.hebrew, options: js.Object): Unit
  /**
    * Used to get localized strings from dojo.cldr for day or month names.
    *
    * @param item 'months' || 'days'
    * @param type 'wide' || 'narrow' || 'abbr' (e.g. "Monday", "Mon", or "M" respectively, in English)
    * @param context               Optional
    * @param locale               Optionaloverride locale used to find the names
    * @param date               Optionalrequired for item=months to determine leap month name
    */
  def getNames(item: String, `type`: String, context: String, locale: String, date: Date): Unit
  /**
    * This function parse string date value according to options
    *
    * @param value
    * @param options               Optional
    */
  def parse(value: String, options: js.Object): Unit
  /**
    * Builds the regular needed to parse a hebrew.Date
    *
    * @param options               Optional
    */
  def regexp(options: js.Object): Unit
}

object locale {
  @scala.inline
  def apply(
    addCustomFormats: (String, String) => Unit,
    format: (typings.dojo.dojox.date.hebrew, js.Object) => Unit,
    getNames: (String, String, String, String, Date) => Unit,
    parse: (String, js.Object) => Unit,
    regexp: js.Object => Unit
  ): locale = {
    val __obj = js.Dynamic.literal(addCustomFormats = js.Any.fromFunction2(addCustomFormats), format = js.Any.fromFunction2(format), getNames = js.Any.fromFunction5(getNames), parse = js.Any.fromFunction2(parse), regexp = js.Any.fromFunction1(regexp))
  
    __obj.asInstanceOf[locale]
  }
}

