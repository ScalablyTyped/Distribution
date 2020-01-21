package typings.dojo.dojo.currency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/currency.__ParseOptions.html
  *
  *
  */
@JSGlobal("dojo.currency.__ParseOptions")
@js.native
class ParseOptions () extends js.Object {
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

