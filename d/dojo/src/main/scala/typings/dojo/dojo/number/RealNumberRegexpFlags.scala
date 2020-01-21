package typings.dojo.dojo.number

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__RealNumberRegexpFlags.html
  *
  *
  */
@JSGlobal("dojo.number_.__RealNumberRegexpFlags")
@js.native
class RealNumberRegexpFlags () extends js.Object {
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

