package typings.devextreme.anon

import typings.devextreme.devextremeStrings.easeOutCubic
import typings.devextreme.devextremeStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[easeOutCubic | linear] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var maxPointCountSupported: js.UndefOr[Double] = js.undefined
}

object Duration {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    easing: easeOutCubic | linear = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxPointCountSupported: js.UndefOr[Double] = js.undefined
  ): Duration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPointCountSupported)) __obj.updateDynamic("maxPointCountSupported")(maxPointCountSupported.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

