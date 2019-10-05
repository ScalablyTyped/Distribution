package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.html
  *
  * localized formatting and parsing routines for Number
  *
  */
@js.native
trait number_ extends js.Object {
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

@JSGlobal("dojo.number_")
@js.native
object number_ extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__FormatAbsoluteOptions.html
    *
    *
    */
  @js.native
  class __FormatAbsoluteOptions () extends js.Object {
    /**
      * the decimal separator
      *
      */
    var decimal: String = js.native
    /**
      * the group separator
      *
      */
    var group: String = js.native
    /**
      * number of decimal places.  the range "n,m" will format to m places.
      *
      */
    var places: Double = js.native
    /**
      * 5 rounds to nearest .5; 0 rounds to nearest whole (default). -1
      * means don't round.
      *
      */
    var round: Double = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__FormatOptions.html
    *
    *
    */
  @js.native
  class __FormatOptions () extends js.Object {
    /**
      * If false, show no decimal places, overriding places and pattern settings.
      *
      */
    var fractional: Boolean = js.native
    /**
      * override the locale used to determine formatting rules
      *
      */
    var locale: String = js.native
    /**
      * override formatting pattern
      * with this string.  Default value is based on locale.  Overriding this property will defeat
      * localization.  Literal characters in patterns are not supported.
      *
      */
    var pattern: String = js.native
    /**
      * fixed number of decimal places to show.  This overrides any
      * information in the provided pattern.
      *
      */
    var places: Double = js.native
    /**
      * 5 rounds to nearest .5; 0 rounds to nearest whole (default). -1
      * means do not round.
      *
      */
    var round: Double = js.native
    /**
      * choose a format type based on the locale from the following:
      * decimal, scientific (not yet supported), percent, currency. decimal by default.
      *
      */
    var `type`: String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__IntegerRegexpFlags.html
    *
    *
    */
  @js.native
  class __IntegerRegexpFlags () extends js.Object {
    /**
      * group size between separators
      *
      */
    var groupSize: Double = js.native
    /**
      * second grouping, where separators 2..n have a different interval than the first separator (for India)
      *
      */
    var groupSize2: Double = js.native
    /**
      * The character used as the thousands separator. Default is no
      * separator. For more than one symbol use an array, e.g. [",", ""],
      * makes ',' optional.
      *
      */
    var separator: String = js.native
    /**
      * The leading plus-or-minus sign. Can be true, false, or [true,false].
      * Default is [true, false], (i.e. will match if it is signed
      * or unsigned).
      *
      */
    var signed: Boolean = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__ParseOptions.html
    *
    *
    */
  @js.native
  class __ParseOptions () extends js.Object {
    /**
      * Whether to include the fractional portion, where the number of decimal places are implied by pattern
      * or explicit 'places' parameter.  The value [true,false] makes the fractional portion optional.
      *
      */
    var fractional: Boolean = js.native
    /**
      * override the locale used to determine formatting rules
      *
      */
    var locale: String = js.native
    /**
      * override formatting pattern
      * with this string.  Default value is based on locale.  Overriding this property will defeat
      * localization.  Literal characters in patterns are not supported.
      *
      */
    var pattern: String = js.native
    /**
      * strict parsing, false by default.  Strict parsing requires input as produced by the format() method.
      * Non-strict is more permissive, e.g. flexible on white space, omitting thousands separators
      *
      */
    var strict: Boolean = js.native
    /**
      * choose a format type based on the locale from the following:
      * decimal, scientific (not yet supported), percent, currency. decimal by default.
      *
      */
    var `type`: String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__RealNumberRegexpFlags.html
    *
    *
    */
  @js.native
  class __RealNumberRegexpFlags () extends js.Object {
    /**
      * A string for the character used as the decimal point.  Default
      * is ".".
      *
      */
    var decimal: String = js.native
    /**
      * The leading plus-or-minus sign on the exponent.  Can be true,
      * false, or [true, false].  Default is [true, false], (i.e. will
      * match if it is signed or unsigned).  flags in regexp.integer can be
      * applied.
      *
      */
    var eSigned: Boolean = js.native
    /**
      * Express in exponential notation.  Can be true, false, or [true,
      * false]. Default is [true, false], (i.e. will match if the
      * exponential part is present are not).
      *
      */
    var exponent: Boolean = js.native
    /**
      * Whether decimal places are used.  Can be true, false, or [true,
      * false].  Default is [true, false] which means optional.
      *
      */
    var fractional: Boolean = js.native
    /**
      * The integer number of decimal places or a range given as "n,m".  If
      * not given, the decimal part is optional and the number of places is
      * unlimited.
      *
      */
    var places: Double = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__RegexpOptions.html
    *
    *
    */
  @js.native
  class __RegexpOptions () extends js.Object {
    /**
      * override the locale used to determine formatting rules
      *
      */
    var locale: String = js.native
    /**
      * override formatting pattern
      * with this string.  Default value is based on locale.  Overriding this property will defeat
      * localization.
      *
      */
    var pattern: String = js.native
    /**
      * number of decimal places to accept: Infinity, a positive number, or
      * a range "n,m".  Defined by pattern or Infinity if pattern not provided.
      *
      */
    var places: Double = js.native
    /**
      * strict parsing, false by default.  Strict parsing requires input as produced by the format() method.
      * Non-strict is more permissive, e.g. flexible on white space, omitting thousands separators
      *
      */
    var strict: Boolean = js.native
    /**
      * choose a format type based on the locale from the following:
      * decimal, scientific (not yet supported), percent, currency. decimal by default.
      *
      */
    var `type`: String = js.native
  }
  
}

