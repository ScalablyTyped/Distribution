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
    max: Int | Double = null,
    strength: Int | Double = null,
    targets: js.Array[_] = null,
    `type`: /* v */ Double => Double = null
  ): IDragOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[IDragOptions]
  }
}

