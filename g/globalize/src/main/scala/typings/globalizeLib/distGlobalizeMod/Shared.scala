package typings
package globalizeLib.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shared extends js.Object {
  var cldr: cldrjsLib.cldrjsMod.CldrStatic = js.native
  /**
  		 * Return a function that formats a currency according to the given options or locale's defaults.
  		 * The returned function is invoked with one argument: the Number value to be formatted.
  		 * @param {string} currency 3-letter currency code as defined by ISO 4217, eg. USD.
  		 * @param {CurrencyFormatterOptions} options A JSON object including none or any of the following options.
  		 * @returns {Function} Return a function that formats a currency
  		 */
  def currencyFormatter(currency: java.lang.String): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def currencyFormatter(
    currency: java.lang.String,
    options: globalizeLib.distGlobalizeCurrencyMod.distGlobalizeMod.CurrencyFormatterOptions
  ): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  /**
  		 * .dateFormatter( options )
  		 * @param {DateFormatterOptions} options see date/expand_pattern for more info.
  		 * @returns {Function} Return a function that formats a date according to the given `options` and the default/instance locale.
  		 */
  def dateFormatter(): js.Function1[/* value */ stdLib.Date, java.lang.String] = js.native
  def dateFormatter(options: globalizeLib.distGlobalizeDateMod.distGlobalizeMod.DateFormatterOptions): js.Function1[/* value */ stdLib.Date, java.lang.String] = js.native
  //Return a function that parses a string representing a date into a JavaScript Date object according to the given options. The default parsing assumes numeric year, month, and day (i.e., { skeleton: "yMd" }).
  def dateParser(): js.Function1[/* value */ java.lang.String, stdLib.Date] = js.native
  def dateParser(options: globalizeLib.distGlobalizeDateMod.distGlobalizeMod.DateFormatterOptions): js.Function1[/* value */ java.lang.String, stdLib.Date] = js.native
  /**
  		 * Return a currency formatted according to the given options or locale's defaults.
  		 * @param {number} value The value to format.
  		 * @param {string} currency 3-letter currency code as defined by ISO 4217, eg. USD.
  		 * @param {CurrencyFormatterOptions} options A JSON object including none or any of the following options.
  		 * @returns {string} Return a string formatted in the currency according to the value and the options
  		 */
  def formatCurrency(value: scala.Double, currency: java.lang.String): java.lang.String = js.native
  def formatCurrency(
    value: scala.Double,
    currency: java.lang.String,
    options: globalizeLib.distGlobalizeCurrencyMod.distGlobalizeMod.CurrencyFormatterOptions
  ): java.lang.String = js.native
  //Alias for .dateFormatter( [options] )( value ).
  def formatDate(value: stdLib.Date): java.lang.String = js.native
  def formatDate(
    value: stdLib.Date,
    options: globalizeLib.distGlobalizeDateMod.distGlobalizeMod.DateFormatterOptions
  ): java.lang.String = js.native
  /**
  		 * Formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string
  		 * @param path String or Array containing the path of the message content, eg. "greetings/bye", or [ "greetings", "bye" ].
  		 * @param variables Variables can be Objects, where each property can be referenced by name inside a message; or Arrays, where each entry of the Array can be used inside a message, using numeric indices. When passing one or more arguments of other types, they're converted to an Array and used as such.
  		 * @returns {string} Return a user-readable string.
  		 */
  def formatMessage(path: java.lang.String): java.lang.String = js.native
  def formatMessage(path: java.lang.String, variables: java.lang.String): java.lang.String = js.native
  def formatMessage(path: java.lang.String, variables: js.Array[java.lang.String]): java.lang.String = js.native
  def formatMessage(path: java.lang.String, variables: js.Object): java.lang.String = js.native
  def formatMessage(path: js.Array[java.lang.String]): java.lang.String = js.native
  def formatMessage(path: js.Array[java.lang.String], variables: java.lang.String): java.lang.String = js.native
  def formatMessage(path: js.Array[java.lang.String], variables: js.Array[java.lang.String]): java.lang.String = js.native
  def formatMessage(path: js.Array[java.lang.String], variables: js.Object): java.lang.String = js.native
  /**
  		 * Return a number formatted according to the given options or locale's defaults.
  		 * @param {number} value The number to format
  		 * @param {NumberFormatterOptions} options A JSON object including none or any of the following options.
  		 * style Optional String decimal (default), or percent.
  		 * minimumIntegerDigits Optional Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
  		 * minimumFractionDigits and maximumFractionDigits Optional Non-negative integer Number values indicating the minimum and maximum fraction digits to be used. Numbers will be rounded or padded with trailing zeroes if necessary. Either one or both of these properties must be present. If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
  		 * minimumSignificantDigits and maximumSignificantDigits Optional Positive integer Number values indicating the minimum and maximum fraction digits to be shown. Either none or both of these properties are present. If they are, they override minimum and maximum integer and fraction digits. The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
  		 * round Optional String with rounding method ceil, floor, round (default), or truncate.
  		 * useGrouping Optional Boolean (default is true) value indicating whether a grouping separator should be used.
  		 * @returns {string} Return the number formatted
  		 */
  def formatNumber(value: scala.Double): java.lang.String = js.native
  def formatNumber(
    value: scala.Double,
    options: globalizeLib.distGlobalizeNumberMod.distGlobalizeMod.NumberFormatterOptions
  ): java.lang.String = js.native
  /**
  		 * Return a relative time according to the given unit
  		 * @param {number} value The number to be formatted.
  		 * @param {string} unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc.
  		 * @param options form: [String] eg. "short" or "narrow". Or falsy for default long form.
  		 * @returns {string} Return a relative time according to the given unit.
  		 */
  def formatRelativeTime(value: scala.Double, unit: java.lang.String): java.lang.String = js.native
  def formatRelativeTime(
    value: scala.Double,
    unit: java.lang.String,
    options: globalizeLib.distGlobalizeRelativeDashTimeMod.distGlobalizeMod.RelativeTimeFormatterOptions
  ): java.lang.String = js.native
  /**
  		 * Alias for .unitFormatter( unit, options )( value ).
  		 * @param {number} value The number to be formatted.
  		 * @param {string} unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc. Could also be a compound unit, eg. "mile-per-hour" or "mile/hour"
  		 * @param {UnitFormatterOptions} options form: [String] eg. "long", "short" or "narrow".
  		 * @returns {string} Returns the unit formatted.
  		 */
  def formatUnit(value: scala.Double, unit: java.lang.String): java.lang.String = js.native
  def formatUnit(
    value: scala.Double,
    unit: java.lang.String,
    options: globalizeLib.distGlobalizeUnitMod.distGlobalizeMod.UnitFormatterOptions
  ): java.lang.String = js.native
  /**
  		 * Return a function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
  		 * @param path String or Array containing the path of the message content, eg. "greetings/bye", or [ "greetings", "bye" ].
  		 * @returns {Function} Return A function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
  		 */
  def messageFormatter(path: java.lang.String): js.Function1[
    /* variables */ js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Object], 
    java.lang.String
  ] = js.native
  def messageFormatter(path: js.Array[java.lang.String]): js.Function1[
    /* variables */ js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Object], 
    java.lang.String
  ] = js.native
  /**
  		 * Return a function that formats a number according to the given options or locale's defaults.
  		 * @param {NumberFormatterOptions} options A JSON object including none or any of the following options.
  		 * style Optional String decimal (default), or percent.
  		 * minimumIntegerDigits Optional Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
  		 * minimumFractionDigits and maximumFractionDigits Optional Non-negative integer Number values indicating the minimum and maximum fraction digits to be used. Numbers will be rounded or padded with trailing zeroes if necessary. Either one or both of these properties must be present. If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
  		 * minimumSignificantDigits and maximumSignificantDigits Optional Positive integer Number values indicating the minimum and maximum fraction digits to be shown. Either none or both of these properties are present. If they are, they override minimum and maximum integer and fraction digits. The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
  		 * round Optional String with rounding method ceil, floor, round (default), or truncate.
  		 * useGrouping Optional Boolean (default is true) value indicating whether a grouping separator should be used.
  		 * @returns {Function} Return a function that formats a number according to the given options.
  		 */
  def numberFormatter(): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def numberFormatter(options: globalizeLib.distGlobalizeNumberMod.distGlobalizeMod.NumberFormatterOptions): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  /**
  		 * Return a function that parses a string representing a number according to the given options or locale's defaults.
  		 * @param {NumberParserOptions} options A JSON object including none or any of the following options.
  		 * style Optional String decimal (default), or percent.
  		 * @returns {Function} Return a function that parses a String representing a number according to the given options. If value is invalid, NaN is returned.
  		 */
  def numberParser(): js.Function1[/* value */ java.lang.String, scala.Double] = js.native
  def numberParser(options: globalizeLib.distGlobalizeNumberMod.distGlobalizeMod.NumberParserOptions): js.Function1[/* value */ java.lang.String, scala.Double] = js.native
  /**
  		 * Alias for .dateParser( [options] )( value ).
  		 * @param {string} value The object whose module id you wish to determine.
  		 * @param {DateFormatterOptions} options The object whose module id you wish to determine.
  		 * @returns {Date} Return the value as a Date.
  		 */
  def parseDate(value: java.lang.String): stdLib.Date = js.native
  def parseDate(
    value: java.lang.String,
    options: globalizeLib.distGlobalizeDateMod.distGlobalizeMod.DateFormatterOptions
  ): stdLib.Date = js.native
  /**
  		 * A function that parses a string representing a number according to the given options or locale's defaults.
  		 * @param {string} value The number as string to parse
  		 * @param {NumberParserOptions} options A JSON object including none or any of the following options.
  		 * style Optional String decimal (default), or percent.
  		 * @returns {number} Return a number according to the given options. If value is invalid, NaN is returned.
  		 */
  def parseNumber(value: java.lang.String): scala.Double = js.native
  def parseNumber(
    value: java.lang.String,
    options: globalizeLib.distGlobalizeNumberMod.distGlobalizeMod.NumberParserOptions
  ): scala.Double = js.native
  /**
  		 * Returns the value's corresponding plural group: zero, one, two, few, many, or other.
  		 * @param {number} value A Number for which to return the plural group.
  		 * @param {PluralGeneratorOptions} options A JSON object including none or any of the following options.
  		 * type Optional String cardinal (default), or ordinal.
  		 * @returns {string} Returns the value's corresponding plural group: zero, one, two, few, many, or other.
  		 */
  def plural(value: scala.Double): java.lang.String = js.native
  def plural(
    value: scala.Double,
    options: globalizeLib.distGlobalizePluralMod.distGlobalizeMod.PluralGeneratorOptions
  ): java.lang.String = js.native
  /**
  		 * Return a function that returns the value's corresponding plural group: zero, one, two, few, many, or other.
  		 * The returned function is invoked with one argument: the Number value for which to return the plural group.
  		 * @param {PluralGeneratorOptions} options A JSON object including none or any of the following options.
  		 * type Optional String cardinal (default), or ordinal.
  		 * @returns {Function} Return a function that returns the value's corresponding plural group: zero, one, two, few, many, or other.
  		 */
  def pluralGenerator(): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def pluralGenerator(options: globalizeLib.distGlobalizePluralMod.distGlobalizeMod.PluralGeneratorOptions): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  /**
  		 * Returns a function that formats a relative time according to the given unit, options, and the default/instance locale.
  		 * The returned function is invoked with one argument: the number value to be formatted.
  		 * @param unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc.
  		 * @param options form: [String] eg. "short" or "narrow". Or falsy for default long form.
  		 * @returns {Function} Returns a function that formats a relative time according to the given unit.
  		 */
  def relativeTimeFormatter(unit: java.lang.String): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def relativeTimeFormatter(
    unit: java.lang.String,
    options: globalizeLib.distGlobalizeRelativeDashTimeMod.distGlobalizeMod.RelativeTimeFormatterOptions
  ): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  /**
  		 * Returns a function that formats a unit according to the given unit, options, and the default/instance locale.
  		 * The returned function is invoked with one argument: the number value to be formatted.
  		 * @param unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc. Could also be a compound unit, eg. "mile-per-hour" or "mile/hour"
  		 * @param options form: [String] eg. "long", "short" or "narrow".
  		 * @returns {Function} Returns a function that formats a unit according to the given unit, options, and the default/instance locale.
  		 */
  def unitFormatter(unit: java.lang.String): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def unitFormatter(
    unit: java.lang.String,
    options: globalizeLib.distGlobalizeUnitMod.distGlobalizeMod.UnitFormatterOptions
  ): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
}

