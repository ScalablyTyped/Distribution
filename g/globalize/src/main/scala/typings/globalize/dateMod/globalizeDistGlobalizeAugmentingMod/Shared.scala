package typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shared extends js.Object {
  
  /**
    * .dateFormatter( options )
    * @param {DateFormatterOptions} options see date/expand_pattern for more info.
    * @returns {Function} Return a function that formats a date according to the given `options` and the default/instance locale.
    */
  def dateFormatter(): js.Function1[/* value */ Date, String] = js.native
  def dateFormatter(options: DateFormatterOptions): js.Function1[/* value */ Date, String] = js.native
  
  //Return a function that parses a string representing a date into a JavaScript Date object according to the given options. The default parsing assumes numeric year, month, and day (i.e., { skeleton: "yMd" }).
  def dateParser(): js.Function1[/* value */ String, Date] = js.native
  def dateParser(options: DateFormatterOptions): js.Function1[/* value */ String, Date] = js.native
  
  /**
    * .dateToPartsFormatter( options )
    * @param {DateFormatterOptions} options see date/expand_pattern for more info.
    * @returns {Function} Return a function that formats a date into parts tokens according to the given options. The default formatting is numeric year, month, and day (i.e., `{ skeleton: "yMd" }`).
    */
  def dateToPartsFormatter(): js.Function1[/* value */ Date, js.Array[DateFormatPart]] = js.native
  def dateToPartsFormatter(options: DateFormatterOptions): js.Function1[/* value */ Date, js.Array[DateFormatPart]] = js.native
  
  //Alias for .dateFormatter( [options] )( value ).
  def formatDate(value: Date): String = js.native
  def formatDate(value: Date, options: DateFormatterOptions): String = js.native
  
  //Alias for .dateToPartsFormatter( [options] )( value ).
  def formatDateToParts(value: Date): js.Array[DateFormatPart] = js.native
  def formatDateToParts(value: Date, options: DateFormatterOptions): js.Array[DateFormatPart] = js.native
  
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
  def formatNumber(value: Double): String = js.native
  def formatNumber(
    value: Double,
    options: typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatterOptions
  ): String = js.native
  
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
  def numberFormatter(): js.Function1[/* value */ Double, String] = js.native
  def numberFormatter(options: typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatterOptions): js.Function1[/* value */ Double, String] = js.native
  
  /**
    * Return a function that parses a string representing a number according to the given options or locale's defaults.
    * @param {NumberParserOptions} options A JSON object including none or any of the following options.
    * style Optional String decimal (default), or percent.
    * @returns {Function} Return a function that parses a String representing a number according to the given options. If value is invalid, NaN is returned.
    */
  def numberParser(): js.Function1[/* value */ String, Double] = js.native
  def numberParser(options: typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberParserOptions): js.Function1[/* value */ String, Double] = js.native
  
  /**
    * Alias for .dateParser( [options] )( value ).
    * @param {string} value The object whose module id you wish to determine.
    * @param {DateFormatterOptions} options The object whose module id you wish to determine.
    * @returns {Date} Return the value as a Date.
    */
  def parseDate(value: String): Date = js.native
  def parseDate(value: String, options: DateFormatterOptions): Date = js.native
  
  /**
    * A function that parses a string representing a number according to the given options or locale's defaults.
    * @param {string} value The number as string to parse
    * @param {NumberParserOptions} options A JSON object including none or any of the following options.
    * style Optional String decimal (default), or percent.
    * @returns {number} Return a number according to the given options. If value is invalid, NaN is returned.
    */
  def parseNumber(value: String): Double = js.native
  def parseNumber(
    value: String,
    options: typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberParserOptions
  ): Double = js.native
}
