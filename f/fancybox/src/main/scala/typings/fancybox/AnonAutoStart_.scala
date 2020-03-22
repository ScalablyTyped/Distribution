package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoStart_ extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object AnonAutoStart_ {
  @scala.inline
  def apply(autoStart: js.UndefOr[Boolean] = js.undefined, speed: Int | Double = null): AnonAutoStart_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoStart_]
  }
}

