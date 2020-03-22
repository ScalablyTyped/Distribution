package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.easeOutCubic
import typings.devextreme.devextremeStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies animation options. */
trait BaseGaugeAnimation extends js.Object {
  /** Determines how long animation runs. */
  var duration: js.UndefOr[Double] = js.undefined
  /** Specifies the animation easing mode. */
  var easing: js.UndefOr[easeOutCubic | linear] = js.undefined
  /** Indicates whether or not animation is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object BaseGaugeAnimation {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    easing: easeOutCubic | linear = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): BaseGaugeAnimation = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGaugeAnimation]
  }
}

