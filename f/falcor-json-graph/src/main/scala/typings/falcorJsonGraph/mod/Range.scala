package typings.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe a range of integers. Must contain either a "to" or "length" property.
  **/
trait Range extends js.Object {
  var from: js.UndefOr[Double] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
}

object Range {
  @scala.inline
  def apply(from: Int | Double = null, length: Int | Double = null, to: Int | Double = null): Range = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

