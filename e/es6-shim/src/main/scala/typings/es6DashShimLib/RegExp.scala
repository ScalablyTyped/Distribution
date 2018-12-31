package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExp extends js.Object {
  /**
    * Returns a string indicating the flags of the regular expression in question. This field is read-only.
    * The characters in this string are sequenced and concatenated in the following order:
    *
    *    - "g" for global
    *    - "i" for ignoreCase
    *    - "m" for multiline
    *    - "u" for unicode
    *    - "y" for sticky
    *
    * If no flags are set, the value is the empty string.
    */
  var flags: java.lang.String
}

