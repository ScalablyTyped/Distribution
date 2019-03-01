package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRotationalSpringOptions extends IForceOptions {
  var anchor: js.UndefOr[famousLib.mathMod.Quaternion] = js.undefined
  var damping: js.UndefOr[scala.Double] = js.undefined
  var dampingRatio: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var period: js.UndefOr[scala.Double] = js.undefined
  var stiffness: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[js.Function2[/* dist */ js.Any, /* rMax */ js.Any, scala.Double]] = js.undefined
}

object IRotationalSpringOptions {
  @scala.inline
  def apply(
    anchor: famousLib.mathMod.Quaternion = null,
    damping: scala.Int | scala.Double = null,
    dampingRatio: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    period: scala.Int | scala.Double = null,
    stiffness: scala.Int | scala.Double = null,
    targets: js.Array[_] = null,
    `type`: js.Function2[/* dist */ js.Any, /* rMax */ js.Any, scala.Double] = null
  ): IRotationalSpringOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (dampingRatio != null) __obj.updateDynamic("dampingRatio")(dampingRatio.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IRotationalSpringOptions]
  }
}

