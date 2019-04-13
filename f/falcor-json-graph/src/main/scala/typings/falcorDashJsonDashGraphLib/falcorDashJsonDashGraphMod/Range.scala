package typings
package falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe a range of integers. Must contain either a "to" or "length" property.
  **/
trait Range extends js.Object {
  var from: js.UndefOr[scala.Double] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var to: js.UndefOr[scala.Double] = js.undefined
}

object Range {
  @scala.inline
  def apply(
    from: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

