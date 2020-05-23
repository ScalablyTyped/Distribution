package typings.fromnow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var and: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[Boolean] = js.undefined
  var zero: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    and: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    suffix: js.UndefOr[Boolean] = js.undefined,
    zero: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(and)) __obj.updateDynamic("and")(and.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zero)) __obj.updateDynamic("zero")(zero.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

