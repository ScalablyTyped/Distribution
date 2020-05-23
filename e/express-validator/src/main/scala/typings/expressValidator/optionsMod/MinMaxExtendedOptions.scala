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
    gt: js.UndefOr[Double] = js.undefined,
    lt: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): MinMaxExtendedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gt)) __obj.updateDynamic("gt")(gt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lt)) __obj.updateDynamic("lt")(lt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxExtendedOptions]
  }
}

