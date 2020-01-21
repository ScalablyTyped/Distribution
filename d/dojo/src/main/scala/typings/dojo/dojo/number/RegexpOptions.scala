package typings.dojo.dojo.number

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__RegexpOptions.html
  *
  *
  */
@JSGlobal("dojo.number_.__RegexpOptions")
@js.native
class RegexpOptions () extends js.Object {
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

