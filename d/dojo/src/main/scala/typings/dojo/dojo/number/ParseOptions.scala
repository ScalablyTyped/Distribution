package typings.dojo.dojo.number

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__ParseOptions.html
  *
  *
  */
@JSGlobal("dojo.number_.__ParseOptions")
@js.native
class ParseOptions () extends js.Object {
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

