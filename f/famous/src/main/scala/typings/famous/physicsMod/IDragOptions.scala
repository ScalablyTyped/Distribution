package typings.famous.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragOptions extends IForceOptions {
  var max: js.UndefOr[Double] = js.undefined
  var strength: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.undefined
}

object IDragOptions {
  @scala.inline
  def apply(
    max: js.UndefOr[Double] = js.undefined,
    strength: js.UndefOr[Double] = js.undefined,
    targets: js.Array[_] = null,
    `type`: /* v */ Double => Double = null
  ): IDragOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strength)) __obj.updateDynamic("strength")(strength.get.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[IDragOptions]
  }
}

