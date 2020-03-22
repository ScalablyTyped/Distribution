package typings.devextreme

import typings.devextreme.devextremeStrings.easeOutCubic
import typings.devextreme.devextremeStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[easeOutCubic | linear] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var maxPointCountSupported: js.UndefOr[Double] = js.undefined
}

object AnonDuration {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    easing: easeOutCubic | linear = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxPointCountSupported: Int | Double = null
  ): AnonDuration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (maxPointCountSupported != null) __obj.updateDynamic("maxPointCountSupported")(maxPointCountSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
}

