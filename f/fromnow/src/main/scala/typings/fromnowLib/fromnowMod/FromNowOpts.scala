package typings
package fromnowLib.fromnowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromNowOpts extends js.Object {
  var and: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var suffix: js.UndefOr[scala.Boolean] = js.undefined
  var zero: js.UndefOr[scala.Boolean] = js.undefined
}

object FromNowOpts {
  @scala.inline
  def apply(
    and: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    suffix: js.UndefOr[scala.Boolean] = js.undefined,
    zero: js.UndefOr[scala.Boolean] = js.undefined
  ): FromNowOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(and)) __obj.updateDynamic("and")(and)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix)
    if (!js.isUndefined(zero)) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[FromNowOpts]
  }
}

