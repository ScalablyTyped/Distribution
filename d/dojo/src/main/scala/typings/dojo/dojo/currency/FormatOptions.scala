package typings.dojo.dojo.currency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/currency.__FormatOptions.html
  *
  *
  */
@JSGlobal("dojo.currency.__FormatOptions")
@js.native
class FormatOptions () extends js.Object {
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

