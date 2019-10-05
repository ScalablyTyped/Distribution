package typings.dojo.dojo

import typings.dojo.dojo.currency.__FormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/currency.html
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
  def format(value: Double): js.Any = js.native
  def format(value: Double, options: __FormatOptions): js.Any = js.native
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
  def regexp(): js.Any = js.native
  def regexp(options: js.Object): js.Any = js.native
}

@JSGlobal("dojo.currency")
@js.native
object currency extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/currency.__FormatOptions.html
    *
    *
    */
  @js.native
  class __FormatOptions () extends js.Object {
    /**
      * an ISO4217 currency code, a three letter sequence like "USD".
      * For use with dojo.currency only.
      *
      */
    var currency: String = js.native
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
      * number of decimal places to show.  Default is defined based on which currency is used.
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
      * localized currency symbol. The default will be looked up in table of supported currencies in dojo.cldr
      * A ISO4217 currency code will be used if not found.
      *
      */
    var symbol: String = js.native
    /**
      * Should not be set.  Value is assumed to be "currency".
      *
      */
    var `type`: String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/currency.__ParseOptions.html
    *
    *
    */
  @js.native
  class __ParseOptions () extends js.Object {
    /**
      * an ISO4217 currency code, a three letter sequence like "USD".
      * For use with dojo.currency only.
      *
      */
    var currency: String = js.native
    /**
      * Whether to include the fractional portion, where the number of decimal places are implied by the currency
      * or explicit 'places' parameter.  The value [true,false] makes the fractional portion optional.
      * By default for currencies, it the fractional portion is optional.
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
      * fixed number of decimal places to accept.  The default is determined based on which currency is used.
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
      * localized currency symbol. The default will be looked up in table of supported currencies in dojo.cldr
      * A ISO4217 currency code will be used if not found.
      *
      */
    var symbol: String = js.native
    /**
      * Should not be set.  Value is assumed to be currency.
      *
      */
    var `type`: String = js.native
  }
  
}

