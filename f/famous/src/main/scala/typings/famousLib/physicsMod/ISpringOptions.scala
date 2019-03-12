package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpringOptions extends IForceOptions {
  var anchor: js.UndefOr[famousLib.mathMod.Vec3] = js.undefined
  var damping: js.UndefOr[scala.Double] = js.undefined
  var dampingRatio: js.UndefOr[scala.Double] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var period: js.UndefOr[scala.Double] = js.undefined
  var stiffness: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[js.Function2[/* dist */ js.Any, /* rMax */ js.Any, scala.Double]] = js.undefined
}

object ISpringOptions {
  @scala.inline
  def apply(
    anchor: famousLib.mathMod.Vec3 = null,
    damping: scala.Int | scala.Double = null,
    dampingRatio: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    period: scala.Int | scala.Double = null,
    stiffness: scala.Int | scala.Double = null,
    targets: js.Array[_] = null,
    `type`: (/* dist */ js.Any, /* rMax */ js.Any) => scala.Double = null
  ): ISpringOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (dampingRatio != null) __obj.updateDynamic("dampingRatio")(dampingRatio.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets)
    if (`type` != null) __obj.updateDynamic("type")(js.Any.fromFunction2(`type`))
    __obj.asInstanceOf[ISpringOptions]
  }
}

