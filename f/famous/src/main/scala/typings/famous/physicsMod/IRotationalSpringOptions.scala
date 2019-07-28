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
    damping: Int | Double = null,
    dampingRatio: Int | Double = null,
    max: Int | Double = null,
    period: Int | Double = null,
    stiffness: Int | Double = null,
    targets: js.Array[_] = null,
    `type`: (/* dist */ js.Any, /* rMax */ js.Any) => Double = null
  ): IRotationalSpringOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (dampingRatio != null) __obj.updateDynamic("dampingRatio")(dampingRatio.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets)
    if (`type` != null) __obj.updateDynamic("type")(js.Any.fromFunction2(`type`))
    __obj.asInstanceOf[IRotationalSpringOptions]
  }
}

