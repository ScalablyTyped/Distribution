package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.easeOutCubic
import typings.devextreme.devextremeStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseGauge.Options.animation */
trait BaseGaugeAnimation extends js.Object {
  /** @name BaseGauge.Options.animation.duration */
  var duration: js.UndefOr[Double] = js.undefined
  /** @name BaseGauge.Options.animation.easing */
  var easing: js.UndefOr[easeOutCubic | linear] = js.undefined
  /** @name BaseGauge.Options.animation.enabled */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object BaseGaugeAnimation {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    easing: easeOutCubic | linear = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): BaseGaugeAnimation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGaugeAnimation]
  }
}

