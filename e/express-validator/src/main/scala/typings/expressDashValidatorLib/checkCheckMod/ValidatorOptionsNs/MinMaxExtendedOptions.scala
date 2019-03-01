package typings
package expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinMaxExtendedOptions extends MinMaxOptions {
  var gt: js.UndefOr[scala.Double] = js.undefined
  var lt: js.UndefOr[scala.Double] = js.undefined
}

object MinMaxExtendedOptions {
  @scala.inline
  def apply(
    gt: scala.Int | scala.Double = null,
    lt: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): MinMaxExtendedOptions = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxExtendedOptions]
  }
}

