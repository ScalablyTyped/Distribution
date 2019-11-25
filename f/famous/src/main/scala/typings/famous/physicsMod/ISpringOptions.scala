package typings.famous.physicsMod

import typings.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpringOptions extends IForceOptions {
  var anchor: js.UndefOr[Vec3] = js.undefined
  var damping: js.UndefOr[Double] = js.undefined
  var dampingRatio: js.UndefOr[Double] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var period: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[js.Function2[/* dist */ js.Any, /* rMax */ js.Any, Double]] = js.undefined
}

object ISpringOptions {
  @scala.inline
  def apply(
    anchor: Vec3 = null,
    damping: Int | Double = null,
    dampingRatio: Int | Double = null,
    length: Int | Double = null,
    maxLength: Int | Double = null,
    period: Int | Double = null,
    stiffness: Int | Double = null,
    targets: js.Array[_] = null,
    `type`: (/* dist */ js.Any, /* rMax */ js.Any) => Double = null
  ): ISpringOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (dampingRatio != null) __obj.updateDynamic("dampingRatio")(dampingRatio.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(js.Any.fromFunction2(`type`))
    __obj.asInstanceOf[ISpringOptions]
  }
}

