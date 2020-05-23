package typings.famous.physicsMod

import typings.famous.mathMod.Quaternion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRotationalSpringOptions extends IForceOptions {
  var anchor: js.UndefOr[Quaternion] = js.undefined
  var damping: js.UndefOr[Double] = js.undefined
  var dampingRatio: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var period: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[js.Function2[/* dist */ js.Any, /* rMax */ js.Any, Double]] = js.undefined
}

object IRotationalSpringOptions {
  @scala.inline
  def apply(
    anchor: Quaternion = null,
    damping: js.UndefOr[Double] = js.undefined,
    dampingRatio: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined,
    targets: js.Array[_] = null,
    `type`: (/* dist */ js.Any, /* rMax */ js.Any) => Double = null
  ): IRotationalSpringOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dampingRatio)) __obj.updateDynamic("dampingRatio")(dampingRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(js.Any.fromFunction2(`type`))
    __obj.asInstanceOf[IRotationalSpringOptions]
  }
}

