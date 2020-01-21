package typings.dojo.dojo.number

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/number.__IntegerRegexpFlags.html
  *
  *
  */
@JSGlobal("dojo.number_.__IntegerRegexpFlags")
@js.native
class IntegerRegexpFlags () extends js.Object {
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

