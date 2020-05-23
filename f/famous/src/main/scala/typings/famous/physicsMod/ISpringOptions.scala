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
    damping: js.UndefOr[Double] = js.undefined,
    dampingRatio: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined,
    targets: js.Array[_] = null,
    `type`: (/* dist */ js.Any, /* rMax */ js.Any) => Double = null
  ): ISpringOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dampingRatio)) __obj.updateDynamic("dampingRatio")(dampingRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(js.Any.fromFunction2(`type`))
    __obj.asInstanceOf[ISpringOptions]
  }
}

