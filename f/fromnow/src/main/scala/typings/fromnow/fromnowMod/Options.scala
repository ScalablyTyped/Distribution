package typings.fromnow.fromnowMod

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
    max: Int | Double = null,
    suffix: js.UndefOr[Boolean] = js.undefined,
    zero: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(and)) __obj.updateDynamic("and")(and.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(zero)) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

