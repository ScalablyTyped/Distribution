package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinMaxExtendedOptions extends MinMaxOptions {
  var gt: js.UndefOr[Double] = js.undefined
  var lt: js.UndefOr[Double] = js.undefined
}

object MinMaxExtendedOptions {
  @scala.inline
  def apply(
    gt: Int | Double = null,
    lt: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): MinMaxExtendedOptions = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxExtendedOptions]
  }
}

