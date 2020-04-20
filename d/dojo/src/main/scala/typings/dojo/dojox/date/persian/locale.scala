package typings.dojo.dojox.date.persian

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/persian/locale.html
  *
  *
  */
trait locale extends js.Object {
  /**
    *
    */
  var months: js.Object
  /**
    *
    */
  var weekDays: js.Object
  /**
    * Add a reference to a bundle containing localized custom formats to be
    * used by date/time formatting and parsing routines.
    *
    * @param packageName
    * @param bundleName
    */
  def addCustomFormats(packageName: String, bundleName: String): Unit
  /**
    * Format a Date object as a String, using  settings.
    *
    * @param dateObject
    * @param options               Optional
    */
  def format(dateObject: Date, options: js.Object): Unit
  /**
    * Used to get localized strings from dojo.cldr for day or month names.
    *
    * @param item
    * @param type
    * @param context               Optional
    * @param locale               Optional
    * @param date               Optional
    */
  def getNames(item: String, `type`: String, context: String, locale: String, date: Date): js.Any
  /**
    * This function parse string date value according to options
    *
    * @param value
    * @param options               Optional
    */
  def parse(value: String, options: js.Object): Unit
  /**
    * Builds the regular needed to parse a persian.Date
    *
    * @param options               Optional
    */
  def regexp(options: js.Object): Unit
}

object locale {
  @scala.inline
  def apply(
    addCustomFormats: (String, String) => Unit,
    format: (Date, js.Object) => Unit,
    getNames: (String, String, String, String, Date) => js.Any,
    months: js.Object,
    parse: (String, js.Object) => Unit,
    regexp: js.Object => Unit,
    weekDays: js.Object
  ): locale = {
    val __obj = js.Dynamic.literal(addCustomFormats = js.Any.fromFunction2(addCustomFormats), format = js.Any.fromFunction2(format), getNames = js.Any.fromFunction5(getNames), months = months.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), regexp = js.Any.fromFunction1(regexp), weekDays = weekDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[locale]
  }
}

