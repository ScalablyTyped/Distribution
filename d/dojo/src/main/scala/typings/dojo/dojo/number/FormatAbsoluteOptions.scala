package typings.dojo.dojo.number

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__FormatAbsoluteOptions.html
  *
  *
  */
@JSGlobal("dojo.number_.__FormatAbsoluteOptions")
@js.native
class FormatAbsoluteOptions () extends js.Object {
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

