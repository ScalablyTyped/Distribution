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
  def apply(
    from: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

