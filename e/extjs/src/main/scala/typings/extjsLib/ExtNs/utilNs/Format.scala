package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Format")
@js.native
class Format () extends js.Object

@JSGlobal("Ext.util.Format")
@js.native
object Format extends js.Object {
  /** [Property] (Boolean) */
  var currencyAtEnd: scala.Boolean = js.native
  /** [Property] (Number) */
  var currencyPrecision: scala.Double = js.native
  /** [Property] (String) */
  var currencySign: java.lang.String = js.native
  /** [Property] (String) */
  var decimalSeparator: java.lang.String = js.native
  /** [Property] (String) */
  var thousandSeparator: java.lang.String = js.native
  /** [Method] Formats an object of name value properties as HTML element attribute values suitable for using when creating textual
  		* @param attributes Object An object containing the HTML attributes as properties eg: {height:40, vAlign:'top'}
  		*/
  def attributes(): scala.Unit = js.native
  def attributes(attributes: js.Any): scala.Unit = js.native
  /** [Method] Alias for Ext String capitalize
  		* @param string String
  		* @returns String
  		*/
  def capitalize(): java.lang.String = js.native
  def capitalize(string: java.lang.String): java.lang.String = js.native
  /** [Method] Format a number as a currency
  		* @param value Number/String The numeric value to format
  		* @param sign String The currency sign to use (defaults to currencySign)
  		* @param decimals Number The number of decimals to use for the currency (defaults to currencyPrecision)
  		* @param end Boolean True if the currency sign should be at the end of the string (defaults to currencyAtEnd)
  		* @returns String The formatted currency string
  		*/
  def currency(): java.lang.String = js.native
  def currency(value: js.Any): java.lang.String = js.native
  def currency(value: js.Any, sign: java.lang.String): java.lang.String = js.native
  def currency(value: js.Any, sign: java.lang.String, decimals: scala.Double): java.lang.String = js.native
  def currency(value: js.Any, sign: java.lang.String, decimals: scala.Double, end: scala.Boolean): java.lang.String = js.native
  /** [Method] Formats the passed date using the specified format pattern
  		* @param value String/Date The value to format. If a string is passed, it is converted to a Date by the Javascript's built-in Date.parse method.
  		* @param format String Any valid date format string. Defaults to Ext.Date.defaultFormat.
  		* @returns String The formatted date string.
  		*/
  def date(): java.lang.String = js.native
  def date(value: js.Any): java.lang.String = js.native
  def date(value: js.Any, format: java.lang.String): java.lang.String = js.native
  /** [Method] Returns a date rendering function that can be reused to apply a date format multiple times efficiently
  		* @param format String Any valid date format string. Defaults to Ext.Date.defaultFormat.
  		* @returns Function The date formatting function
  		*/
  def dateRenderer(): js.Any = js.native
  def dateRenderer(format: java.lang.String): js.Any = js.native
  /** [Method] Checks a reference and converts it to the default value if it s empty
  		* @param value Object Reference to check
  		* @param defaultValue String The value to insert of it's undefined.
  		* @returns String
  		*/
  def defaultValue(): java.lang.String = js.native
  def defaultValue(value: js.Any): java.lang.String = js.native
  def defaultValue(value: js.Any, defaultValue: java.lang.String): java.lang.String = js.native
  /** [Method] Alias for Ext String ellipsis
  		* @param value String The string to truncate.
  		* @param length Number The maximum length to allow before truncating.
  		* @param word Boolean true to try to find a common word break.
  		* @returns String The converted text.
  		*/
  def ellipsis(): java.lang.String = js.native
  def ellipsis(value: java.lang.String): java.lang.String = js.native
  def ellipsis(value: java.lang.String, length: scala.Double): java.lang.String = js.native
  def ellipsis(value: java.lang.String, length: scala.Double, word: scala.Boolean): java.lang.String = js.native
  /** [Method] Escapes the passed string for use in a regular expression
  		* @param str String
  		* @returns String
  		*/
  def escapeRegex(): java.lang.String = js.native
  def escapeRegex(str: java.lang.String): java.lang.String = js.native
  /** [Method] Simple format for a file size xxx bytes xxx KB xxx MB
  		* @param size Number/String The numeric value to format
  		* @returns String The formatted file size
  		*/
  def fileSize(): java.lang.String = js.native
  def fileSize(size: js.Any): java.lang.String = js.native
  /** [Method] Alias for Ext String format
  		* @param string String The tokenized string to be formatted.
  		* @param values Mixed... The values to replace tokens {0}, {1}, etc in order.
  		* @returns String The formatted string.
  		*/
  def format(string: java.lang.String, values: js.Any*): java.lang.String = js.native
  /** [Method] Alias for Ext String htmlDecode
  		* @param value String The string to decode.
  		* @returns String The decoded text.
  		*/
  def htmlDecode(): java.lang.String = js.native
  def htmlDecode(value: java.lang.String): java.lang.String = js.native
  /** [Method] Alias for Ext String htmlEncode
  		* @param value String The string to encode.
  		* @returns String The encoded text.
  		*/
  def htmlEncode(): java.lang.String = js.native
  def htmlEncode(value: java.lang.String): java.lang.String = js.native
  /** [Method] Alias for Ext String leftPad
  		* @param string String The original string.
  		* @param size Number The total length of the output string.
  		* @param character String The character with which to pad the original string.
  		* @returns String The padded string.
  		*/
  def leftPad(): java.lang.String = js.native
  def leftPad(string: java.lang.String): java.lang.String = js.native
  def leftPad(string: java.lang.String, size: scala.Double): java.lang.String = js.native
  def leftPad(string: java.lang.String, size: scala.Double, character: java.lang.String): java.lang.String = js.native
  /** [Method] Converts a string to all lower case letters
  		* @param value String The text to convert
  		* @returns String The converted text
  		*/
  def lowercase(): java.lang.String = js.native
  def lowercase(value: java.lang.String): java.lang.String = js.native
  /** [Method] It does simple math for use in a template for example  var tpl  new Ext Template  value 10 value math 10
  		* @returns Function A function that operates on the passed value.
  		*/
  def math(): js.Any = js.native
  /** [Method] Converts newline characters to the HTML tag lt br gt
  		* @param v String The string value to format.
  		* @returns String The string with embedded &lt;br/&gt; tags in place of newlines.
  		*/
  def nl2br(): java.lang.String = js.native
  def nl2br(v: java.lang.String): java.lang.String = js.native
  /** [Method] Formats the passed number according to the passed format string
  		* @param v Number The number to format.
  		* @param format String The way you would like to format this text.
  		* @returns String The formatted number.
  		*/
  def number(): java.lang.String = js.native
  def number(v: scala.Double): java.lang.String = js.native
  def number(v: scala.Double, format: java.lang.String): java.lang.String = js.native
  /** [Method] Returns a number rendering function that can be reused to apply a number format multiple times efficiently
  		* @param format String Any valid number format string for number
  		* @returns Function The number formatting function
  		*/
  def numberRenderer(): js.Any = js.native
  def numberRenderer(format: java.lang.String): js.Any = js.native
  /** [Method] Parses a number or string representing margin sizes into an object
  		* @param v Number/String The encoded margins
  		* @returns Object An object with margin sizes for top, right, bottom and left
  		*/
  def parseBox(): js.Any = js.native
  def parseBox(v: js.Any): js.Any = js.native
  /** [Method] Selectively do a plural form of a word based on a numeric value
  		* @param value Number The value to compare against
  		* @param singular String The singular form of the word
  		* @param plural String The plural form of the word (defaults to the singular with an "s")
  		*/
  def plural(): scala.Unit = js.native
  def plural(value: scala.Double): scala.Unit = js.native
  def plural(value: scala.Double, singular: java.lang.String): scala.Unit = js.native
  def plural(value: scala.Double, singular: java.lang.String, plural: java.lang.String): scala.Unit = js.native
  /** [Method] Rounds the passed number to the required decimal precision
  		* @param value Number/String The numeric value to round.
  		* @param precision Number The number of decimal places to which to round the first parameter's value.
  		* @returns Number The rounded value.
  		*/
  def round(): scala.Double = js.native
  def round(value: js.Any): scala.Double = js.native
  def round(value: js.Any, precision: scala.Double): scala.Double = js.native
  /** [Method] Strips all script tags
  		* @param value Object The text from which to strip script tags
  		* @returns String The stripped text
  		*/
  def stripScripts(): java.lang.String = js.native
  def stripScripts(value: js.Any): java.lang.String = js.native
  /** [Method] Strips all HTML tags
  		* @param value Object The text from which to strip tags
  		* @returns String The stripped text
  		*/
  def stripTags(): java.lang.String = js.native
  def stripTags(value: js.Any): java.lang.String = js.native
  /** [Method] Returns a substring from within an original string
  		* @param value String The original text
  		* @param start Number The start index of the substring
  		* @param length Number The length of the substring
  		* @returns String The substring
  		*/
  def substr(): java.lang.String = js.native
  def substr(value: java.lang.String): java.lang.String = js.native
  def substr(value: java.lang.String, start: scala.Double): java.lang.String = js.native
  def substr(value: java.lang.String, start: scala.Double, length: scala.Double): java.lang.String = js.native
  /** [Method] Alias for Ext String trim
  		* @param string String The string to trim.
  		* @returns String The trimmed string.
  		*/
  def trim(): java.lang.String = js.native
  def trim(string: java.lang.String): java.lang.String = js.native
  /** [Method] Checks a reference and converts it to empty string if it is undefined
  		* @param value Object Reference to check
  		* @returns Object Empty string if converted, otherwise the original value
  		*/
  def undef(): js.Any = js.native
  def undef(value: js.Any): js.Any = js.native
  /** [Method] Converts a string to all upper case letters
  		* @param value String The text to convert
  		* @returns String The converted text
  		*/
  def uppercase(): java.lang.String = js.native
  def uppercase(value: java.lang.String): java.lang.String = js.native
  /** [Method] Format a number as US currency
  		* @param value Number/String The numeric value to format
  		* @returns String The formatted currency string
  		*/
  def usMoney(): java.lang.String = js.native
  def usMoney(value: js.Any): java.lang.String = js.native
}

