package typings
package expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinMaxOptions extends js.Object {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object MinMaxOptions {
  @scala.inline
  def apply(max: scala.Int | scala.Double = null, min: scala.Int | scala.Double = null): MinMaxOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxOptions]
  }
}

