package typings.dojo.dojo.number

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__FormatOptions.html
  *
  *
  */
@JSGlobal("dojo.number_.__FormatOptions")
@js.native
class FormatOptions () extends js.Object {
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

