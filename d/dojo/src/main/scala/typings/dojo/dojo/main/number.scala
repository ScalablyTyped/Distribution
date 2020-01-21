package typings.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.number.html
  *
  * localized formatting and parsing routines for Number
  *
  */
@js.native
trait number extends js.Object {
  /**
    * Format a Number as a String, using locale-specific settings
    * Create a string from a Number using a known localized pattern.
    * Formatting patterns appropriate to the locale are chosen from the
    * Common Locale Data Repository as well as the appropriate symbols and
    * delimiters.
    * If value is Infinity, -Infinity, or is not a valid JavaScript number, return null.
    *
    * @param value the number to be formatted
    * @param options               OptionalAn object with the following properties:pattern (String, optional): override formatting patternwith this string.  Default value is based on locale.  Overriding this property will defeatlocalization.  Literal characters in patterns are not supported.type (String, optional): choose a format type based on the locale from the following:decimal, scientific (not yet supported), percent, currency. decimal by default.places (Number, optional): fixed number of decimal places to show.  This overrides anyinformation in the provided pattern.round (Number, optional): 5 rounds to nearest .5; 0 rounds to nearest whole (default). -1means do not round.locale (String, optional): override the locale used to determine formatting rulesfractional (Boolean, optional): If false, show no decimal places, overriding places and pattern settings.
    */
  def format(value: Double): js.Any = js.native
  def format(value: Double, options: js.Object): js.Any = js.native
  /**
    * Convert a properly formatted string to a primitive Number, using
    * locale-specific settings.
    * Create a Number from a string using a known localized pattern.
    * Formatting patterns are chosen appropriate to the locale
    * and follow the syntax described by
    * unicode.org TR35
    * Note that literal characters in patterns are not supported.
    *
    * @param expression A string representation of a Number
    * @param options               OptionalAn object with the following properties:pattern (String, optional): override formatting patternwith this string.  Default value is based on locale.  Overriding this property will defeatlocalization.  Literal characters in patterns are not supported.type (String, optional): choose a format type based on the locale from the following:decimal, scientific (not yet supported), percent, currency. decimal by default.locale (String, optional): override the locale used to determine formatting rulesstrict (Boolean, optional): strict parsing, false by default.  Strict parsing requires input as produced by the format() method.Non-strict is more permissive, e.g. flexible on white space, omitting thousands separatorsfractional (Boolean|Array, optional): Whether to include the fractional portion, where the number of decimal places are implied by patternor explicit 'places' parameter.  The value [true,false] makes the fractional portion optional.
    */
  def parse(expression: String): Double = js.native
  def parse(expression: String, options: js.Object): Double = js.native
  /**
    * Builds the regular needed to parse a number
    * Returns regular expression with positive and negative match, group
    * and decimal separators
    *
    * @param options               OptionalAn object with the following properties:pattern (String, optional): override formatting patternwith this string.  Default value is based on locale.  Overriding this property will defeatlocalization.type (String, optional): choose a format type based on the locale from the following:decimal, scientific (not yet supported), percent, currency. decimal by default.locale (String, optional): override the locale used to determine formatting rulesstrict (Boolean, optional): strict parsing, false by default.  Strict parsing requires input as produced by the format() method.Non-strict is more permissive, e.g. flexible on white space, omitting thousands separatorsplaces (Number|String, optional): number of decimal places to accept: Infinity, a positive number, ora range "n,m".  Defined by pattern or Infinity if pattern not provided.
    */
  def regexp(): js.Any = js.native
  def regexp(options: js.Object): js.Any = js.native
  /**
    * Rounds to the nearest value with the given number of decimal places, away from zero
    * Rounds to the nearest value with the given number of decimal places, away from zero if equal.
    * Similar to Number.toFixed(), but compensates for browser quirks. Rounding can be done by
    * fractional increments also, such as the nearest quarter.
    * NOTE: Subject to floating point errors.  See dojox/math/round for experimental workaround.
    *
    * @param value The number to round
    * @param places               OptionalThe number of decimal places where rounding takes place.  Defaults to 0 for whole rounding.Must be non-negative.
    * @param increment               OptionalRounds next place to nearest value of increment/10.  10 by default.
    */
  def round(value: Double): Double = js.native
  def round(value: Double, places: Double): Double = js.native
  def round(value: Double, places: Double, increment: Double): Double = js.native
}

