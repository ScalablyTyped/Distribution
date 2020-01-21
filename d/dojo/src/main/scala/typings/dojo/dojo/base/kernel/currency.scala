package typings.dojo.dojo.base.kernel

import typings.dojo.dojo.currency.FormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.currency.html
  *
  * localized formatting and parsing routines for currencies
  * extends dojo.number to provide culturally-appropriate formatting of values
  * in various world currencies, including use of a currency symbol.  The currencies are specified
  * by a three-letter international symbol in all uppercase, and support for the currencies is
  * provided by the data in dojo.cldr.  The scripts generating dojo.cldr specify which
  * currency support is included.  A fixed number of decimal places is determined based
  * on the currency type and is not determined by the 'pattern' argument.  The fractional
  * portion is optional, by default, and variable length decimals are not supported.
  *
  */
@js.native
trait currency extends js.Object {
  /**
    * Format a Number as a currency, using locale-specific settings
    * Create a string from a Number using a known, localized pattern.
    * Formatting patterns
    * appropriate to the locale are chosen from the CLDR
    * as well as the appropriate symbols and delimiters and number of decimal places.
    *
    * @param value the number to be formatted.
    * @param options               Optional
    */
  def format(value: Double, options: FormatOptions): js.Any = js.native
  /**
    *
    * @param expression
    * @param options               OptionalAn object with the following properties:type (String, optional): Should not be set.  Value is assumed to be currency.currency (String, optional): an ISO4217 currency code, a three letter sequence like "USD".For use with dojo.currency only.symbol (String, optional): localized currency symbol. The default will be looked up in table of supported currencies in dojo.cldrA ISO4217 currency code will be used if not found.places (Number, optional): fixed number of decimal places to accept.  The default is determined based on which currency is used.fractional (Boolean|Array, optional): Whether to include the fractional portion, where the number of decimal places are implied by the currencyor explicit 'places' parameter.  The value [true,false] makes the fractional portion optional.By default for currencies, it the fractional portion is optional.pattern (String, optional): override formatting patternwith this string.  Default value is based on locale.  Overriding this property will defeatlocalization.  Literal characters in patterns are not supported.locale (String, optional): override the locale used to determine formatting rulesstrict (Boolean, optional): strict parsing, false by default.  Strict parsing requires input as produced by the format() method.Non-strict is more permissive, e.g. flexible on white space, omitting thousands separators
    */
  def parse(expression: String): js.Any = js.native
  def parse(expression: String, options: js.Object): js.Any = js.native
  /**
    *
    * @param options               OptionalAn object with the following properties:pattern (String, optional): override formatting patternwith this string.  Default value is based on locale.  Overriding this property will defeatlocalization.type (String, optional): choose a format type based on the locale from the following:decimal, scientific (not yet supported), percent, currency. decimal by default.locale (String, optional): override the locale used to determine formatting rulesstrict (Boolean, optional): strict parsing, false by default.  Strict parsing requires input as produced by the format() method.Non-strict is more permissive, e.g. flexible on white space, omitting thousands separatorsplaces (Number|String, optional): number of decimal places to accept: Infinity, a positive number, ora range "n,m".  Defined by pattern or Infinity if pattern not provided.
    */
  def regexp(options: js.Object): js.Any = js.native
}

