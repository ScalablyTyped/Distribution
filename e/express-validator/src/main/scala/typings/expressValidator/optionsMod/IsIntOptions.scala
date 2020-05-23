package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsIntOptions extends MinMaxExtendedOptions {
  var allow_leading_zeroes: js.UndefOr[Boolean] = js.undefined
}

object IsIntOptions {
  @scala.inline
  def apply(
    allow_leading_zeroes: js.UndefOr[Boolean] = js.undefined,
    gt: js.UndefOr[Double] = js.undefined,
    lt: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_leading_zeroes)) __obj.updateDynamic("allow_leading_zeroes")(allow_leading_zeroes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gt)) __obj.updateDynamic("gt")(gt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lt)) __obj.updateDynamic("lt")(lt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIntOptions]
  }
}

